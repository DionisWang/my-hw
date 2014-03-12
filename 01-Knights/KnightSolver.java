import java.io.*;
import java.util.*;

class KnightSolver{
    public String[][] grid;
    public int h,w;
    public boolean solved = false;
    final public String me="kn";
    final public String empty="__";
    public KnightSolver(int h, int w){
	grid= new String[h][w];
	for(int i=0;i<h;i++){
	    for(int j=0;j<w;j++){
		grid[j][i]=empty;
	    }
	}	
	this.h=h;
	this.w=w;
    }

    public String toString(){
	String s = "";
	int i,j;
	for(i=0;i<h;i++){
	    for(j=0;j<w;j++){
		s = s + grid[j][i]+" ";
	    }	    
	    s = s + "\n";
	}
	return s;
    }
	
    private void delay(int n){
	try{
	    Thread.sleep(n);
	}
	catch (InterruptedException e){
	    System.exit(0);
	}
    }
    public void solved(){
	int counter=0;
	for(int i=0;i<h;i++){
	    for(int j=0;j<w;j++){
		if(grid[j][i]!="__"){
		    counter++;
		}
	    }
	}
	if(counter==h*w){
	    solved= true;
	}
    }
    public void solve(int x,int y, int c){
	try{
	    if(grid[x][y]!=empty){
		return;
	    }
	}catch(ArrayIndexOutOfBoundsException e){
	    return;
	}
	if(c<10){
	    grid[x][y]="0"+c;
	}else{
	    grid[x][y]=""+c;
	}
	solved();
	if(solved){
	    System.out.println(this);
	    return;
	}
	solve(x+1,y+2,c+1);
	if (!solved )
	    solve(x+1,y-2,c+1);
	if (!solved )
	    solve(x+2,y+1,c+1);
	if (!solved)
	    solve(x+2,y-1,c+1);
	if (!solved)
	    solve(x-1,y+2,c+1);
	if (!solved)
	    solve(x-1,y-2,c+1);
	if (!solved)
	    solve(x-2,y+1,c+1);
	if (!solved)
	    solve(x-2,y-1,c+1);
	grid[x][y]="__";
    }

    public static void main(String[] args){
	KnightSolver m = new KnightSolver(5,5);
	m.solve(0,0,1);
    }

}
