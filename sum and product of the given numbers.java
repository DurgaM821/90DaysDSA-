/* input
line 1 integer1
line 2   integer choice
explanation
eneter the n value
if choice=1 means sum else choice=2 means product
if the given choice not equals to 1 or 2 then print -1
Constraints :
1 <= N <= 12

sample input
12
2

sample output
479001600

*/

//program
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int sum=0,pro=1;
        if( c!=1 && c!=2){
            System.out.println(-1);
        }
        else{
        if(c==1){
           // int sum=0;
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
            
        }
            else{ 
                if (c==2){
                //int pro=1;
                for(int i=1;i<=n;i++){
                    pro=pro*i;
                }
                System.out.println(pro);
                  
            }
            }
        }
        
         
	}
}





