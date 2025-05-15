package com.medatlas.api.model;

import jakarta.persistence.Id;

public class Speciality {

    @Id
    private long id;
  private String name;
  private String name2;
  private String slug;
  private long createdAt;
  private long updatedAt;
  private long wpId;
  private long parent;
  private String description;
  private String keywords;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }


  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
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


  public long getWpId() {
    return wpId;
  }

  public void setWpId(long wpId) {
    this.wpId = wpId;
  }


  public long getParent() {
    return parent;
  }

  public void setParent(long parent) {
    this.parent = parent;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
