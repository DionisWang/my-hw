import java.util.*;
public class MyStack {

    private String[] L;
    private int top;

    public MyStack(){
	L=new String[10];
	top = -1;
    }

    public  void push(String s){
        try{
	    L[top+1]=s;
	    top++;
	}catch(ArrayIndexOutOfBoundsException e){
	    L=Arrays.copyOf(L,2*L.length);
	    push(s);
	}
    }
    public String pop() {
	String s=L[top];
	L[top]=null;
	top--;
	return s;
    }

    public String peek() {
	return L[top];
    }

    public boolean isEmpty() {
	return L[0] == null;
    }

    public int getSize() {
	return top+1;
    }
    
    public String toString(){
	String tmp = "";
	for(int i=0;i<top+1;i++){
	    tmp+=L[i]+",";
	}
	return tmp;
    }
}
