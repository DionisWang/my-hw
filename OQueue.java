public class OQueue{
    private String[] q;
    private int h,t,max;
    public OQueue(){
	this(10);
    }
    public OQueue(int x){
	q=new String[x];
	max=x;
	h=0;
	t=0;
    }
    public void enqueue(String x){
	if(!max()){
	    q[t]=x;
	    t=(t+1)%max;
	}else{
	    System.out.println("List is maxed out!");
	}
    }
    public String dequeue(){
	String x="";
	x=q[h];
	h=(h+1)%max;
	return x;
    }
    public boolean max(){
	return Math.abs(h-t)==max;
    }
    public String front(){
	return q[h];
    }
    public int length(){
	return Math.abs(h-t);
    }
    public String toString(){
	String s="";
	for(int i=h;i<(h-t)%max;i++){
	    s+=q[i%max]+" ";
	}
	return s;
    }
}