public class Node{
    private int data;
    private Node c1,c2;
    public Node(int i){
	data=i;
    }
    public void setLeft(int i){
	c1=new Node(i);
    }
    public void setRight(int i){
	c2=new Node(i);
    }
    public void setData(int i){
	data=i;
    }
    public Node getLeft(){
	return c1;
    }
    public Node getRight(){
	return c2;
    }
    public int getData(){
	return data;
    }
    public String toString(){
	return ""+data;
    }
}
