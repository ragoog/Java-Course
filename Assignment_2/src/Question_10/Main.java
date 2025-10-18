package Question_10;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student ("Ragia", 1);
        System.out.println(s1);

        Employee e1 = new Employee ("Ragia", 100000000);
        System.out.println(e1);

        Faculty f1 = new Faculty ("Ragia", 100000, "Monday, 10 AM" , "Prof");
        System.out.println(f1);

        Staff s = new Staff ("Ragia", 100000, "Prof");
        System.out.println(s);
    }
}
