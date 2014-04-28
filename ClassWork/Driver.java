public class Driver{
    public static void main(String[] args){
	Node a= new Node(1);
	a.setLeft(2);
	a.setRight(3);
	System.out.println(a+a.getLeft()+a.getRight());
    }
}