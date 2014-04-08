public class Rpn{
    private MyStack stack;
    public Rpn(){
	stack=new MyStack();
    }
    public double parse(){
	return Double.parseDouble(stack.pop());
    }
    public double add(){
	return parse()+parse();
    }
    public double subtract(){
	return parse()-parse();
    }
    public double multiply(){
	return parse()*parse();
    }
    public double divide(){
	return parse()/parse();
    }
    public String run(String s){
	String r="";
	if(s.equals("+")){
	    r+=add();
	}else if(s.equals("-")){
	    r+=subtract();
	}else if(s.equals("*")){
	    r+=multiply();
	}else if(s.equals("/")){
	    r+=divide();
	}else{
	    r=s;
	}
	stack.push(r);
	if(r.equals(s)){
	    r="stored!";
	}
	return r;
    }
}
