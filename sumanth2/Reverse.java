 import java.util.Scanner;
public class Reverse{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scanner.nextInt();
		int reversed = 0;
        int originalNum = num; // to display later

        while (num != 0) {
            int digit = num % 10;          // get last digit
            reversed = reversed * 10 + digit; // append digit
            num = num / 10;                // remove last digit
        }

        System.out.println("Reversed number of " + originalNum + " is " + reversed);

        scanner.close();
    }
}