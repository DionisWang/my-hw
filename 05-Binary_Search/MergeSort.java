import java.util.*;
public class MergeSort{
    //Looked this up but doesn't know what it means
    private static <T extends Comparable<? super T>> ArrayList<T> merge(ArrayList<T> a, ArrayList<T> b){
	int ca=0;
	int cb=0;
	ArrayList c=new ArrayList();
	for(int i=0;i<a.size()+b.size();i++){
	    if(ca==a.size()){
		c.add(b.get(cb));
		cb++;
	    }else if(cb==b.size()){
		c.add(a.get(ca));
		ca++;
	    }else if(b.get(cb).compareTo(a.get(ca))<0){
		c.add(b.get(cb));
		cb++;
	    }else{
		c.add(a.get(ca));
		ca++;
	    }
	}
	return c;
    }
    public static <T extends Comparable<? super T>>ArrayList<T> mergesort(ArrayList<T> a){
	if(a.size()==1){
	    return a;
	}else{
	    ArrayList b=new ArrayList();
	    ArrayList c=new ArrayList();
	    for(int i=0;i<a.size()/2;i++){
		b.add(a.get(i));
	    }
	    for(int i=a.size()/2;i<a.size();i++){
		c.add(a.get(i));
	    }
	    return merge(mergesort(b),mergesort(c));
	}
    }
    public static class Person implements Comparable<Person>{
	private int age;
	private String name;
	public int getAge(){
	    return age;
	}
	public String getName(){
	    return name;
	}
	public Person(int a, String n){
	    age=a;
	    name=n;
	}
	@Override
	    /*
	public int compareTo(Person a){
	    if(age>a.getAge()){
		return 1;
	    }else if(age<a.getAge()){
		return -1;
	    }else{
		return 0;
	    }
	}
	public String toString(){
	    return age+" "+name;
	}
	    */
	    public int compareTo(Person a){
	    return name.compareTo(a.getName());
	}
	public String toString(){
	    return name+" "+age;
	}
    }
    public static void main(String[]args){
	//ArrayList<String> a1= new ArrayList<String>(Arrays.asList("hello","does this work?","zero!","apple","vex","bees","haha","you work?"));
	//ArrayList<Integer> a1= new ArrayList<Integer>(Arrays.asList(3,5,23,6,3,2,5,75,9,10,24,44,7,42,15));
	
	ArrayList<Person> a1= new ArrayList<Person>();
	a1.add(new Person(10,"Seadirc"));
	a1.add(new Person(16,"Dionis"));
	a1.add(new Person(10,"Bobby"));
	a1.add(new Person(999,"Troll"));
	a1.add(new Person(5,"Five"));
	a1.add(new Person(2,"Bees"));
	ArrayList c1= mergesort(a1);
	for(int i=0;i<c1.size();i++){
	    System.out.println(c1.get(i));
	}
    }
}

