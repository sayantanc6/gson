package dummy.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

@Component
public class Order {

	@SerializedName("orderFinishDate")
	private String orderFinishDate;
	
	@SerializedName("paymentType")
    private PaymentType paymentType;
	
	@SerializedName("discount")
    private Discount discount;
	
	@SerializedName("deliveryData")
    private DeliveryData deliveryData;
	
	@SerializedName("orderingUser")
    private User orderingUser;
	
	@SerializedName("orderedProducts")
    private List<Product> orderedProducts;
	
	@SerializedName("offeringShop")
    private Shop offeringShop;
	
	@SerializedName("orderId")
    private int orderId;
	
	@SerializedName("status")
    private OrderStatus status;
	
	@SerializedName("orderDate")
    private LocalDate orderDate;
	
	public String getOrderFinishDate() {
		return orderFinishDate;
	}
	public void setOrderFinishDate(String orderFinishDate) {
		this.orderFinishDate = orderFinishDate;
	}
	public PaymentType getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public DeliveryData getDeliveryData() {
		return deliveryData;
	}
	public void setDeliveryData(DeliveryData deliveryData) {
		this.deliveryData = deliveryData;
	}
	public User getOrderingUser() {
		return orderingUser;
	}
	public void setOrderingUser(User orderingUser) {
		this.orderingUser = orderingUser;
	}
	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	public Shop getOfferingShop() {
		return offeringShop;
	}
	public void setOfferingShop(Shop offeringShop) {
		this.offeringShop = offeringShop;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [orderFinishDate=" + orderFinishDate + ", paymentType=" + paymentType + ", discount=" + discount
				+ ", deliveryData=" + deliveryData + ", orderingUser=" + orderingUser + ", orderedProducts="
				+ orderedProducts + ", offeringShop=" + offeringShop + ", orderId=" + orderId + ", status=" + status
				+ ", orderDate=" + orderDate + "]";
	}
}
