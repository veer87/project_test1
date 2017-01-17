package pojo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class LinksTable {
	String linkName;

	/**
	 * 
	 */
	public LinksTable() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param linkName
	 */
	public LinksTable(String linkName) {
		super();
		this.linkName = linkName;
	}
	@Column(length=80)
	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	@Override
	public String toString() {
		return "LinksTable [linkName=" + linkName + "]";
	}
	
}
