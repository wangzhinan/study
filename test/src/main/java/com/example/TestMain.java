package com.example;

import com.example.filter.*;
import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkMeta;
import net.dongliu.apk.parser.bean.IconFace;
import net.dongliu.apk.parser.bean.UseFeature;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Author: wangzn
 * DateTime: 2018/11/2 14:08
 */
public class TestMain {


    public static void main(String[] args) {

    }


    @Test
    public void testFilerChain(){
        FilterChain filterChain = new FilterChain();
        filterChain.add(new LeftBracketFilter());
        filterChain.add(new RightBracketFilter());
        Response response = new Response("response");
        Request request = new Request("request");
        filterChain.doFilter(request,response);

        System.out.println("request = " + request.getBody());
        System.out.println("response = " + response.getBody());

    }

    @Test
    public void testGetApkInfo(){
        ApkFile apkFile = null ;
        try {
            apkFile = new ApkFile(new File("C:/Users/wangzn/Desktop/台州/tzydjw-release-v1.04-.apk"));
            ApkMeta apkMeta = apkFile.getApkMeta();
            List<IconFace> allIcons = apkFile.getAllIcons();
            for (IconFace iconFace :allIcons){
                System.out.println(iconFace.getPath().substring(iconFace.getPath().lastIndexOf("/")));
                File file = new File("C:/Users/wangzn/Desktop/test"+
                        iconFace.getPath().substring(iconFace.getPath().lastIndexOf("/")));
                OutputStream outputStream = new FileOutputStream(file);
                outputStream.write(iconFace.getData());
                outputStream.flush();
                outputStream.close();
            }
            System.out.println(apkMeta);
            for (UseFeature feature : apkMeta.getUsesFeatures()) {
                System.out.println(feature.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
