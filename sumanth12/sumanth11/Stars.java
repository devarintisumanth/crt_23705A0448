import java.util.Arrays;
import java.util.Scanner;
public class Stars{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n;i++){
			for(int j=0; j<2*n-1;j++){
				if(j>=(n-1)-i&& j<=(n-1)+i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

