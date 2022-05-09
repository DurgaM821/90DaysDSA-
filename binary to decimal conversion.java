/* binary to decimal conversion

input
1011

output
11

input
111

output
7
*/
//program
import java.lang.Math;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int rem=0,quo=n;
	    double dec=0;
	    for(int i=0;quo>0;i++){
	        rem=quo%10;
	        quo=quo/10;
	        dec=dec+(rem*(Math.pow(2,i)));
	       
	    }
	    System.out.print((int)dec);
 		
    }
}
