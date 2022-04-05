import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));
    }

    public static String countdown(int number)
    {
        String finalStr = "";
        if(number == 1)
        {
            finalStr += "1 Blastoff!";
            return finalStr;
        }
        else
        {
            finalStr += number + " ";
            return finalStr + countdown(number-1);
        }
    }
}
