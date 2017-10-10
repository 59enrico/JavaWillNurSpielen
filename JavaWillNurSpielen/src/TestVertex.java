
public class TestVertex {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex (2,2);	//definiere irgendein Punkt für Vertex unter Vertex v1
		Vertex v2 = v1.skalarMult(3.5);	//neues Vertex aus kopie von v1*double s Wert in Klammern hier: 3.5
		
		System.out.println(v1);			//Ausgabe des Punktes als String
		System.out.println(v2);			//Ausgabe von v2
	
		System.out.println(v1.lenght());	//Ausgabe des Abstandes des Punktes vom Ursprung
		
	}

}
