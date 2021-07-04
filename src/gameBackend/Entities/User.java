package gameBackend.Entities;

public class User {

	int id;
	String name;
	String nationalityId;
	String mail;
	String password;

	public User () {}
	
	public User(int id, String name, String nationalityId, String mail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.nationalityId = nationalityId;
		this.mail = mail;
		this.password = password;
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

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
