import java.util.Scanner;
class RAVIPROB {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int testcases=input.nextInt();
        for(int i=0;i<testcases;i++){
            int a=input.nextInt();
            int b=input.nextInt();
            long prod=1;
            while(a>1){
                int temp=a/b;
                prod=prod*temp;
                a=a-temp;
                b--;
            }
            System.out.println(prod);
        }
    }
    
}