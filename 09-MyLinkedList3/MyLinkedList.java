public class MyLinkedList{
    private Node head,tail;
    private int length;
    public MyLinkedList(){
	head=new Node("dummy");
	tail=head;
	length=0;
    }
    
    public void add(String s){	
	Node n=new Node(s);
	tail.setNext(n);
	tail=n;
	length++;
    }
    public void add(int ind,String s){
	Node tmp=new Node(s);
	Node m=getn(ind);
	Node n=m.getNext();
	m.setNext(tmp);
	tmp.setNext(n);
	if(n==null){
	    tail=tmp;
	}
	length++;
    }
    public Node getn(int ind){
	Node n=head;
	for(int i=0;i<ind;i++){
	    n=n.getNext();
	}
	return n;
    }
    public String get(int ind){
	return getn(ind+1).toString();
    }
    public String set(int ind,String s){
	Node n= getn(ind+1);
	String tmp=n.getData();
	n.setData(s);
	return tmp;
    }
    public String remove(int ind){
	String tmp="";
	Node n=getn(ind);
	Node m=n.getNext();
	tmp=m.getData();
	n.setNext(m.getNext());
	length--;
	if(m.getNext()==null){
	    tail=n;
	}
	return tmp;
    }
    public int find(String s){
	for(int i=0;i<length;i++){
	    if(get(i).equals(s)){
		return i;
	    }
	}
	return -1;
    }
    public int length(){
	return length;
    }
    public String toString(){
	String s="{";
	for(Node n=getn(1);n.getNext()!=null;n=n.getNext()){
	    s+=n+",";
	}
	return s+tail+"}";
    }    
}
