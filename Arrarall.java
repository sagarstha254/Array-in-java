public class Arrarall{

    public static void main(String[] args){

        int hell[];

        hell = new int[2];

        hell[0]=1;
        hell[1]=2;

        for(int i=0; i < hell.length;i++){

            System.out.println(hell[i]);
        }
        System.out.println();

        int hello[]={3,4};

        for(int j=0;j<hello.length;j++){

            System.out.println(hello[j]);
        }

        System.out.println();

        int hi[][];

        hi = new int [2][2];

        hi[0][0]=5;
        hi[0][1]=6;
        hi[1][0]=7;
        hi[1][1]=8;

        for(int k =0; k<hi.length;k++)
        {           
            for(int l=0; l<hi.length;l++)
            {
                System.out.print(hi[k][l] +",");
            }
        }

        System.out.println();
        System.out.println();

        int lol[][]={{9,10},{11,12}};

        for(int m=0;m<lol.length; m++)
        {
            for(int n = 0; n < lol.length; n++)
            {
                System.out.print(lol[m][n] + ",");
            }
        }               
    }
}