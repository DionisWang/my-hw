public class Driver{
    public static void main(String[] args){
	BST tree=new BST();
	tree.insert(1);
	tree.insert(5);
	tree.insert(4);
	tree.insert(2);
	tree.insert(7);
	tree.insert(6);
	tree.insert(10);
	tree.insert(8);
	tree.insert(9);
	tree.insert(3);
	System.out.println(tree);
	tree.delete(8);
	for(int i=1;i<=10;i++){
	    System.out.println(tree.search(i));
	}
	System.out.println("deleting 5");
	tree.delete(5);
	tree.delete(6);
	for(int i=1;i<=10;i++){
	    System.out.println(tree.search(i));
	}
    }
}
