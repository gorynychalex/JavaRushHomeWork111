package test;

import java.io.*;
import java.util.List;

/**
 * Created by Administrator on 25.12.2015.
 */
public class test01
{
    public static void main(String[] args) throws Exception
    {
        System.out.print("Input file: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());
        System.out.println();
        System.out.print("Output file: ");
        FileOutputStream fileOutputStream = new FileOutputStream(bufferedReader.readLine());
        System.out.println("Copy data from file1 to file2 ");
        byte[] buffer = new byte[1000];
        while(fileInputStream.available() > 0){
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer, 0, count);
            System.out.print(".");
        }

        fileInputStream.close();
        fileOutputStream.close();
    }


}
