package dummy.model;

import com.google.gson.annotations.SerializedName;

public enum PaymentType {
	@SerializedName("CARD")
	CARD,
	@SerializedName("CASH")
	CASH
}
