public class BST{
    private Node root;

    public BST(){
	root=null;
    }

    public void insert(int x){
	Node temp=root;
	Node pb=null;
	while(temp!=null){
	    pb=temp;
	    if(temp.getData()>x){
		temp=temp.getLeft();
	    }else{
		temp=temp.getRight();
	    }
	}
	if(pb==null){
	    root=new Node(x);
	}else if(pb.getData()>x){
	    pb.setLeft(x);
	}else{
	    pb.setRight(x);
	}
    }
    public Node search(int x){
	Node temp=root;
	while(temp!=null&&temp.getData()!=x){
	    if(temp.getData()>x){
		temp=temp.getLeft();
	    }else{
		temp=temp.getRight();
	    }
	}
	return temp;
    }
    public Node search2(int x){
	return search2(x,root);
    }
    public Node search2(int x,Node t){
	if(t==null||t.getData()==x){
	    return t;
	}else if(t.getData()>x){
	    return search2(x,t.getLeft());
	}else{
	    return search2(x,t.getRight());
	}
    }
}
