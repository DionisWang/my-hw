public class BST{
    private Node root;
    //could not figure out delete.
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
    public void delete(int x){
	Node temp=root;
	Node pb=null;
	try{
	    while(temp.getData()!=x){
		pb=temp;
		if(temp.getData()>x){
		    temp=temp.getLeft();
		}else{
		    temp=temp.getRight();
		}
	    }
	}catch(NullPointerException e){
	    System.out.println("Element not found!");
	    return;
	}
	if(temp.getLeft()!=null&&temp.getRight()!=null){
	    delete3(pb,x);
	}else if(temp.getLeft()==null||temp.getRight()==null){
	    delete2(pb,x);
	}else{
	    delete1(pb,x);
	}
    }
    public void delete1(Node n,int x){
	if(n.getLeft().getData()==x){
	    n.setLeft(null);
	}else{
	    n.setRight(null);
	}
    }
    public void delete2(Node n, int x){
	if(n.getLeft()!=null&&n.getLeft().getData()==x){
	    if(n.getLeft().getRight()!=null){
		n.setLeft(n.getLeft().getRight());
	    }else{
		n.setLeft(n.getLeft().getLeft());
	    }
	}else{
	    if(n.getRight().getLeft()!=null){
		n.setRight(n.getRight().getLeft());
	    }else{
		n.setRight(n.getRight().getRight());
	    }
	}
    }
    public void delete3(Node n,int x){
	Node t;
	if(n.getLeft().getData()==x){
	    t=n.getLeft().getLeft();
	    while(t.getRight()!=null){
		t=t.getRight();
	    }
	    delete(t.getData());
	    t.setLeft(n.getLeft().getLeft());
	    t.setRight(n.getLeft().getRight());
	    n.setLeft(t);
	}else{
	    t=n.getRight().getLeft();
	    while(t.getRight()!=null){
		t=t.getRight();
	    }
	    delete(t.getData());
	    t.setRight(n.getRight().getRight());
	    t.setLeft(n.getRight().getLeft());
	    n.setRight(t);
	}
    }
    public String toString(){
	return print(root);
    }
    //  return n+"\n"+print(n.getLeft())+print(n.getRight()); - pre-order traversal.
    public String print(Node n){
	if(n==null){
	    return " ";
	}
	return print(n.getLeft())+n+"\n"+print(n.getRight());//- in order traversal.
	//Post order traversal is:
	//traverse(left);
	//traverse(right);
	//process node;
    }
}
