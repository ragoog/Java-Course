package Question_5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File ("/Users/ragiatarek/Java-Course/Assignment_4/src/Question_5/file.txt");

        PrintWriter out = new PrintWriter(file);

        Random rand = new Random();

        for (int i=0; i<100 ; i++)
        {
            int num = rand.nextInt(100);
            out.print(num + " ");
        }

        out.close();

        Scanner in = new Scanner(file);
        ArrayList <Integer> list =  new ArrayList();
        while (in.hasNextInt())
        {
            list.add(in.nextInt());
        }

        in.close();

        Collections.sort(list);

        System.out.println("Numbers in increasing order: ");
        for (int num : list)
            {
            System.out.print(num + " ");
            }
    }

}
