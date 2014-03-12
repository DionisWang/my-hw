import java.util.*;
public class QuickSort{
    public static int[] qsort(int[] a){
	if(a.length<=1){
	    return a;
	}
	Random r=new Random();
	ArrayList<Integer> lower=new ArrayList<Integer>();	
	ArrayList<Integer> upper=new ArrayList<Integer>();
	int p=a[r.nextInt(a.length)];
	for(int i=0;i<a.length;i++){
	    if(a[i]<p){
		lower.add((Integer)a[i]);
	    }else if(a[i]>p){
		upper.add((Integer)a[i]);
	    }
	}
	int[] u=new int[upper.size()];
	int[] l=new int[lower.size()];
	for(int i=0;i<u.length;i++){
	    u[i]=upper.get(i);
	}
	for(int i=0;i<l.length;i++){
	    l[i]=lower.get(i);
	}
	u=qsort(u);
	l=qsort(l);
	int[] all= new int[u.length+l.length+1];
	for(int i=0;i<all.length;i++){
	    if(i<l.length){
		all[i]=l[i];
	    }else if(i>l.length){
		all[i]=u[i-l.length-1];
	    }else{
		all[i]=p;
	    }
	}
	return all;
    }
    public static void main(String[] args){
	int[] a={1,999,5,6,2,15,36,85,9,3,4,5,5,6,7,5,456,7,4,0};
	System.out.println(Arrays.toString(qsort(a)));
    }
}
