package io;

import java.io.*;
import java.util.*;

public class IO_PRACTICE {

    public void testDemo() throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("/home/yang/demo.txt"));
        String line ;

        while((line = reader.readLine()) != null){
            int count = 0;
            HashMap<String,String> map = new HashMap<>();
            for (String str : line.split(" ")) {
                System.out.println(str);
                if (count>=4){
                    String[] strings=str.split(":");
                    map.put(strings[0],strings[1]);
                }
                count++;
            }
            for (Map.Entry entry:map.entrySet()){
                System.out.println("键为 :"+entry.getKey()+"   "+"值为 :"+entry.getValue());
            }
            System.out.println("\n");
        }

    }

    public static void main(String[] args) throws IOException{
        IO_PRACTICE practice = new IO_PRACTICE();
          practice.testDemo();
    }

}
