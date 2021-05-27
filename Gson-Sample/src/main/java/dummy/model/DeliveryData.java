package dummy.model;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

@Component
public class DeliveryData {

	@SerializedName("numOfPackages")
	private int numOfPackages;

	public int getNumOfPackages() {
		return numOfPackages;
	}

	public void setNumOfPackages(int numOfPackages) {
		this.numOfPackages = numOfPackages;
	}

	@Override
	public String toString() {
		return "DeliveryData [numOfPackages=" + numOfPackages + "]";
	}
}
