import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import java.awt.Color;
public class Jumper extends Actor{
    public Jumper(){
        super();
    }
    public void act(){
	try{
	    int x=getLocation().getRow();
	    int y=getLocation().getCol();
	    if(getDirection()==45){
		moveTo(new Location(x+2,y+2));
	    }else if(getDirection()==0){
		moveTo(new Location(x,y+2));
	    }else if(getDirection()==90){
		moveTo(new Location(x+2,y));
	    }else if(getDirection()==135){
		moveTo(new Location(x+2,y-2));
	    }else if(getDirection()==180){
		moveTo(new Location(x,y-2));
	    }else if(getDirection()==225){
		moveTo(new Location(x-2,y-2));
	    }else if(getDirection()==270){
		moveTo(new Location(x-2,y));
	    }else if(getDirection()==315){
		moveTo(new Location(x-2,y+2));
	    }
	}catch(Exception e){
	    setDirection(getDirection()+45);
	    act();
	}
    }
}
