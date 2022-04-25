//Pattern formation using Alphabet

/*SAMPLE INPUT
6

SAMPLE OUTPUT 

ABCDEF 
BCDEFG 
CDEFGH 
DEFGHI 
EFGHIJ 
FGHIJK */


//program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
		    int j=1;
		    int p=i;
		    while(j<=n){
		        System.out.print((char)('A'+p-1));
		        p=p+1;
		        j=j+1;
		    }
		    System.out.println(" ");
		    i=i+1;
		}
	}
}

