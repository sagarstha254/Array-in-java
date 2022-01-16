public class Array_asec
{
    public static void main(String[] args)
    {
        int a[]={6,3,5,2,7,1,4};
        int temp = 0;
        for(int i = 0;i < a.length;i++)
        {
            System.out.print(a[i] + ",");
        }
        for(int i = 0;i < a.length; i++)
        {
            for(int j = i + 1; j< a.length; j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + ","); 
        }
    }
}