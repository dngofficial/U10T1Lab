public class MainMethod
{
    public static void main(String[] args)
    {
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55
    }

    public static int sum(int n)
    {
        int total = 0;
        if (n == 1)
        {
            total +=1;
            return total;
        }
        else
        {
            total += n + sum(n-1);

        }
        return total;

    }
}
