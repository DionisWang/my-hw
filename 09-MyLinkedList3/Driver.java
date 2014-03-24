public class Driver{
    public static void main(String[]args){
	MyLinkedList m=new MyLinkedList();
	m.add("a");
	System.out.println(m);
	m.add("b");
	System.out.println(m);
	m.add("c");
	System.out.println(m);
	m.add(3,"d");
	System.out.println(m);
	m.add("e");
	System.out.println(m);
	//System.out.println(m.get(0));
	m.set(3,"Testing");
	System.out.println(m);
	m.remove(2);
	System.out.println(m);
	m.add("Working?");
	System.out.println(m);
	m.remove(0);	
	System.out.println(m);
	//System.out.println(m.length());
	//System.out.println(m.find("e"));
	//System.out.println(m.find("lol"));
	
	/*
	Node n1=new Node("Sammy");
	Node n2=new Node("Tommy");
	n1.setNext(n2);
	n2.setNext(new Node("Lamda"));
	n1.getNext().getNext().setNext(n1);
	int i=0;
	for(Node n=n1;i<6;n=n.getNext()){
	System.out.println(n);
	i++;
	}
	*/
    }
}
