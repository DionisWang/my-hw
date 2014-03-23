public class MyLinkedList{
    private Node head;
    public MyLinkedList(){
	head=new Node("dummy");
    }
    
    public void add(String s){
	Node tmp=new Node(s);	
	tmp.setNext(head.getNext());
	head.setNext(tmp);
    }
    public void add(int ind,String s){
	if(ind==0){
	    add(s);
	    return;
	}
	Node tmp=new Node(s);
	Node n=head;
	Node m=n.getNext();
	int i=0;
	try{
	    for(i=0;i<ind;i++){
		n=m;
		m=m.getNext();
	    }
	    tmp.setNext(m);
	    n.setNext(tmp);
	}catch(NullPointerException e){
	    System.out.println("(add) IndexOutOfBounds: "+(i));
	}
    }
    public String get(int ind){
	Node n=head.getNext();
	int i=0;
	try{
	    for(i=0;i<ind;i++){
		n=n.getNext();
	    }
	    return n.toString();
	}catch(NullPointerException e){
	    System.out.println("(get) IndexOutOfBounds: "+(i));
	}
	return "";
    }
    public String set(int ind,String s){
	String tmp="";
	Node n=head.getNext();
	int i=0;
	try{
	    for(i=0;i<ind;i++){
		n=n.getNext();
	    }
	    tmp=n.getData();
	    n.setData(s);
	    return tmp;
	}catch(NullPointerException e){
	    System.out.println("(set) IndexOutOfBounds: "+(i));
	}
	return "";
    }
    public String remove(int ind){
	String tmp="";
	Node n=head;
	int i=0;
	try{
	    for(i=0;i<ind;i++){
		n=n.getNext();
	    }
	    tmp=n.getNext().getData();
	    n.setNext(n.getNext().getNext());
	    return tmp;
	}catch(NullPointerException e){
	    System.out.println("(remove) IndexOutOfBounds: "+(i));
	}
	return "";
    }
    public int find(String s){
	for(int i=0;i<length();i++){
	    if(get(i).equals(s)){
		return i;
	    }
	}
	System.out.println("Element not found!");
	return -1;
    }
    public int length(){
	int i=0;
	for(Node n=head.getNext();n!=null;n=n.getNext()){
	    i++;
	}
	return i;
    }
    public String toString(){
	String s="{"+head.getNext();
	for(Node n=head.getNext().getNext();n!=null;n=n.getNext()){
	    s+=","+n;
	}
	return s+"}";
    }    
}
