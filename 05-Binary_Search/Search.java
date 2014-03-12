import java.util.*;
public class Search{
    public static int rbsearch(int n, int[]L){
	int z=L.length/2;
	if(z==0){
	    z=1;
	}
	int a=L.length-z;
	int b=0;
	int c[]={};
	try{
	    if(L[a]==n){
		return a;
	    }else if(L[a]>n){
		c= new int[a];
		for(int i=0;i<a;i++){
		    c[i]=L[i];
		}
	    }else{
		c = new int[L.length-(a+1)];
		for(int i=a+1;i<L.length;i++){
		    c[i-(a+1)]=L[i];
		}
		b=a+1;
	    }
	    int d=rbsearch(n,c);
	    if(d<0){
		return -1;
	    }else{
		return d+b;
	    }
	}
	catch(ArrayIndexOutOfBoundsException e){
	    return -1;
	}
    }
    public static int ibsearch(int n,int[]L){
	int counter =L.length/2;
	int c2=L.length/4;
	for(int a=0;a<L.length/2+1;a++){
	    if(c2==0){
		c2=1;
	    }
	    try{
		if(L[counter]==n){
		    return counter;
		}else if(L[counter]>n){
		    counter-=c2;
		}else{
		    counter+=c2;
		}	
	    }catch(ArrayIndexOutOfBoundsException e){
		return -1;
	    }
	    c2=c2/2;
	}
	return -1;
    }
    public static void main(String[]args){
	int[]L={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	for(int i=0;i<L.length;i++){
	    System.out.println(ibsearch(i,L));
	}
	System.out.println(ibsearch(166,L)+"\n\n");
	
	for(int i=0;i<L.length;i++){
	    System.out.println(rbsearch(i,L));
	}
	System.out.println(rbsearch(166,L));
    }
}
