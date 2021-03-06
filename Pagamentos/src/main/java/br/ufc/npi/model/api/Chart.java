package br.ufc.npi.model.api;

public class Chart {

	private String type;
	private Data data;
	
	public Chart(String type, Data data) {
		super();
		this.type = type;
		this.data = data;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
}
