package com.dominos.cashoncash.entities;

import java.io.Serializable;
import java.util.Date;

public class Cost implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer idPulse;
  private Date dtCompetencia;
  private Double amount;
  
  public Cost() {
  }

  public Cost(Integer idPulse, Date dtCompetencia, Double amount) {
    this.idPulse = idPulse;
    this.dtCompetencia = dtCompetencia;
    this.amount = amount;
  }

  public Integer getIdPulse() {
    return idPulse;
  }

  public void setIdPulse(Integer idPulse) {
    this.idPulse = idPulse;
  }

  public Date getDtCompetencia() {
    return dtCompetencia;
  }

  public void setDtCompetencia(Date dtCompetencia) {
    this.dtCompetencia = dtCompetencia;
  }

  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((idPulse == null) ? 0 : idPulse.hashCode());
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
    if (idPulse == null) {
      if (other.idPulse != null)
        return false;
    } else if (!idPulse.equals(other.idPulse))
      return false;
    return true;
  }

  
  
}
