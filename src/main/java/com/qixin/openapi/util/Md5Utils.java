package com.qixin.openapi.util;

import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import java.io.File;
import java.security.MessageDigest;

public class Md5Utils
{
    private static char[] hexDigits;
    private static MessageDigest messagedigest;
    
    public static String getFileMD5String(final File file) throws IOException {
        final FileInputStream in = new FileInputStream(file);
        final FileChannel ch = in.getChannel();
        final MappedByteBuffer byteBuffer = ch.map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
        Md5Utils.messagedigest.update(byteBuffer);
        in.close();
        return bufferToHex(Md5Utils.messagedigest.digest());
    }
    
    public static String getMD5String(final String s) {
        return getMD5String(s.getBytes());
    }
    
    public static String getMD5String(final byte[] bytes) {
        synchronized (Md5Utils.messagedigest) {
            Md5Utils.messagedigest.update(bytes);
            return bufferToHex(Md5Utils.messagedigest.digest());
        }
    }
    
    private static String bufferToHex(final byte[] bytes) {
        return bufferToHex(bytes, 0, bytes.length);
    }
    
    private static String bufferToHex(final byte[] bytes, final int m, final int n) {
        final StringBuffer stringbuffer = new StringBuffer(2 * n);
        for (int k = m + n, l = m; l < k; ++l) {
            appendHexPair(bytes[l], stringbuffer);
        }
        return stringbuffer.toString();
    }
    
    private static void appendHexPair(final byte bt, final StringBuffer stringbuffer) {
        final char c0 = Md5Utils.hexDigits[(bt & 0xF0) >> 4];
        final char c2 = Md5Utils.hexDigits[bt & 0xF];
        stringbuffer.append(c0);
        stringbuffer.append(c2);
    }
    
    public static boolean checkPassword(final String password, final String md5PwdStr) {
        final String s = getMD5String(password);
        return s.equals(md5PwdStr);
    }
    
    public static Object byteToObject(final byte[] bytes) {
        Object obj = null;
        try {
            final ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
            final ObjectInputStream oi = new ObjectInputStream(bi);
            obj = oi.readObject();
            bi.close();
            oi.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
    
    public static byte[] objectToByte(final Object obj) {
        byte[] bytes = null;
        ByteArrayOutputStream bo = null;
        ObjectOutputStream oo = null;
        try {
            bo = new ByteArrayOutputStream();
            oo = new ObjectOutputStream(bo);
            oo.writeObject(obj);
            bytes = bo.toByteArray();
        }
        catch (Exception e) {
            e.printStackTrace();
            try {
                bo.close();
                oo.close();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        finally {
            try {
                bo.close();
                oo.close();
            }
            catch (IOException e3) {
                e3.printStackTrace();
            }
        }
        return bytes;
    }
    
    public static String fileHash(final byte[] data) {
        String result = null;
        for (int i = 0; i < data.length; ++i) {
            result += Integer.toString((data[i] & 0xFF) + 256, 16).substring(1);
        }
        return result;
    }
    
    public static String getUtf8MD5String(final String s) {
        try {
            final byte[] bytes = s.getBytes("utf-8");
            return getMD5String(bytes);
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
    
    static {
        Md5Utils.hexDigits = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        Md5Utils.messagedigest = null;
        try {
            Md5Utils.messagedigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
