package Question_10;

public class Student extends Person {

    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR =3;
    public static final int SENIOR =4;
    private int status;

    public Student(String name, int status) {
        super(name);
        this.status = status;

    }
    public String toString()
    {
        return super.toString();
    }

}
