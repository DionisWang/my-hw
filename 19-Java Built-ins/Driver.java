public class Driver{
    public static void main(String[]args){
	Median m=new Median();
	m.add(89);
	m.add(99);
	m.add(78);
	m.add(105);
	m.add(34);
	m.add(23);
	m.add(59);
	System.out.println(m.findMedian());
	System.out.println(m.removeMedian());
	System.out.println(m.removeMedian());
	System.out.println(m.removeMedian());
	System.out.println(m.removeMedian());
	System.out.println(m.removeMedian());
	System.out.println(m.removeMedian());
    }
}
