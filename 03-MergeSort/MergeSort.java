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
    public static int[] mergesort(int[] a){
	if(a.length==1){
	    return a;
	}else{
	    int[]b=new int[a.length/2];
	    int[]c=new int[a.length-(a.length/2)];
	    for(int i=0;i<a.length/2;i++){
		b[i]=a[i];
	    }
	    for(int i=a.length/2;i<a.length;i++){
		c[i-(a.length/2)]=a[i];
	    }
	    return merge(mergesort(b),mergesort(c));
	}
    }
    public static void main(String[]args){
	int[] a= {1,4,5,7,9,14};
	int[] b= {2,5,7,15,16,17};
	int[] d={3,5,3,6,7,7,23,4,45,6,3,43,43,40,8,5,56,565};
	int[] c=mergesort(d);
	System.out.println(Arrays.toString(c));
    }
}
