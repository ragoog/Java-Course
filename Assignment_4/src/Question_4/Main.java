package Question_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/ragiatarek/Java-Course/Assignment_4/src/Question_4/Text.txt");
        Scanner input = new Scanner(file);
        System.out.println("Original file: ");

        //word i want to remove
        String word = "ragia";

        //put the file content into a string
        String content = "";


        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);  // print the line
            content += line + "\n";    // store it
        }

        input.close();

        String update = content.replace ("ragia", "");

        PrintWriter out = new PrintWriter (file);

        out.print(update);
        out.close();

        System.out.println("\nUpdated file: ");
        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            System.out.print(line);
        }

    }
}

