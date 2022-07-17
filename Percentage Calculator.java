import java.util.*;
public class Percentage_Calculator
{
    public static void main()
    {
        for(char z=1; z<=2; z++)
        {
            double e, e1, m, b, c, p, h, g, h1, g3, ts, pc;
            int gr, pr;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your grade");
            gr=sc.nextInt();
            System.out.println("Each Subject carries 100 marks");
            System.out.println("Enter marks obtained in English Literature");
            e=sc.nextDouble();
            System.out.println("Enter marks obtained in English Language");
            e1=sc.nextDouble();
            System.out.println("Enter marks obtained in Maths");
            m=sc.nextDouble();
            System.out.println("Enter marks obtained in Biology");
            b=sc.nextDouble();
            System.out.println("Enter marks obtained in Chemistry");
            c=sc.nextDouble();
            System.out.println("Enter marks obtained in Physics");
            p=sc.nextDouble();
            System.out.println("Enter marks obtained in History");
            h=sc.nextDouble();
            System.out.println("Enter marks obtained in Geography");
            g=sc.nextDouble();
            System.out.println("Enter marks obtained in Hindi");
            h1=sc.nextDouble();
            System.out.println("Enter marks obtained in Group 3 Subject");
            g3=sc.nextDouble();
            ts=(e+e1+m+b+c+p+h+g+h1+g3);
            pc=(ts/1000);
            pc=(pc*100);
            System.out.println("Your percentage is" +pc+ "%");
            if(pc>=35)
            {
                System.out.println("congratulation \nYou are Passed");
                pr=(gr+1);
                System.out.println("You are promoted to grade:" +pr);
            }
            else if(pc<35)
            {
                System.out.println("You are Failed");
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