package com.dominos.cashoncash.dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.dominos.cashoncash.entities.Cost;
import com.fasterxml.jackson.annotation.JsonFormat;

public class CostDTO {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
 
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
  private Date date;
  private Double amount;

  private StoreDTO store;

  public CostDTO() {
  }

  public CostDTO(Long id, Date date, Double amount, StoreDTO store) {
    this.id = id;
    this.date = date;
    this.amount = amount;
    this.store = store;
  }

  public CostDTO(Cost entity) {
    id = entity.getId();
    date = entity.getDate();
    amount = entity.getAmount();
    store = new StoreDTO(entity.getLoja());
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

  public StoreDTO getStore() {
    return store;
  }

  public void setStore(StoreDTO store) {
    this.store = store;
  }

  

}
