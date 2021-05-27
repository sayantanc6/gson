package dummy.model;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

@Component
public class Shop {

	@SerializedName("name")
	private String name;
	
	@SerializedName("sellerName")
	private String sellerName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", sellerName=" + sellerName + "]";
	}
}
