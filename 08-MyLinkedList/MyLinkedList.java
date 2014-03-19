public class MyLinkedList{
    private Node head;
    public MyLinkedList(){
	head=null;
    }
    
    public void add(String s){
	Node tmp=new Node(s);	
	tmp.setNext(head);
	head=tmp;
    }
    public void add(int ind,String s){
	if(ind==0){
	    add(s);
	    return;
	}
	Node tmp=new Node(s);
	Node n=head;
	int i=0;
	try{
	    for(i=0;i<ind-1;i++){
		n=n.getNext();
	    }
	    tmp.setNext(n.getNext());
	    n.setNext(tmp);
	}catch(NullPointerException e){
	    System.out.println("(add) IndexOutOfBounds: "+(i+1));
	}
    }
    public String get(int ind){
	Node n=head;
	int i=0;
	try{
	    for(i=0;i<ind;i++){
		n=n.getNext();
	    }
	    return n.toString();
	}catch(NullPointerException e){
	    System.out.println("(get) IndexOutOfBounds: "+(i+1));
	}
	return "";
    }
    public String set(int ind,String s){
	String tmp="";
	Node n=head;
	int i=0;
	try{
	    for(i=0;i<ind;i++){
		n=n.getNext();
	    }
	    tmp=n.getData();
	    n.setData(s);
	    return tmp;
	}catch(NullPointerException e){
	    System.out.println("(set) IndexOutOfBounds: "+(i+1));
	}
	return "";
    }
    public String remove(int ind){
	String tmp="";
	Node n=head;
	int i=0;
	try{
	    for(i=0;i<ind-1;i++){
		n=n.getNext();
	    }
	    tmp=n.getNext().getData();
	    n.setNext(n.getNext().getNext());
	    return tmp;
	}catch(NullPointerException e){
	    System.out.println("(remove) IndexOutOfBounds: "+(i+1));
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
	for(Node n=head;n!=null;n=n.getNext()){
	    i++;
	}
	return i;
    }
    public String toString(){
	String s="{"+head;
	for(Node n=head.getNext();n!=null;n=n.getNext()){
	    s+=","+n;
	}
	return s+"}";
    }    
}
