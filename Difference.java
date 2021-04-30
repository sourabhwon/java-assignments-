import java.util.Scanner;
public class Difference
{
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);      
    System.out.println("Enter number- ");
    int n=sc.nextInt();
    String s=Integer.toString(n);
    int sum;
    StringBuffer ans = new StringBuffer();
    for(int i=1;i<s.length();i++){
        
        
        int a=Integer.parseInt(String.valueOf(s.charAt(i)));
        int b=Integer.parseInt(String.valueOf(s.charAt(i-1)));
        sum=Math.abs(a-b);
        ans.append(sum);
    }
        int a=Integer.parseInt(String.valueOf(s.charAt(0)));
        int b=Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
        sum=Math.abs(a-b);
        ans.append(sum);
    System.out.println(ans);
   
	}
}