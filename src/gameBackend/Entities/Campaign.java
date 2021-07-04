package gameBackend.Entities;

public class Campaign {

	int id;
	String name;
	String campaignCode;
	int discount;
	String details;

	public Campaign() {
	}

	public Campaign(int id, String name, String campaignCode, int discount, String details) {
		super();
		this.id = id;
		this.name = name;
		this.campaignCode = campaignCode;
		this.discount = discount;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
