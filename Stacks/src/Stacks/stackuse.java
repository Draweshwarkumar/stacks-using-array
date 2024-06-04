package Stacks;

public class stackuse {

	public static void main(String[] args) throws Stackfullexception {
		
		StackusingArray Stack = new StackusingArray(3);
		// TODO Auto-generated method stub
		for(int i = 1;i<=5;i++) {
			Stack.push(i);
		}
		
		while(!Stack.isEmpty()) {
			try {
				System.out.println(Stack.pop());
			}
			catch (Stackemptyexception e) {
				
			}
		}
	}

}
