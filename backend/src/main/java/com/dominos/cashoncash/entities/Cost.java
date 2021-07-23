package com.dominos.cashoncash.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_COST")
public class Cost implements Serializable, ListExcel {

  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private Long idPulse;

  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
  private Date date;
  private Double amount;

 
  @ManyToOne
  @JoinColumn(name = "loja_id_pulse")
  private Store loja;

  public Cost() {
  }

  public Cost(Long id, Long idPulse, Date date, Double amount, Store loja) {
    this.id = id;
    this.idPulse = idPulse;
    this.date = date;
    this.amount = amount;
    this.loja = loja;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  public Long getIdPulse() {
    return idPulse;
  }

  public void setIdPulse(Long idPulse) {
    this.idPulse = idPulse;
  }

  public Store getLoja() {
    return loja;
  }

  public void setLoja(Store loja) {
    this.loja = loja;
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
