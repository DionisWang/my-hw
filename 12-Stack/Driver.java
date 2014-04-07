public class Driver {

    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	stack.push("four");
	stack.push("five");
	stack.push("six");
	stack.push("seven");
	stack.push("eight");
	stack.push("hello");
	stack.push("world");
	stack.push("uhm ...");
	stack.push("WORKING!");
	System.out.println(stack.getSize());
	System.out.println(stack.peek());
	while (!stack.isEmpty()){
	    System.out.println(stack.pop());
	}
	
    }

}
