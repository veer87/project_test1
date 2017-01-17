package pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ContactNmber {
	String mobNumber;

	/**
	 * 
	 */
	public ContactNmber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param mobNumber
	 */
	public ContactNmber(String mobNumber) {
		super();
		this.mobNumber = mobNumber;
	}
	@Column(length=10)
	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

	@Override
	public String toString() {
		return "ContactNmber [mobNumber=" + mobNumber + "]";
	}
	
}
