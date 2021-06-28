package practice.model;

public class Client {
	
	private ClientData clientData;
	private String address;
	private String country;
	public ClientData getClientData() {
		return clientData;
	}
	public void setClientData(ClientData clientData) {
		this.clientData = clientData;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString()
	{
		return address;
	}
	

}
