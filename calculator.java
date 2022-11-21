import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("welcome to calculator");
        System.out.println("please enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter your choice");
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.exit");
        int n=sc.nextInt();

        switch (n)
        {
            case 1:
                int sum=a+b;
                System.out.println("sum of numbers" +"\t" +a +"and "+b + "is:"+sum);

        }
    }
}
