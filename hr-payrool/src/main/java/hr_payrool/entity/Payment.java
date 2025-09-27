package hr_payrool.entity;

import java.io.Serializable;
import java.util.Objects;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailylncome;
	private Integer days;

	public Payment() {
	
	}

	public Payment(String name, double dailylncome, Integer days) {
		super();
		this.name = name;
		this.dailylncome = dailylncome;
		this.days = days;
	}

	public double getTotal() {
		return days * dailylncome;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDailylncome() {
		return dailylncome;
	}
	public void setDailylncome(double dailylncome) {
		this.dailylncome = dailylncome;
	}
	public Integer getDays() {
		return days;
	}
	public void setDays(Integer days) {
		this.days = days;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dailylncome, days, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Double.doubleToLongBits(dailylncome) == Double.doubleToLongBits(other.dailylncome)
				&& Objects.equals(days, other.days) && Objects.equals(name, other.name);
	}
	
	
	
	

}
