package uy.edu.ude.dto;

public class ValueDto {
	private int id;
	private String quote;
	
	public ValueDto(int id, String quote) {
		this.id = id;
		this.quote = quote;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}

}
