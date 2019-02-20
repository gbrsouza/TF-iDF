package algorithms;

import java.util.HashMap;

public class Document {

	/**
	 * Attributes
	 */
	
	private String url;
	private int numberOfTerms;
	private HashMap<String, Integer> tableTermOccurrence;
	private Parser parser;
	
	/**
	 * Construct 
	 * @param url The url of document
	 */
	public Document ( String url )
	{
		this.url = url;
		this.parser = new Parser(url);
		this.tableTermOccurrence = parser.run();
		
		this.numberOfTerms = 0;
		for (String s : this.tableTermOccurrence.keySet())
			numberOfTerms += this.tableTermOccurrence.get(s);
	}
	
	public void printTerms ()
	{
		for (String name: this.tableTermOccurrence.keySet()){
			String key = name.toString();
			String value = this.tableTermOccurrence.get(name).toString();  
			System.out.println(key + " | " + value);  
		}
	}
	
	public String getDocumentName ()
	{
		String [] name = url.split("/");
		return name[name.length-1];
	}

	/**
	 * Getters and Setters
	 */
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNumberOfTerms() {
		return numberOfTerms;
	}

	public void setNumberOfTerms(int numberOfTerms) {
		this.numberOfTerms = numberOfTerms;
	}

	
	public HashMap<String, Integer> getTableTermOccurrence() {
		return tableTermOccurrence;
	}

	public void setTableTermOccurrence(HashMap<String, Integer> tableTermOccurrence) {
		this.tableTermOccurrence = tableTermOccurrence;
	}

	
}
