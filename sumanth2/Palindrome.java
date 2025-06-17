import java.util.Scanner;
public class Palindrome{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scanner.nextInt();
		int reversed = 0;
        int originalNum = num; 

        while (num != 0) {
            int digit = num % 10;          
            reversed = reversed * 10 + digit; 
            num = num / 10;                
         }

        if (originalNum == reversed) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        scanner.close();
    }
}

       
