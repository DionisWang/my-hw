import java.util.*;
public class MyIterator<E> implements Iterator<E>{
    private Node cur;
    public MyIterator(Node head){
	cur=head;
    }
    public boolean hasNext(){
	return !(cur.getNext()==null);
    }
    public E next(){
	if(hasNext()){
	    cur=cur.getNext();
	    return (E)cur;
	}
	return null;
    }
    public void remove(){
    }
}