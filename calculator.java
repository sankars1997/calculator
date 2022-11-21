import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        System.out.println("welcome to calculator");
        System.out.println("enter your choice");
        System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.exit");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();




        switch (n)
        {
            case 1:
                System.out.println("please enter two numbers");

                int a =sc.nextInt();
                int b=sc.nextInt();
                int sum=a+b;
                System.out.println("sum of numbers" +"\t" +a +"and "+b + "is:"+sum);
                break;
            case 2:
                System.out.println("please enter two numbers");

                int a1 =sc.nextInt();
                int b1=sc.nextInt();
                int sub=a1-b1;
                System.out.println("substraction of numbers" +"\t" +a1 +"and "+b1 + "is:"+sub);
                break;
            case 3:
                System.out.println("please enter two numbers");

                int a2 =sc.nextInt();
                int b2=sc.nextInt();
                int mul=a2*b2;
                System.out.println("multiplication of numbers" +"\t" +a2 +"and "+b2 + "is:"+mul);
                break;
            case 4:
                System.out.println("please enter two numbers");

                int a3 =sc.nextInt();
                int b3=sc.nextInt();
                int div=a3/b3;
                System.out.println("division of numbers" +"\t" +a3 +"and "+b3 + "is:"+div);
                break;
            case 5:
                System.exit(0);




        }
    }
}
