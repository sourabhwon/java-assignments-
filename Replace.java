import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);      
    System.out.print("Enter string- ");
    String str=sc.nextLine();
    char[] s = str.toCharArray();
    for(int i=0;i<s.length;i++){
      if (s[i] != 'a' && s[i] != 'e' && s[i] != 'i'
                && s[i] != 'o' && s[i] != 'u')
            {
               if (s[i] == 'z')
               {
                    s[i] = 'b';
                } 
                s[i] = (char) (s[i] + 1);
            }
    }
    System.out.println(s); 
	}
}