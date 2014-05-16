import java.util.*;
public class Test{
    public static void main(String[]args){
	TreeMap<Integer, Integer>  t=new TreeMap<Integer, Integer>();
	HashMap<Integer,Integer> h=new HashMap<Integer, Integer>();
	Random r=new Random();
	long startTime,stopTime,elapsedTime;
	int n = 1000000;
	//Tree Map adding
	startTime = System.currentTimeMillis();
	for(int i=0;i<n;i++){
	    t.put(i,r.nextInt(10000000));
	}
	stopTime = System.currentTimeMillis();
	elapsedTime = stopTime - startTime;
	System.out.println("TreeMap time adding: "+elapsedTime+"ms");
	//Hash Map adding
	startTime = System.currentTimeMillis();
	for(int i=0;i<n;i++){
	    h.put(i,r.nextInt(10000000));
	}
	stopTime = System.currentTimeMillis();
	elapsedTime = stopTime - startTime;
	System.out.println("HashMap time adding: "+elapsedTime+"ms");
	//Tree Map removing
	startTime = System.currentTimeMillis();
	for(int i=0;i<n;i++){
	    t.remove(i);
	}
	stopTime = System.currentTimeMillis();
	elapsedTime = stopTime - startTime;
	System.out.println("TreeMap time removing: "+elapsedTime+"ms");
	//Hash Map removing
	startTime = System.currentTimeMillis();
	for(int i=0;i<n;i++){
	    h.remove(i);
	}
	stopTime = System.currentTimeMillis();
	elapsedTime = stopTime - startTime;
	System.out.println("HashMap time removing: "+elapsedTime+"ms");
	//Tree Map searching
	startTime = System.currentTimeMillis();
	for(int i=0;i<n;i++){
	    t.get(i);
	}
	stopTime = System.currentTimeMillis();
	elapsedTime = stopTime - startTime;
	System.out.println("TreeMap time searching: "+elapsedTime+"ms");
	//Hash Map searching
	startTime = System.currentTimeMillis();
	for(int i=0;i<n;i++){
	    h.get(i);
	}
	stopTime = System.currentTimeMillis();
	elapsedTime = stopTime - startTime;
	System.out.println("HashMap time searching: "+elapsedTime+"ms");
    }
}