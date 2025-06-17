public class Swap{
	public static void main(String[]args){
		int a=4;
		int b=5;
		System.out.println("before swapping:a="+a+",b="+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping:a="+a+",b="+b);
	}
}