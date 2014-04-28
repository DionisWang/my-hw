public class Driver{
    public static void main(String[] args){
	BST tree=new BST();
	tree.insert(1);
	tree.insert(5);
	tree.insert(4);
	System.out.println(tree.search(1));
	System.out.println(tree.search2(4));
	System.out.println(tree.search(5));
	System.out.println(tree.search(2));
	System.out.println(tree.search2(50));
    }
}
