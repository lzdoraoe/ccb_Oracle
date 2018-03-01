package springBoot.bean;

public class User {
	private int uId;
	private String uName;
	private String uPassword;
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public User(int uId, String uName, String uPassword) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPassword = uPassword;
	}
	public User(String uName, String uPassword) {
		super();
		this.uName = uName;
		this.uPassword = uPassword;
	}
	
}