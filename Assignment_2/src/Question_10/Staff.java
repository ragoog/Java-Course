package Question_10;

public class Staff extends Employee {

    public String title;

    public Staff(String name, int salary, String title) {
        super(name, salary);
        this.title = title;
    }
    public String toString()
    {   return super.toString();}
}
