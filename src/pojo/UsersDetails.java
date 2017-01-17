package pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="userDetails")
public class UsersDetails {
	private Integer id;
	private List<Address> address=new ArrayList<Address>();
	private List<ContactNmber> contact=new ArrayList<ContactNmber>();
	private List<LinksTable>socialLinks=new ArrayList<LinksTable>();
	private Date dob;
	private String bio;
	private Byte[] profileImage;
	/**
	 * 
	 */
	public UsersDetails() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param address
	 * @param contact
	 * @param socialLinks
	 * @param dob
	 * @param bio
	 * @param profileImage
	 */
	public UsersDetails(Integer id, List<Address> address,
			List<ContactNmber> contact, List<LinksTable> socialLinks, Date dob,
			String bio, Byte[] profileImage) {
		super();
		this.id = id;
		this.address = address;
		this.contact = contact;
		this.socialLinks = socialLinks;
		this.dob = dob;
		this.bio = bio;
		this.profileImage = profileImage;
	}
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@ElementCollection
	@CollectionTable(name = "User_adrs", joinColumns = { @JoinColumn(name = "user_id") })
	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@ElementCollection
	@CollectionTable(name = "User_Contact", joinColumns = { @JoinColumn(name = "user_id") })
	
	public List<ContactNmber> getContact() {
		return contact;
	}
	public void setContact(List<ContactNmber> contact) {
		this.contact = contact;
	}
	@ElementCollection
	@CollectionTable(name = "User_Links", joinColumns = { @JoinColumn(name = "user_id") })
	
	public List<LinksTable> getSocialLinks() {
		return socialLinks;
	}
	public void setSocialLinks(List<LinksTable> socialLinks) {
		this.socialLinks = socialLinks;
	}
	@Temporal(TemporalType.DATE)
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Column(length=120)
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	public Byte[] getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(Byte[] profileImage) {
		this.profileImage = profileImage;
	}
	@Override
	public String toString() {
		return "UsersDetails [id=" + id + ", address=" + address + ", contact="
				+ contact + ", socialLinks=" + socialLinks + ", dob=" + dob
				+ ", bio=" + bio + ", profileImage="
				+ Arrays.toString(profileImage) + "]";
	}
	
	
	
}
