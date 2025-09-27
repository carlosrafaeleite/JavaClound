package hr_payrool.entity;

import java.io.Serializable;
import java.util.Objects;

public class Worker implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private double dailyincome;
	
	public Worker() {
	
	}

	public Worker(Long id, String name, double dailyincome) {
		super();
		this.id = id;
		this.name = name;
		this.dailyincome = dailyincome;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDailyincome() {
		return dailyincome;
	}
	public void setDailyincome(double dailyincome) {
		this.dailyincome = dailyincome;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
