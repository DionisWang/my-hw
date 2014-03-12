import java.util.*;
public class Quick{
    public static int quickselect(int[] a, int k, int low, int high){
	if(low>=high){
	    return a[low];
	}
	int[]temp=new int[a.length];
	Random r=new Random();
	int p=a[r.nextInt(high-low)+low];
	int cl=0;
	int ch=a.length-1;
	int cm=0;
	for(int i=0;i<a.length;i++){
	    if(a[i]<p){
		temp[cl]=a[i];
		cl++;
	    }else if(a[i]>p){
		temp[ch]=a[i];
		ch--;
	    }else{
		cm++;
	    }
	}
	for(int i=0;i<cm;i++){
	    temp[cl]=p;
	    if(cl==k){
		return temp[cl];
	    }
	    cl++;
	}
	cl--;
	if(cl>k){
	    high=cl-1;
	}else{
	    low=cl+1;
	}
	return quickselect(temp,k,low,high);
    }
    public static void main(String[] args){
	int[] a={1,3,4,5,5,6,7,0};
	for(int i=0;i<a.length;i++){
	    System.out.println(quickselect(a,i,0,a.length-1));
	}
    }
}
