package core.spring;

public class Address {
	
	private String addressline1;
	private String city;
	private String state;
	private String country;
	
	
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [addressline1=" + addressline1 + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}
	
	
	
	
	

}
