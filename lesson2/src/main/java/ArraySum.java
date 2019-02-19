public class ArraySum {
    public static void main (String[] args)
    {
        int sum =0;
        int c[] = {2, 4, 5, 7, 6, 6};
        for (int i =0; i<c.length; i++) {

            sum = sum + c[i];

        }
        System.out.println("Hello world! The array's sum is " + sum);
    }
}
