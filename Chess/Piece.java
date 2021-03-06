import java.util.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

public abstract class Piece{
    Player owner;
    int l, w;
    Coordinate location;
    boolean first;
    ArrayList<Coordinate> moves;
    JButton avatar;
    BufferedImage buttonIcon;
    public Piece(Player a, Coordinate location, int l, int w){
	this.l = l;
	this.w = w;
	setPlayer(a);
	setLocation(location);
        avatar = new JButton();
    }
    public Piece(Coordinate location, int l, int w){
	this(new Player(true),location,l,w);
	first=true;
    }
    public void setFirst(boolean a){
	first=a;
    }
    public boolean isFirst(){
	return first;
    }
    public void setLocation(Coordinate l){
	location=l;
    }
    public void setImage(String bpath, String wpath){
        if(owner.isWhite()){
	    try{
		buttonIcon = ImageIO.read(new File(wpath));
	    } catch(IOException e){
		System.out.println("File not found: " + e.getMessage());
	    }
	    avatar = new JButton(new ImageIcon(buttonIcon));
        } else {           
	    try{
	        buttonIcon = ImageIO.read(new File(bpath));
	    } catch (IOException e){
		System.out.println("File not found: " + e.getMessage());
	    }
	    avatar = new JButton(new ImageIcon(buttonIcon));
	}
	    avatar.setBorder(BorderFactory.createEmptyBorder());
	    avatar.setContentAreaFilled(false);
    }
    public boolean isWhite(){
	return owner.isWhite();
    }
    public int getx(){
	return location.getx();
    }
    public int gety(){
	return location.gety();
    }
    public void setxy(int x, int y){
	location.setxy(x,y);
    }
    protected void setPlayer(Player p){
	owner = p;
    }
    public Coordinate getLocation(){
	return location;
    }
    public JButton getAvatar(){
	return avatar;
    }
    //------------------------- Rook Moves ----------------------------
    public void rook(GameBoard g){
	Piece temp= new NullPiece(getLocation(),l,w);
	boolean done=false;
	for(int i=1;i<l-gety();i++){
	    if(!done){
		temp=g.getPiece(getx(),gety()+i);
		if(temp instanceof NullPiece){	    
		    moves.add(new Coordinate(getx(),gety()+i));
		}else{
		    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			moves.add(new Coordinate(getx(),gety()+i));
		    }
		    done=true;
		}
	    }
	}
	done=false;
	for(int i=1;i<gety()+1;i++){
	    if(!done){
		temp=g.getPiece(getx(),gety()-i);
		if(temp instanceof NullPiece){	    
		    moves.add(new Coordinate(getx(),gety()-i));
		}else{
		    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			moves.add(new Coordinate(getx(),gety()-i));
		    }
		    done=true;
		}
	    }
	}
	done=false;
	for(int i=1;i<w-getx();i++){
	    if(!done){
		temp=g.getPiece(getx()+i,gety());
		if(temp instanceof NullPiece){
		    moves.add(new Coordinate(getx()+i,gety()));	    
		}else{
		    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			moves.add(new Coordinate(getx()+i,gety()));
		    }
		    done=true;
		}
	    }
	}
	done=false;
	for(int i=1;i<getx()+1;i++){
	    if(!done){
		temp=g.getPiece(getx()-i,gety());
		if(temp instanceof NullPiece){
		    moves.add(new Coordinate(getx()-i,gety()));	    
		}else{
		    if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			moves.add(new Coordinate(getx()-i,gety()));
		    }
		    done=true;
		}
	    }
	}
    }
    //------------------------------Bishop moves -----------------------------
    public void bishop(GameBoard g){
	Piece temp= new NullPiece(l,w);
	boolean d1=false;
	boolean d2=false;
	boolean d3=false;
	boolean d4=false;
	int i=1;
	while(i<l&&i<w){
	    if(!d1){
		try{
		    temp=g.getPiece(getx()+i,gety()+i);
		    if(temp instanceof NullPiece){	    
			moves.add(new Coordinate(getx()+i,gety()+i));
		    }else{ 
			if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			moves.add(new Coordinate(getx()+i,gety()+i));
			}
			d1=true;
		    }
		}catch(Exception e){}
	    }
	    if(!d2){
		try{
		    temp=g.getPiece(getx()-i,gety()-i);
		    if(temp instanceof NullPiece){	    
			moves.add(new Coordinate(getx()-i,gety()-i));
		    }else{
			if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			moves.add(new Coordinate(getx()-i,gety()-i));
			}
			d2=true;
		    }
		}catch(Exception e){}
	    }
	    if(!d3){
		try{
		    temp=g.getPiece(getx()-i,gety()+i);
		    if(temp instanceof NullPiece){	    
			moves.add(new Coordinate(getx()-i,gety()+i));
		    }else{
			if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			    moves.add(new Coordinate(getx()-i,gety()+i));
			}
			d3=true;
		    }
		}catch(Exception e){}
	    }
	    if(!d4){
		try{
		    temp=g.getPiece(getx()+i,gety()-i);
		    if(temp instanceof NullPiece){	    
			moves.add(new Coordinate(getx()+i,gety()-i));
		    }else{
			if((temp.isWhite()&&!isWhite())||(!temp.isWhite()&&isWhite())){
			moves.add(new Coordinate(getx()+i,gety()-i));
			}
			d4=true;
		    }
		}catch(Exception e){}
	    }
	    i++;
	}
    }
}
