package jena.test1;

public class Test1 {
	
	
	public static void main(String[] args) {
		
		TDBConnection tdbConnection = new TDBConnection("C:\\TDBDatabase");
		
		tdbConnection.loadModel("Animal", "C:\\Users\\fperazzoni\\Downloads\\animal2.owl");
		
	}
}
