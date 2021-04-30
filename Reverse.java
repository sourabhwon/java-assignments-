import java.nio.channels.Pipe;
import java.util.Scanner;

class Reverse {
  public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);      

   StringBuffer a = new StringBuffer(); 
   
   
   System.out.print("Enter string- ");
   a.append(sc.nextLine());
   
   System.out.print( a + "|" );
    System.out.print(a.reverse());
  }
}