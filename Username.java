import java.util.Scanner;
public class Username
{
	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);      
    System.out.print("Enter the Username should end with _job and atleast 8 CharSequence- ");
    String str=sc.nextLine();
    if(str.length()>=12 && str.endsWith("_job")){
        System.out.println("Username is passed");
    }
    
    else{
        System.out.println("Entered wrong username please enter correctly ");
    }
     
	}
}