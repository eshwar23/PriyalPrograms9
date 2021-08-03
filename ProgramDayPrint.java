import java.util.*;
class ProgramDayPrint
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter the day");
        num=in.nextInt();
        if(num==1)
        {
            System.out.println("Monday");
        }
        else if(num==2)
        {
            System.out.println("Tuesday");
        }
        else if(num==3)
        {
            System.out.println("Wednesday");
        }
        else if(num==4)
        {
            System.out.println("Thursday");
        }
        else if(num==5)
        {
            System.out.println("Friday");
        }
        else if(num==6)
        {
            System.out.print("Saturday");
        }
        else if(num==7)
        {
            System.out.println("Sunday");
        }
        else 
        {
            System.out.println("Not a day of the week");
        }
    }
}
