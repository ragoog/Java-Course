package Question_5;

import static Question_5.MyInteger.*;
import static Question_5.MyInteger.isEven;

public class Main {
   public static void main(String[] args)
   {
    MyInteger integer1 = new MyInteger(5);
    MyInteger integer2 = new MyInteger(10);
    MyInteger integer3 = new MyInteger(15);

    System.out.println("integer = " + integer1.getValue());
    System.out.println("even: " + integer1.isEven());
    System.out.println("odd: " + integer1.isOdd());
    System.out.println("prime : " + integer1.isPrime());


    System.out.println("integer = " + integer2.getValue());
    System.out.println("even: " + isEven(10));
    System.out.println("odd: " + isOdd(10));
    System.out.println("prime : " +MyInteger.isPrime(10) );

    System.out.println("integer = " + integer3.getValue());
    System.out.println("even: " + MyInteger.isEven(integer3));
    System.out.println("odd: " + MyInteger.isOdd(integer3));
    System.out.println("prime: " + MyInteger.isPrime(integer3.getValue()));
   }
}
