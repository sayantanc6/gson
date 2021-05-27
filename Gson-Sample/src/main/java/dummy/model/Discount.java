package dummy.model;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

@Component
public class Discount {

	@SerializedName("value")
	 private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Discount [value=" + value + "]";
	}
}
