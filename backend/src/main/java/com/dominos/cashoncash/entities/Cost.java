package com.dominos.cashoncash.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cost implements Serializable, ListExcel {

  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private Date date;
  private Double amount;

  @ManyToOne
  @JoinColumn(name = "store_id")
  private Store store;

  public Cost() {
  }
  
  public Cost(long id, Date date, Double amount, Store store) {
    this.id = id;
    this.date = date;
    this.amount = amount;
    this.store = store;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Store getStore() {
    return store;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
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
    Cost other = (Cost) obj;
    if (id != other.id)
      return false;
    return true;
  }

  @Override
  public double importExcel() {
    
    return 0;
  }

    
}
