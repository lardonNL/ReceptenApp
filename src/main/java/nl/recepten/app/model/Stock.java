package nl.recepten.app.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	
@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private int amount; 
	private QuantityType amountType; 
	private Date expirationDate; 
	private Boolean availableToOthers;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public QuantityType getAmountType() {
		return amountType;
	}
	public void setAmountType(QuantityType amountType) {
		this.amountType = amountType;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public Boolean getAvailableToOthers() {
		return availableToOthers;
	}
	public void setAvailableToOthers(Boolean availableToOthers) {
		this.availableToOthers = availableToOthers;
	} 
	
	
	
}
