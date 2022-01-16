public class arrayavg{

    public static void main(String[] args){

        int a[]={2,3,4};
        float avg = 0f;
        float total=0f;

        /*  for(int i =0; i<a.length;i++){
        total = total + a[i];
        }
         */
        
        for(int k:a)
        {
            total= total + k;
        }

        avg = total/(a.length);

        System.out.print(avg);
    }
}