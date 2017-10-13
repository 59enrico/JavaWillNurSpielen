
public class TestVertex {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex (4,76);	//definiere irgendein Punkt für Vertex unter Vertex v1
	//	Vertex v2 = v1.skalarMult(3.5);	//neues Vertex aus kopie von v1*double s Wert in Klammern hier: 3.5
		
	//	Vertex v3 = v1.add(v2);			//addiere v2 auf v1 als v3
		//oder
		//v1.addMod(v2);					//als Befehl v1 addiere v2 auf dich drauf, v1+v2 wird später unter v1 ausgegeben nicht wie in Z.9 als v3
		
		
		System.out.println(v1);			//Ausgabe des Punktes als String
	//	System.out.println(v2);			//Ausgabe von v2
	//	System.out.println(v3);			//Ausgabe von v3
	
	//	System.out.println(v1.length());	//Ausgabe des Abstandes des Punktes vom Ursprung
		
		v1.normalize();
		System.out.println(v1);
		System.out.println(v1.getX()+v1.getY());
		
	
	}

}
