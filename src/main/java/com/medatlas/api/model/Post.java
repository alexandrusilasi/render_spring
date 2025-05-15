package com.medatlas.api.model;


public class Post {

  private long id;
  private long author;
  private String title;
  private String name2;
  private String slug;
  private String content;
  private long featured;
  private long category;
  private long status;
  private long views;
  private long isDeleted;
  private long approvedBy;
  private long wpId;
  private long createdAt;
  private long updatedAt;
  private long unit;
  private long editedBy;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getAuthor() {
    return author;
  }

  public void setAuthor(long author) {
    this.author = author;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public long getFeatured() {
    return featured;
  }

  public void setFeatured(long featured) {
    this.featured = featured;
  }


  public long getCategory() {
    return category;
  }

  public void setCategory(long category) {
    this.category = category;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getViews() {
    return views;
  }

  public void setViews(long views) {
    this.views = views;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }


  public long getApprovedBy() {
    return approvedBy;
  }

  public void setApprovedBy(long approvedBy) {
    this.approvedBy = approvedBy;
  }


  public long getWpId() {
    return wpId;
  }

  public void setWpId(long wpId) {
    this.wpId = wpId;
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


  public long getUnit() {
    return unit;
  }

  public void setUnit(long unit) {
    this.unit = unit;
  }


  public long getEditedBy() {
    return editedBy;
  }

  public void setEditedBy(long editedBy) {
    this.editedBy = editedBy;
  }

}
