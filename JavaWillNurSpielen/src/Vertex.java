//package JavaWillNurSpielen;

public class Vertex {

	public double x;
	public double y;
	//public double s;
	
	public Vertex(double x, double y) {
		this.x = x;		//2 x Werte; this.x als das x vom Objekt; x als fremder Wert
		this.y = y;		//2 y Werte; this.y als das y vom Objekt; y als fremder Wert
		//this.s = s;
	}
	
	public String toString() {
		return "("+x+","+y+")";	//Ausgabe als nicht String, sondern als Wert
	}
	
	public double lenght() {
		return Math.sqrt(x*x+y*y);	//Wurzel aus x^2 & y^2
	}

	public Vertex skalarMult(double s) {
		return new Vertex(x*s,y*s);
	}
	
	public void skalarMultMod(double s) {
		x=x*s;
		y=y*s;
	}
	
	public Vertex add(Vertex v) {
		return new Vertex(v.x+x, v.y+y);
	}
	
	public void addMod(Vertex v) {
		x=v.x+x;
		y=v.y+y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	public double getX() {return x;} 
	
	public double getY() {return y;}
	
}
