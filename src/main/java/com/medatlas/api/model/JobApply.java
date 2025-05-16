package com.medatlas.api.model;


public class JobApply {

  private long id;
  private long jobId;
  private long candidateId;
  private long seen;
  private long createdAt;
  private long updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getJobId() {
    return jobId;
  }

  public void setJobId(long jobId) {
    this.jobId = jobId;
  }


  public long getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(long candidateId) {
    this.candidateId = candidateId;
  }


  public long getSeen() {
    return seen;
  }

  public void setSeen(long seen) {
    this.seen = seen;
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
