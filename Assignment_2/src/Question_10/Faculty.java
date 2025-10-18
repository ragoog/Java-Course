package Question_10;

public class Faculty extends Employee {

    public String office_hours;
    public String rank;

    public Faculty(String name, int salary, String office_hours, String rank) {
        super(name, salary);
        this.office_hours = office_hours;
        this.rank = rank;
    }

    public String toString()
    {   return super.toString();}

}
