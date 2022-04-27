/* sample input

4

sample output


   J 
  JJJ 
 JJJJJ 
JJJJJJJ 

*/
// program for the pattern

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
		int i=1;
		while(i<=n){
		    int spaces=1;
		    while(spaces<=n-i){
		        System.out.print(" ");
		        spaces=spaces+1;
		    }
		    int j=1;
		    while(j<=i){
		        System.out.print("J");
		        j=j+1;
		    }
		    int dec=i-1;
		    while(dec>=1){
		        System.out.print("J");
		        dec=dec-1;
		    }
		    System.out.println(" ");
		    i=i+1;
		}
	}
}

