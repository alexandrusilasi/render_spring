package com.medatlas.api.model;


public class JobSpeciality {

  private long id;
  private long job;
  private long speciality;
  private long county;
  private long city;
  private long createdAt;
  private long updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getJob() {
    return job;
  }

  public void setJob(long job) {
    this.job = job;
  }


  public long getSpeciality() {
    return speciality;
  }

  public void setSpeciality(long speciality) {
    this.speciality = speciality;
  }


  public long getCounty() {
    return county;
  }

  public void setCounty(long county) {
    this.county = county;
  }


  public long getCity() {
    return city;
  }

  public void setCity(long city) {
    this.city = city;
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
