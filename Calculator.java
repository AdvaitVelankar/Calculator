import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        for(char z=1; z<=2; z++)
        {
            char ch;
            Scanner sc=new Scanner(System.in);
            System.out.println("Press 1 for Normal Calculator");
            System.out.println("Press 2 for finding Square");
            System.out.println("Press 3 for Perimeter");
            System.out.println("Press 4 for Area");
            System.out.println("Press 5 for Temperature unit conversion");
            System.out.println("Press 6 for Pythagoras Theorem");
            System.out.println("Press 7 for Finding Square Root");
            System.out.println("\nPress 'V' for Version Info");
            ch=sc.next().charAt(0);
            switch(ch)
            {
                case '1':System.out.println("Okay, You have selected Normal Calculator");
                double a, b, ans;
                System.out.println("Enter A");
                a=sc.nextDouble();
                System.out.println("Enter B");
                b=sc.nextDouble();
                System.out.println("Press 1 for Addition");
                System.out.println("Press 2 for Subtraction");
                System.out.println("Press 3 for Multiplication");
                System.out.println("Press 4 for Division");
                ch=sc.next().charAt(0);
                switch(ch)
                {
                    case '1':ans=(a+b);
                    System.out.println("Your answer is:" +ans);
                    break;
                    case '2':ans=(a-b);
                    System.out.println("Your answer is:" +ans);
                    break;
                    case '3':ans=(a*b);
                    System.out.println("Your answer is:" +ans);
                    break;
                    case '4':ans=(a/b);
                    System.out.println("Your answer is:" +ans);
                }
                break;
                case '2':System.out.println("Okay, You have selected Square finder");
                double n;
                System.out.println("Enter the number");
                n=sc.nextDouble();
                ans=(n*n);
                System.out.println("Your Square Root is:" +ans);
                break;
                case '3':System.out.println("Okay, You have selected Perimeter finder");
                System.out.println("Press '1' for finding perimeter of square");
                System.out.println("Press '2' for finding perimeter of a rectangle");
                System.out.println("Press '3' for finding perimeter of a circle");
                ch=sc.next().charAt(0);
                switch(ch)
                {
                    case '1': double l;
                    System.out.println("Enter length");
                    l=sc.nextDouble();
                    ans=(4*l);
                    System.out.println("Perimeter of Square is: " +ans);
                    break;
                    case '2': System.out.println("Enter Length");
                    l=sc.nextDouble();
                    System.out.println("Enter Breadth");
                    b=sc.nextDouble();
                    ans=(l+b);
                    ans=(2*ans);
                    System.out.println("Perimeter of Rectangle is:" +ans);
                    break;
                    case '3':double rd;
                    System.out.println("Enter the radius");
                    rd=sc.nextDouble();
                    ans=(2*3.142857142857143*rd);
                    System.out.println("Perimeter of Circle is:" +ans);
                }
                break;
                case '4':System.out.println("Okay you have selected Area finder");  
                System.out.println("Press 1 for finding the area of square");
                System.out.println("Press 2 for finding the area of rectangle");
                System.out.println("Press 3 for finding the area of circle");
                ch=sc.next().charAt(0);
                switch(ch)
                {
                    case '1':double s;
                    System.out.println("Enter the length of side");
                    s=sc.nextDouble();
                    a=(s*s);
                    System.out.println("Area of Square is" +a);
                    break;
                    case '2':double l;
                    System.out.println("Enter Length");
                    l=sc.nextDouble();
                    System.out.println("Enter Breadth");
                    b=sc.nextDouble();
                    a=(l*b);
                    System.out.println("Area of square is:"+a);
                    break;
                    case '3':double r;
                    System.out.println("Enter the radius of circle");
                    r=sc.nextDouble();
                    a=(3.142857142857143*r);
                    System.out.println("Area of circle is:" +a);
                }
                break;
                case '5':System.out.println("Okay, You have selected Temperature unit converter");
                double c, f;
                System.out.println("Press 1 for conversion from celsius to fahrenheit");
                System.out.println("Press 2 for conversion from fahrenheit to celsius");
                ch=sc.next().charAt(0);
                switch(ch)
                {
                    case '1':System.out.println("Please enter the temperature");
                    c=sc.nextDouble();
                    ans=(c*1.8);
                    ans=(ans+32);
                    System.out.println("Your answer is:" +ans);
                    break;
                    case '2':System.out.println("Please enter the temperature");
                    f=sc.nextDouble();
                    ans=(f-32);
                    ans=(ans*5);
                    ans=(ans/9);
                    System.out.println("Your answer is:" +ans);
                }
                break;
                case '6':System.out.println("Okay, you have choosed Pythagoras Theorem");
                    double H, B, HP;
                    System.out.println("Press 1 if Height and Base are given");
                    System.out.println("Press 2 if Height and Hypotenuse are given");
                    System.out.println("Press 3 if Hypotenuse and Base are given");
                    ch=sc.next().charAt(0);
                    switch(ch)
                    {
                        case '1':System.out.println("Please enter Height");
                        H=sc.nextDouble();
                        System.out.println("Please enter Base");
                        B=sc.nextDouble();
                        HP=((H*H)+(B*B));
                        double RootHP=Math.sqrt(HP);
                        System.out.println("Your Hypotenuse is:" +RootHP);
                        break;
                        case '2':System.out.println("Please enter Height");
                        H=sc.nextDouble();
                        System.out.println("Please enter Hypotenuse");
                        HP=sc.nextDouble();
                        B=((HP*HP)-(H*H));
                        double RootB=Math.sqrt(B);
                        System.out.println("Your Base is:" +RootB);
                        break;
                        case '3':System.out.println("Please enter Base");
                        B=sc.nextDouble();
                        System.out.println("Please enter Hypotenuse");
                        HP=sc.nextDouble();
                        H=((HP*HP)-(B*B));
                        double RootH=Math.sqrt(H);
                        System.out.println("Your Height is:" +RootH);
                    }
                    break;
                    case '7':System.out.println("Okay you have selected Square Root finder");
                    System.out.println("Enter a Number");
                    n=sc.nextDouble();
                    double rootn=Math.sqrt(n);
                    System.out.println("Your Square root is:" +rootn);
                    break;
                    case 'V':System.out.println("Version: 2.0");
                    break;
                    case 'v':System.out.println("Version: 2.0");
            } 
            System.out.println("Would you like to run the program again?");
            System.out.println("If Yes press 'Y' and if No press 'N'");
            char rc=sc.next().charAt(0);
            switch(rc)
            {
                case 'Y':z=1;
                break;
                case 'y':z=1;
                break;
                case 'N':z=3;
                break;
                case 'n':z=3;
                break;
            }
        }
    }
}