package com.huize.qixin.api.util;

import java.security.*;
import java.net.*;
import java.io.*;
import java.security.cert.*;
import javax.net.ssl.*;

public class HttpUtil
{
    public static String post(final String url, final String content) throws Exception {
        return post(url, content, 40000, 50000, "application/json");
    }
    
    public static String post(final String url, final String content, final String mimeType) throws Exception {
        return post(url, content, 40000, 50000, mimeType);
    }
    
    public static String post(final String url, final String content, final int connectTimeout, final int readTimeout, final String mimeType) throws Exception {
        HttpURLConnection conn = null;
        HttpsURLConnection connHttps = null;
        try {
            final URL consoleUrl = new URL(url);
            if (url.contains("https")) {
                connHttps = (HttpsURLConnection)consoleUrl.openConnection();
                final SSLContext sc = SSLContext.getInstance("SSL");
                sc.init(null, new TrustManager[] { new TrustAnyTrustManager() }, new SecureRandom());
                connHttps.setSSLSocketFactory(sc.getSocketFactory());
                connHttps.setHostnameVerifier(new TrustAnyHostnameVerifier());
                return post(connHttps, content, connectTimeout, readTimeout, mimeType);
            }
            conn = (HttpURLConnection)consoleUrl.openConnection();
            return post(conn, content, connectTimeout, readTimeout, mimeType);
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            if (conn != null) {
                conn.disconnect();
            }
            if (connHttps != null) {
                connHttps.disconnect();
            }
        }
    }
    
    private static String post(final HttpURLConnection connection, final String params, final int connectTimeout, final int readTimeout, final String mimeType) throws Exception {
        BufferedReader br = null;
        InputStreamReader inr = null;
        InputStream ins = null;
        OutputStreamWriter out = null;
        try {
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Accept", mimeType);
            connection.setRequestProperty("Content-Type", mimeType);
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            connection.connect();
            connection.setConnectTimeout(connectTimeout);
            connection.setReadTimeout(readTimeout);
            out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8");
            out.append((CharSequence)params);
            out.flush();
            ins = connection.getInputStream();
            final String charset = "UTF-8";
            inr = new InputStreamReader(ins, charset);
            br = new BufferedReader(inr);
            String line = "";
            final StringBuffer sb = new StringBuffer();
            do {
                sb.append(line);
                line = br.readLine();
            } while (line != null);
            final int status = connection.getResponseCode();
            if (status == 200) {
                return sb.toString();
            }
            throw new RuntimeException(sb.toString());
        }
        catch (Exception e) {
            throw e;
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (inr != null) {
                    inr.close();
                }
                if (ins != null) {
                    ins.close();
                }
                if (out != null) {
                    out.close();
                }
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
    
    private static class TrustAnyTrustManager implements X509TrustManager
    {
        @Override
        public void checkClientTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
        }
        
        @Override
        public void checkServerTrusted(final X509Certificate[] chain, final String authType) throws CertificateException {
        }
        
        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }
    
    private static class TrustAnyHostnameVerifier implements HostnameVerifier
    {
        @Override
        public boolean verify(final String hostname, final SSLSession session) {
            return true;
        }
    }
}
