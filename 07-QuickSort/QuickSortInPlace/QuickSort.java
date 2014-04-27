import java.util.*;
public class QuickSort{
    public static int partition(int[] a, int l, int r){
	Random rnd=new Random();
	int ind=rnd.nextInt(r-l)+l;
	int p=a[ind];
	int wall=0;
	int temp=0;
	temp=a[r];
	a[r]=p;
	a[ind]=temp;
	for(int i=0;i<r-l;i++){
	    if(a[i+l]<=p){
		temp=a[wall+l];
		a[wall+l]=a[i+l];
		a[i+l]=temp;
		wall++;
	    }
	}
	temp=a[wall+l];
	a[wall+l]=p;
	a[r]=temp;
	return wall+l;
    }
    public static int[] qsort(int[] a,int l, int r){
	if(l>=r){
	    return a;
	}else{
	    int p=partition(a,l,r);
	    qsort(a,p+1,r);
	    qsort(a,l,p-1);
	    return a;
	}
    }
    public static int[] qsort(int[] a){
	return qsort(a,0,a.length-1);
    }
    public static void main(String[] args){
	int[] a={49878,654,654,65433,55,6,32,6,532};
	System.out.println(Arrays.toString(qsort(a)));
    }
}
