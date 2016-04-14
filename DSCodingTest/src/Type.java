
public class Type {

	//Setting and Getting required variables
	private String description;
	private String hotResponse;
	private String coldResponse;
	

	Type(String desc, String hotResp, String coldResp){
		this.description = desc;
		this.hotResponse= hotResp;
		this.coldResponse = coldResp;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHotResponse() {
		return hotResponse;
	}

	public void setHotResponse(String hotResponse) {
		this.hotResponse = hotResponse;
	}

	public String getColdResponse() {
		return coldResponse;
	}

	public void setColdResponse(String coldResponse) {
		this.coldResponse = coldResponse;
	}

	public String toString()
	{
		return this.description+" ";
	}


}
