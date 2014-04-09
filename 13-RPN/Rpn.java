public class Rpn{
    //changed to include exception like thomas'
    private MyStack stack;
    public Rpn(){
	stack=new MyStack();
    }
    public double parse(){
	return Double.parseDouble(stack.pop());
    }
    public String add(){
	if(stack.getSize()<2){
	    return "Invalid Operation!";
	}
	String s= ""+(parse()+parse());
	stack.push(s);
	return s;
    }
    public String subtract(){
	if(stack.getSize()<2){
	    return "Invalid Operation!";
	}
	String s= ""+(parse()-parse());
	stack.push(s);
	return s;
    }
    public String multiply(){
	if(stack.getSize()<2){
	    return "Invalid Operation!";
	}
	String s= ""+(parse()*parse());
	stack.push(s);
	return s;
    }
    public String divide(){
	if(stack.getSize()<2){
	    return "Invalid Operation!";
	}
	String s= ""+(parse()/parse());
	stack.push(s);
	return s;
    }
    public String run(String s){
	if(s.equals("+")){
	    return add();
	}else if(s.equals("-")){
	    return subtract();
	}else if(s.equals("*")){
	    return multiply();
	}else if(s.equals("/")){
	    return divide();
	}else{
	    stack.push(s);
	    return "stored!";
	}
    }
}
