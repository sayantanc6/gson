package dummy.model;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

@Component
public class UserNested1 {

	//@SerializedName("name")
	private String name;
	
	//@SerializedName("email")
	private String email;
	
	//@SerializedName("isDeveloper")
	private boolean isDevelopers;
	
	//@SerializedName("age")
	private int age;
	
	//@SerializedName("userAddress")
	UserAddress1 userAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isDevelopers() {
		return isDevelopers;
	}

	public void setDevelopers(boolean isDevelopers) {
		this.isDevelopers = isDevelopers;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserAddress1 getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(UserAddress1 userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserNested1 [name=" + name + ", email=" + email + ", isDevelopers=" + isDevelopers + ", age=" + age
				+ ", userAddress=" + userAddress + "]";
	}
}
