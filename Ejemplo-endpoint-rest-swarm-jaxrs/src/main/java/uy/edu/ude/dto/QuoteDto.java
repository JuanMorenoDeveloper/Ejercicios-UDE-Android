package uy.edu.ude.dto;

public class QuoteDto {
	private String type;
	private ValueDto value;
	
	public QuoteDto(String type, ValueDto value) {
		this.type = type;
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ValueDto getValue() {
		return value;
	}
	public void setValue(ValueDto value) {
		this.value = value;
	}

}
