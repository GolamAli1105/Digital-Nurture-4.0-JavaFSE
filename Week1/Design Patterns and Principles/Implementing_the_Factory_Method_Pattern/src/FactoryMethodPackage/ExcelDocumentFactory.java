package FactoryMethodPackage;

public class ExcelDocumentFactory extends DocumentFactory {
	public Document createDocument() {
		return new ExcelDocument();
	}
}
