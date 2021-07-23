package com.dominos.cashoncash.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "tb_STORE")
public class Store implements Serializable, ListExcel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long ipPulse;
	private String nameStore;
	private Double amountCapexPreop;

	@JsonIgnore
	@OneToMany(mappedBy = "loja")
	private List<Cost> costs = new ArrayList<>();
	
	public Store() {
	}

	public Store(Long ipPulse, String nameStore, Double amountCapexPreop) {
		this.ipPulse = ipPulse;
		this.nameStore = nameStore;
		this.amountCapexPreop = amountCapexPreop;
	}

	public Long getIpPulse() {
		return ipPulse;
	}

	public void setIpPulse(Long ipPulse) {
		this.ipPulse = ipPulse;
	}

	public String getNameStore() {
		return nameStore;
	}

	public void setNameStore(String nameStore) {
		this.nameStore = nameStore;
	}

	public Double getAmountCapexPreop() {
		return amountCapexPreop;
	}

	public void setAmountCapexPreop(Double amountCapexPreop) {
		this.amountCapexPreop = amountCapexPreop;
	}

	public List<Cost> getCosts() {
		return costs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ipPulse == null) ? 0 : ipPulse.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (ipPulse == null) {
			if (other.ipPulse != null)
				return false;
		} else if (!ipPulse.equals(other.ipPulse))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Store [ipPulse=" + ipPulse + ", nameStore=" + nameStore + ", amountCapexPreop=" + amountCapexPreop
				+ "]";
	}


	@Override
	public double importExcel() {
		
		return 0;
	}
	
}
