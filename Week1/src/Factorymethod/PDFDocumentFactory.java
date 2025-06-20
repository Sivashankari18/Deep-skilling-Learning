package Factorymethod;

public class PDFDocumentFactory extends DocumentFactory{
	public Document createDocument() {
		return new PdfDocument();
	}
}