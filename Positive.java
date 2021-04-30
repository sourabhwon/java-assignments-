import java.util.Scanner;
public class Positive
{
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);      
    System.out.print("Enter string- ");
    String str=sc.nextLine();
    char[] s = str.toCharArray();
    int c=0;
    for(int i=1;i<s.length;i++){
    
            if(s[i]>=s[i-1]){
                c++;
            }
            else{
                
                break;
            }
    }
    if(c==s.length-1){
        System.out.println("YES string is positive ");
    }
    else{
        System.out.println("String is negative ");
    }
     
	}
}
