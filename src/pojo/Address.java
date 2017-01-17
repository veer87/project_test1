package pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String country;
	private int pin;
	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default constructor of Address");
	}
	/**
	 * @param line1
	 * @param line2
	 * @param city
	 * @param state
	 * @param country
	 * @param pin
	 */
	public Address(String line1, String line2, String city, String state,
			String country, int pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	@Column(length=80)
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	@Column(length=80)
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	@Column(length=20)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(length=20)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(length=20)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(length=6)
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city="
				+ city + ", state=" + state + ", country=" + country + ", pin="
				+ pin + "]";
	}
	
}
