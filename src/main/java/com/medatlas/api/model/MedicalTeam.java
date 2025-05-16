package com.medatlas.api.model;


public class MedicalTeam {

  private long id;
  private long unit;
  private String medicName;
  private String medicSpeciality;
  private long medicPic;
  private long orderNo;
  private long createdAt;
  private long updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUnit() {
    return unit;
  }

  public void setUnit(long unit) {
    this.unit = unit;
  }


  public String getMedicName() {
    return medicName;
  }

  public void setMedicName(String medicName) {
    this.medicName = medicName;
  }


  public String getMedicSpeciality() {
    return medicSpeciality;
  }

  public void setMedicSpeciality(String medicSpeciality) {
    this.medicSpeciality = medicSpeciality;
  }


  public long getMedicPic() {
    return medicPic;
  }

  public void setMedicPic(long medicPic) {
    this.medicPic = medicPic;
  }


  public long getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(long orderNo) {
    this.orderNo = orderNo;
  }


  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }


  public long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
  }

}
