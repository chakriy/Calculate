package loveProgramming;

public class MyMain {
    public static void main(String[] args)
    {
        Calculate c1 = new Calculate();
        System.out.println("************");
        Calculate c2 = new Calculate(5);
        Calculate c3 = new Calculate(4,7);
        Calculate c4 = new Calculate(6,7,8);
        c1.getResult();
        c2.getResult();
        c3.getResult();
        c4.getResult();
        

    }

    }

