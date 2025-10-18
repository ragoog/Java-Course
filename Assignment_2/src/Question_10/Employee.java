package Question_10;

import java.util.Date;

public class Employee extends Person {
    public String office;
    private int salary;
    public Date dateHired;

    public Employee(String name, int salary, Date date) {
        super(name);
        this.salary = salary;
        dateHired = date;
    }

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString()
    {   return getClass().getSimpleName() + ", Name= " + getName();}
}
