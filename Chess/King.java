import java.util.*;
public class King extends Piece{
    public King(Coordinate location, int l, int w){
	super(location,l,w);
    }
    public void setImage(){
	super.setImage("bking.png","wking.png");
    }
    public ArrayList<Coordinate> getMoves(GameBoard g){
	moves(g);
	return moves;
    }
    public void moves(GameBoard g){
	moves = new ArrayList<Coordinate>();
	Piece temp=new NullPiece(l,w);
	try{
	    temp=g.getPiece(getx()+1,gety());
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx()+1,gety()));
	    }
	}catch(Exception e){}
	try{
	    temp=g.getPiece(getx()-1,gety());
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx()-1,gety()));
	    }
	}catch(Exception e){}
	try{
	    temp=g.getPiece(getx()+1,gety()+1);
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx()+1,gety()+1));
	    }
	}catch(Exception e){}
	try{
	    temp=g.getPiece(getx()+1,gety()-1);
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx()+1,gety()-1));
	    }
	}catch(Exception e){}
	try{
	    temp=g.getPiece(getx(),gety()-1);
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx(),gety()-1));
	    }
	}catch(Exception e){}
	try{
	    temp=g.getPiece(getx(),gety()+1);
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx(),gety()+1));
	    }
	}catch(Exception e){}
	try{
	    temp=g.getPiece(getx()-1,gety()+1);
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx()-1,gety()+1));
	    }
	}catch(Exception e){}
	try{
	    temp=g.getPiece(getx()-1,gety()-1);
	    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())||temp instanceof NullPiece){
		moves.add(new Coordinate(getx()-1,gety()-1));
	    }
	}catch(Exception e){}
    }
    public String toString(){
	return "K";
    }
}
