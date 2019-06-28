package com.huize.qixin.api.util;

import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileUtil
{
    public static boolean downloadFile(final String fileUrl, String fileLocal) throws Exception {
        boolean flag = false;
        final URL url = new URL(fileUrl);
        final HttpURLConnection urlCon = (HttpURLConnection)url.openConnection();
        if (urlCon.getResponseCode() == 200) {
            final String str = urlCon.getHeaderField("Content-Disposition");
            final String filename = str.split("filename=")[1].replace("\"", "");
            fileLocal += filename;
        }
        urlCon.setConnectTimeout(6000);
        urlCon.setReadTimeout(6000);
        final int code = urlCon.getResponseCode();
        if (code != 200) {
            throw new Exception("文件读取失败");
        }
        final DataInputStream in = new DataInputStream(urlCon.getInputStream());
        final DataOutputStream out = new DataOutputStream(new FileOutputStream(fileLocal));
        final byte[] buffer = new byte[2048];
        int count = 0;
        while ((count = in.read(buffer)) > 0) {
            out.write(buffer, 0, count);
        }
        try {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        flag = true;
        return flag;
    }
    
    public static void main(final String[] args) {
        try {
            downloadFile("https://cps.qixin18.com/policy/download?id=xRyympbUXGhOs8hnPw2KUA!!", "D:\\logs\\");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
