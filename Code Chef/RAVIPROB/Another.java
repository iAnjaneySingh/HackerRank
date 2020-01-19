//package codechef;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
 class raviproblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0)
    {
        int res=0;
        int mod=0;
        long prod=1;
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[]=new int[b];
       
           
        res=(int )a/b;
        for(int i=0;i<b;i++)
        {
        arr[i]=res;
        }
        mod=a%b;
            
     int i=0;
        while(mod!=0)
       {
        arr[i]++;
        mod--;
        i++;
        }
     for(int j=0;j<b;j++)
     {
     prod=prod*arr[j];
     }
            System.out.println(prod);
        
   t--;}
    }
    
}
