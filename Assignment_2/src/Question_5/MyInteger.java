package Question_5;

public class MyInteger
{
    //data field
    public int value;

    //constructor
    public MyInteger (int value)
    {
        this.value = value;
    }

    //getter
    public int getValue() {
        return value;
    }

    public boolean isEven()
    {
        return value % 2 == 0;

    }

    public boolean isOdd()
    {
        return value % 2 != 0;
    }

    public boolean isPrime ()
    {
        if (value <=1)
        {
            return false;
        }

        for (int i = 2; i<value; i++ )
        {
            if (value % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(int value)
    {
        return value % 2 == 0;

    }

    public static boolean isOdd(int value)
    {
        return value % 2 != 0;
    }

    public static boolean isPrime (int value)
    {
        if (value <=1)
        {
            return false;
        }

        for (int i = 2; i<value; i++ )
        {
            if (value % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger integer)
    {
        return integer.value % 2 == 0;

    }

    public static boolean isOdd(MyInteger integer)
    {
        return integer.value % 2 != 0;
    }

    public boolean isPrime (MyInteger integer)
    {
        if (integer.value <=1)
        {
            return false;
        }

        for (int i = 2; i<integer.value; i++ )
        {
            if (integer.value % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int value) {
       return this.value == value;
    }

    public boolean equals (MyInteger integer)
    {
        return this.value == integer.value;
    }
}
