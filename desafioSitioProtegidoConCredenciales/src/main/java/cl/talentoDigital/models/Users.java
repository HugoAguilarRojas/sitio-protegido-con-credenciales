package cl.talentoDigital.models;

import java.io.Serializable;

public class Users implements Serializable {
	private String email;
	private String password;
	private Role role;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}

	public Users(String email, String password, Role role) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
	
}
