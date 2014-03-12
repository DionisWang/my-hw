import java.util.*;
public class MergeSort{
    public static int[] merge(int[] a, int[] b){
	int ca=0;
	int cb=0;
	int[] c=new int[a.length+b.length];
	for(int i=0;i<c.length;i++){
	    if(ca==a.length){
		c[i]=b[cb];
		cb++;
	    }else if(cb==b.length){
		c[i]=a[ca];
		ca++;
	    }else if(a[ca]>b[cb]){
		c[i]=b[cb];
		cb++;
	    }else{
		c[i]=a[ca];
		ca++;
	    }
	}
	return c;
    }
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b){
	int ca=0;
	int cb=0;
	ArrayList<String> c=new ArrayList<String>();
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
    public static int[] mergesort(int[] a){
	if(a.length==1){
	    return a;
	}else{
	    int[] b=new int[a.length/2];
	    int[] c=new int[a.length-b.length];
	    for(int i=0;i<a.length/2;i++){
		b[i]=a[i];
	    }
	    for(int i=a.length/2;i<a.length;i++){
		c[i-b.length]=a[i];
	    }
	    return merge(mergesort(b),mergesort(c));
	}
    }
    public static ArrayList<String> mergesort(ArrayList<String> a){
	if(a.size()==1){
	    return a;
	}else{
	    ArrayList<String> b=new ArrayList<String>();
	    ArrayList<String> c=new ArrayList<String>();
	    for(int i=0;i<a.size()/2;i++){
		b.add(a.get(i));
	    }
	    for(int i=a.size()/2;i<a.size();i++){
		c.add(a.get(i));
	    }
	    return merge(mergesort(b),mergesort(c));
	}
    }
    public static void main(String[]args){
	int[] a= {1,4,5,7,9,14};
	int[] b= {2,5,7,15,16,17};
	int[] d={3,5,3,6,7,7,23,4,45,6,3,43,43,40,8,5,56,565};
	int[] c=mergesort(d);
	ArrayList<String> a1= new ArrayList<String>();
	a1.add("hello");
	a1.add("does this work?");
	a1.add("zero!");
	a1.add("apple");
	a1.add("vex");
	a1.add("bees");
	a1.add("haha");
	a1.add("you work?");
	ArrayList<String> c1= mergesort(a1);
	System.out.println(Arrays.toString(c));
	for(int i=0;i<c1.size();i++){
	    System.out.println(c1.get(i));
	}
    }
}
