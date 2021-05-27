package dummy.model;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

@Component
public class UserAddress1 {

	//@SerializedName("street")
	private String street;
	
	//@SerializedName("houseNumber")
	private String houseNumber;
	
	//@SerializedName("city")
	private String city;
	
	//@SerializedName("country")
	private String country;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserAddress1 [street=" + street + ", houseNumber=" + houseNumber + ", city=" + city + ", country="
				+ country + "]";
	}
}
