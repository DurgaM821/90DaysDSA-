/* parallelogram

sample Input:

5

sample Output:


*****
 *****
  *****
   *****
    *****
    
    */

//program for parallelogram

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    //int n=s.new Int();
	    int n = s.nextInt();
	    int i=1;
	    while(i<=n){
	        int spaces=1;
	        while(spaces<=i-1){
	            System.out.print(" ");
	            spaces=spaces+1;
	        }
	        int j=1;
	        while(j<=n){
	            System.out.print("*");
	            j=j+1;
	        }
	        System.out.println("");
	        i=i+1;
	    }
	}
}

