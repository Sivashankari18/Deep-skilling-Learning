package Factorymethod;

public class wordDocumentFactory extends DocumentFactory {
	public Document createDocument() {
		return new wordDocument();
	}

}
