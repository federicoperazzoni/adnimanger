package jena.test1;

import java.util.List;

import com.hp.hpl.jena.rdf.model.Statement;

public class Test2 {

	public static void main(String[] args) {
		
		TDBConnection tdbConnection = new TDBConnection("C:\\TDBDatabase");
		
		//tdbConnection.addStatement("Animal", "federico", "isA", "mammal");
		
		List<Statement> lista = tdbConnection.getStatements("Animal", "federico", null, null);
		
		tdbConnection.close();
		
		System.out.println("fine");
	}

}
