package Question_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<5; i++)
        {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            list.add(num);
        }
        //sorting array list ascendingly
        Collections.sort(list);

        System.out.println("Numbers in increasing order: ");
        System.out.println(list);
    }
}
