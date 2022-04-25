/*
sample Input:
5
sample Output:


A 
BC 
CDE 
DEFG 
EFGHI 
*/

//pattern program

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
		    while(j<=i){
		        System.out.print((char)('A'+p-1));
		        p=p+1;
		        j=j+1;
		    }
		    System.out.println(" ");
		    i=i+1;
		}
	}
}

