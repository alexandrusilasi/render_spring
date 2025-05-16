package com.medatlas.api.model;


public class Plan {

  private long id;
  private String title;
  private String description;
  private String borderColor;
  private long free;
  private String includes;
  private String icon;
  private String slug;
  private double price;
  private long forSale;
  private long createdAt;
  private long updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  public long getFree() {
    return free;
  }

  public void setFree(long free) {
    this.free = free;
  }


  public String getIncludes() {
    return includes;
  }

  public void setIncludes(String includes) {
    this.includes = includes;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getForSale() {
    return forSale;
  }

  public void setForSale(long forSale) {
    this.forSale = forSale;
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
