import java.util.*;
public class Normal_Calculator
{
    public static void main(String args[])
    {
        for(char x=1; x<=2; x++)
        {
            double a, b, ans;
            char ch;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of a: ");
            a=sc.nextDouble();
            System.out.println("Enter the value of b: ");
            b=sc.nextDouble();
            System.out.println("What do you want to do");
            System.out.println("For Addition press 1");
            System.out.println("For Subtraction press 2");
            System.out.println("For Multiplication press 3");
            System.out.println("For Division press 4");
            System.out.println("For Remainter press 5");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case '1': ans=(a+b);
                System.out.println("Your Addition is:" +ans);
                break;
                case '2': ans=(a-b);
                System.out.println("Your Subtraction is:" +ans);
                break;
                case '3': ans=(a*b);
                System.out.println("Your Multiplication is:" +ans);
                break;
                case '4': ans=(a/b);
                System.out.println("Your Division is:" +ans);
                break;
                case '5': ans=(a%b);
                System.out.println("Your Remainder is:" +ans);
                default:System.out.println("ERROR");
            }
            System.out.println("Would you like to run the program again?");
            System.out.println("If Yes press 'Y' and if No press 'N'");
            char rc=sc.next().charAt(0);
            switch(rc)
            {
                case 'Y':x=1;
                break;
                case 'y':x=1;
                break;
                case 'N':x=3;
                break;
                case 'n':x=3;
                break;
            }
        }
    }
}
