package com.xdma5.jenkintest;

import java.io.File;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException{
        System.out.println("Jenkins test");
        File newFile = new File("hi");
        newFile.getParentFile().mkdirs();
        newFile.createNewFile();
    }
}
