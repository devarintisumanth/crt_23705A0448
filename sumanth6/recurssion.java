import java.util.Stack;
public class recurssion{
	public static void main(String[]args){
		Stack<Integer>s=new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		pushBottom(s,40);
		System.out.println("Elements in the Stack are:");
		System.out.println(s);
	}
	public static void pushBottom(Stack<Integer>stack,int ele){
	if(stack.isEmpty()){
		stack.push(ele);
		return;
	}
	int val=stack.pop();
	pushBottom(stack,ele);
	stack.push(val);
}
		
		

}