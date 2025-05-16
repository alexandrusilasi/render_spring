package com.medatlas.api.model;


public class JobFavorite {

  private long id;
  private long job;
  private long user;
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


  public long getUser() {
    return user;
  }

  public void setUser(long user) {
    this.user = user;
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
