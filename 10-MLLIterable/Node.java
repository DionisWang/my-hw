public class Node{
    private String data;
    private Node next;
    public Node(String s){
	data=s;
    }
    public void setNext(Node n){
	next=n;
    }
    public void setData(String s){
	data=s;
    }
    public Node getNext(){
	return next;
    }
    public String getData(){
	return data;
    }
    public String toString(){
	return data;
    }
}