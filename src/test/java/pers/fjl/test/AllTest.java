package pers.fjl.test;

import org.junit.Test;
import pers.fjl.papercheck.file.FileInput;
import pers.fjl.papercheck.service.impl.SimHashImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;

public class AllTest  {

    String origin="orig.txt";
    String[] s={
            "orig_0.8_add.txt",
            "orig_0.8_del.txt",
            "orig_0.8_dis_1.tx",
            "orig_0.8_dis_10.txt",
            "orig_0.8_dis_15.txt"};
    @org.junit.Test
    public  void readFile() throws IOException, FileNotFoundException {
        for(int i=0;i<5;i++) {
            if (s[i].endsWith(".txt")==false) {
                throw new FileNotFoundException("传递的文件不是txt文件");
            }

            if (!s[i].endsWith(".txt")) {
                throw new IOException();
            }
        }
        System.out.println("路径没有问题，读取文件");
    }

    @org.junit.Test
    public void addTest(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[0]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("相似度："+(100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void delTest(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[1]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("相似度："+(100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void dis_1Test(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[2]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("相似度："+(100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void dis_10Test(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[3]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("相似度："+(100-distance*100/128)+"%");
    }

    @org.junit.Test
    public void dis_15Test(){
        FileInput fileInput = new FileInput();
        SimHashImpl hash1 = new SimHashImpl(fileInput.readString(origin), 64);
        hash1.subByDistance(hash1, 3);
        SimHashImpl hash2 = new SimHashImpl(fileInput.readString(s[4]), 64);
        hash2.subByDistance(hash2, 3);
        double distance = hash1.getDistance(hash1.getStrSimHash(),hash2.getStrSimHash());
        System.out.println("相似度："+(100-distance*100/128)+"%");
    }



}
