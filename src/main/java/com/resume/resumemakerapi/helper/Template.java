package com.resume.resumemakerapi.helper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.resume.resumemakerapi.ResumeMakerApiApplication;

public class Template {

    static {
        try {
            InputStream resourceAsStream = ResumeMakerApiApplication.class.getClassLoader().getResourceAsStream("static/head-data.html");
            byte[] ba = new byte[resourceAsStream.available()];
            resourceAsStream.read(ba);
            HEAD = new String(ba);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static String TOP = "<!DOCTYPE html><html>";

    public static String HEAD;

    public static String BODY = "<body>";

    public static String FOOTER = "</body></html>";

}
