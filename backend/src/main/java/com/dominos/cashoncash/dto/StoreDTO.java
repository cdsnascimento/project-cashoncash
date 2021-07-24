package com.dominos.cashoncash.dto;

import java.io.Serializable;

import com.dominos.cashoncash.entities.Store;

public class StoreDTO implements Serializable {
  
  private static final long serialVersionUID = 1L;

  private Long ipPulse;
	private String nameStore;
	private String nameCluster;
	private Double amountCapexPreop;
  
  public StoreDTO() {
  }

  public StoreDTO(Long ipPulse, String nameStore, String nameCluster, Double amountCapexPreop) {
    this.ipPulse = ipPulse;
    this.nameStore = nameStore;
    this.nameCluster = nameCluster;
    this.amountCapexPreop = amountCapexPreop;
  }

  public StoreDTO(Store entity) {
    ipPulse = entity.getIpPulse();
    nameStore = entity.getNameStore();
    nameCluster = entity.getNameCluster();
    amountCapexPreop = entity.getAmountCapexPreop();
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

  public String getNameCluster() {
    return nameCluster;
  }

  public void setNameCluster(String nameCluster) {
    this.nameCluster = nameCluster;
  }

  public Double getAmountCapexPreop() {
    return amountCapexPreop;
  }

  public void setAmountCapexPreop(Double amountCapexPreop) {
    this.amountCapexPreop = amountCapexPreop;
  }

}
