//package JavaWillNurSpielen;

public class Vertex {

	public double x;
	public double y;
	
	public Vertex(double x, double y){
		this.x = x;		//2 x Werte; this.x als das x vom Objekt; x als fremder Wert
		this.y = y;		//2 y Werte; this.y als das y vom Objekt; y als fremder Wert
	}
	
	public String toString(){
		return "("+x+","+y+")";	//Ausgabe als nicht String, sondern als Wert
	}
	
	public double lenght(){
		return Math.sqrt(x*x+y*y);	//Wurzel aus x^2 & y^2
	}
}
