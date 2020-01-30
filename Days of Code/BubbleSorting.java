import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BubbleSorting {

    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int[] c = new int[n];
        for(int i=0; i<n; i++){
            c[i]= a.nextInt();
        }
        int swap = 0;
        for(int i = 0; i<n; i++){
            
            for(int j=0; j<n-1; j++){
                if(c[j]>c[j+1]){
                    int tmp= c[j];
                    c[j] = c[j+1];
                    c[j+1]= tmp;

                    swap++;
                }

            }
            if(swap==0) break;        
                
        }
     System.out.println("Array is sorted in "+swap+" swaps. ");
     System.out.println("First Element: "+c[0]);
     System.out.println("Last Element: "+c[n-1]);
        
    }
}
