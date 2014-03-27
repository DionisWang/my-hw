public class Driver{
    public static void main(String[]args){
	MyLinkedList m=new MyLinkedList();
	m.add("a");
	m.add("b");
	m.add("c");
	MyIterator it=m.iterator();
	while(it.hasNext()){
	    System.out.println(it.next());
	}
    }
}
