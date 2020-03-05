package com.example.myorder.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class StringToSha1 {

    public static String toSha1(String string){
        return DigestUtils.sha1Hex(string);
    }
}
