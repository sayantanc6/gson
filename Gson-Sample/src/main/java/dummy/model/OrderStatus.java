package dummy.model;

import com.google.gson.annotations.SerializedName;

public enum OrderStatus {
	
	@SerializedName("PROCESSING")
	PROCESSING,
	
	@SerializedName("BUILD")
	BUILD,
	
	@SerializedName("SHIPPED")
	SHIPPED,
	
	@SerializedName("DELIVERED")
	DELIVERED
}
