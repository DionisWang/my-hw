import java.util.*;
public class Median{
    private PriorityQueue<Integer> max,min;
    private double median;
    public Median(){
	max= new PriorityQueue<Integer>();
	min= new PriorityQueue<Integer>();
	median=0;
    }
    public void add(int x){
	if(x<median){
	    max.add(0-x);
	}else{
	    min.add(x);
	}
	balance();
	findMedian();
    }
    public void balance(){
	while(max.size()<min.size()){
	    max.add(0-min.poll());
	}
	while(min.size()<max.size()-1){
	    min.add(0-max.poll());
	}
    }
    public double findMedian(){
	if(max.size()==0){
	    return 0;
	}
	if(max.size()>min.size()){
	    median= 0-max.peek();
	}else{
	    median= (double)(0-max.peek()+min.peek())/2;
	}
	return median;
    }
    public double removeMedian(){
	if(max.size()==0){
	    return 0;
	}
	double tmp=0;
	if(max.size()>min.size()){
	    tmp= 0-max.poll();
	}else{
	    tmp= (double)(0-max.poll()+min.poll())/2;
	}
	balance();
	findMedian();
	return tmp;
    }
}
