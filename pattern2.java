/*sample input
8
  sample output
 
1 
22 
333 
4444 
55555 
666666 
7777777 
88888888 */

//program to print pattern
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
		    int j=1;
		    //int p=i;
		    while(j<=i){
		        System.out.print(i);
		       // p=p-1;
		        j=j+1;
		    }
		    System.out.println(" ");
		    i=i+1;
		}
	}
}

