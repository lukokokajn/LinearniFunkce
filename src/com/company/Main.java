package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Promena> pro = new ArrayList<>();
        int count = 0;
        int countdistict = 0;
//1, 2 Část
        try {
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            String nextline = br.readLine();
            while (nextline != null) {
                int a = Integer.parseInt(nextline.substring(4, 5));
                int b = Integer.parseInt(nextline.substring(9));
                Promena gg = new Promena(a, b);
                //4 část
                if (arr.contains(nextline)) {

                } else {
                    countdistict++;
                }
                pro.add(gg);
                arr.add(nextline);
                nextline = br.readLine();
                count++;


            }
            // System.out.println(countdistict);
            // System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
//3 Část
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter("count.txt"));
            wr.write(count);
            wr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//4 Část
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter("count_distinct.txt"));
            wr.write(countdistict);
            wr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
