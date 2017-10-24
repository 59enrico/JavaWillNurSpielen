
public class GeometricObject {

	public Vertex pos;
	public double width;
	public double height;
	
	public double getWidth() {return width;}
	public double getHeight() {return height;}
	public Vertex getPos() {return pos;}	
	
public GeometricObject(Vertex pos, double width, double height){
	this.pos=pos;
	this.width=width;
	this.height=height;
	  
	if(width<0){
		width=-width;
		pos.x=pos.x-width;
	}
  
  
	if(height<0){
		height=-height;
		pos.y=pos.y-height;
	}
}

public GeometricObject(double width, double height){
	this(new Vertex(0,0), width, height);
}

public GeometricObject(double width){
	this(width, width);
}

public GeometricObject(){this(10);}

public GeometricObject(Vertex pos){this(pos,0,0);}

public String toString() {
	return "width="+width+",height="+height+", pos="+pos+"";
}

public double circumference() {return 2*(width+height);}

public double area() {return width*height;}

public boolean contains(Vertex v) {
	return (v.x >= pos.x && v.x <= pos.x + width) &&	//if true x is within
			(v.y >= pos.y && v.y <= pos.y + height);	//if true y is within
}														//if both true object is within

public boolean isLargerThan(GeometricObject that) {
	return this.area() > that.area();
}

public void moveTo(Vertex v) {this.pos=v;}

public void moveTo(double x, double y) {
	moveTo(new Vertex(x,y));
}

public boolean equals(Object thatObject){
	if(thatObject instanceof GeometricObject) {
		GeometricObject that = (GeometricObject) thatObject;
		return this.width==that.width
			&& this.height==that.height
			&& this.pos.equals(that.pos);
	}
	return false;
}

}
