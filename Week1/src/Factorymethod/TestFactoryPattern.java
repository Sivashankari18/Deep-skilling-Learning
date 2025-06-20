package Factorymethod;
import java.util.*;

public class TestFactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		DocumentFactory factory=null;
		
		System.out.println("Enter Document Factory (word,pdf,excel): ");
		
		String input=scn.nextLine().toLowerCase();
		
		switch(input) {
		  
		case "word" :
			factory=new wordDocumentFactory();
			break;
			
		case "pdf" :
			factory=new PDFDocumentFactory();
			break;
			
		case "excel" :
			factory=new ExcelDocumentFactory();
			break;
			
		default :
			System.out.println("Unknown document type. Please enter word,pdf or excel.");
			System.exit(0);
		}
		
		Document document= factory.createDocument();
		document.open();
		
		scn.close();
		

	}

}
