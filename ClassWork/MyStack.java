public class MyStack{
    private Node top;
    private int numElts;
    public MyStack(){
	top=null;
	numElts=0;
    }
    public void push(String s){
	Node n=new Node(s);
	n.setNext(top);
	top=n;
	numElts++;
    }
    public String pop(){
	String s;
	s=top.getData();
	top=top.getNext();
	numElts--;
	return s;
    }
    public String peek(){
	return top.getData();
    }
    public boolean isEmpty(){
	return top==null;
    }
    public int getSize(){
	return numElts;
    }
    public String toString(){
	String tmp="";
	Node currentNode= top;
	while(currentNode!=null){
	    tmp+=currentNode.getData()+",";
	    currentNode=currentNode.getNext();
	}
	return tmp;
    }
    //constructor
    //push
    //pop
    //peek
    //isEmpty
    //toString
}