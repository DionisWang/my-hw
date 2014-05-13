public class MaxHeap{
    private int[] pointer;
    
    public MaxHeap(){
	pointer = new int[11];
    }
    
    public int findMax(){
	return pointer[1];
    }
    public int removeMax(){
	int temp=pointer[1];
	pointer[1]=pointer[pointer[0]];
	pointer[pointer[0]]=temp;
	pointer[0]--;
	pushDown(1);
	return temp;
    }
    public void pushDown(int n){
	int a=0;
	if(2*n+1>pointer[0]||2*n>pointer[0]){
	    return;
	}
	if(pointer[2*n]<pointer[2*n+1]){
	    a=1;
	}
	if(pointer[n]<pointer[2*n+a]){
	    int temp=pointer[n];
	    pointer[n]=pointer[2*n+a];
	    pointer[2*n+a]=temp;
	    pushDown(2*n+a);
	}
    }
    
    public void siftUp(int a){
	if(a/2!=0&&pointer[a/2]<pointer[a]){
	    int temp=pointer[a/2];
	    pointer[a/2]=pointer[a];
	    pointer[a]=temp;
	    siftUp(a/2);
	}
    }
    public void add(int n){
	pointer[0]++;
	pointer[pointer[0]]=n;
	siftUp(pointer[0]);
    }
    public int size(){
	return pointer[0];
    }
    public String toString(){
	String s="";
	for(int i=0;i<pointer.length;i++){
	    s+=pointer[i]+" ";
	}
	return s;
    }
}
    
