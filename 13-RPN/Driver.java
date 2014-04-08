import java.util.*;
public class Driver{
    public static void main(String[] args){
	Rpn c = new Rpn();
	boolean go=true;
	System.out.println("RPN calculator type exit to close");
	while(go){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Input:\t ");
	    String s= sc.nextLine();
	    if(s.equals("exit")){
		go=false;
	    }else{
		System.out.println("Result: "+c.run(s));
	    }
	}
	System.out.println("RPN calculator closed.");
    }    
}
