package loveProgramming;

public class Calculate {
    private int a;
    private int b;
    private int c;

    public Calculate() {
        System.out.println("Cannot do Calculations without any Inputs!!");

    }

    public Calculate(int a) {
        this.a = a;
        this.b = 0;
        this.c = 0;

    }

    public Calculate(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 0;

    }

    public Calculate(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void getResult() {
        if (this.a == 0 && this.b == 0 && this.c == 0) {
            System.out.println("Cannot do Calculations without any Inputs!!");
        } else {
            System.out.println("Result is " + (a + b + c));
        }
    }
}


