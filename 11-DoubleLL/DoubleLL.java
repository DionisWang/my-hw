//Anish Malhotra and Dionis Wang
public class DoubleLL<E>{

    private class Node<E> {
	E data;
	Node<E> next,prev;
	public Node(E d){
	    this.data = d;
	}
	public String toString(){
	    return ""+data;
	}

	public void setData(E d) {
	    data = d;
	}
	public E getData() {
	    return data;
	}
	public void setNext(Node<E> n){
	    next = n;
	}
	public Node<E> getNext() {return next;}

	public void setPrev(Node<E> p){prev = p;}
	public Node<E> getPrev(){return prev;}
    }
    private int length;
    private Node<E> current, head;
    public DoubleLL(){
	insert(null);
	head=current;
    }
    public void insert(E d){
	Node<E> n = new Node<E>(d);
	if(current==null){
	    current = n;
	    n.next=n;
	    n.prev=n;
	}	
	else{
	    n.next = current;
	    n.prev=current.prev;
	    if(current.prev!=null){
		current.getPrev().setNext(n);
	    }
	    current.prev = n;
	    current = n;
	    length++;
	}
    }

    public E getCurrent(){
	return current.getData();
    }

    public void forward() {
	if(current.getNext() != null)
	    current = current.getNext();
    }

    public void back() {
	if(current.getPrev() != null)
	    current = current.getPrev();
    }
    public int find(E d){
	Node tmp=head.next;
	for(int i=0;i<length;i++){
	    if(tmp.getData().equals(d)){
		return i;
	    }
	    if(tmp.next!=null){
		tmp=tmp.next;
	    }
	}
	return -1;
    }
    public String toString() {
	Node<E> tmp = head.next;
	String s = "";
	for(int i=0;i<length;i++){
	    s+=tmp+" ";
	    tmp=tmp.getNext();
	    if(tmp.equals(head)){
		tmp=tmp.getNext();
	    }
	}
	return s;
    }

    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	System.out.println(L.find("world"));
    }
}
