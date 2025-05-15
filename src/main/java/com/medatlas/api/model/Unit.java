package com.medatlas.api.model;

import jakarta.persistence.Id;

public class Unit {

    @Id
    private long id;
  private long unitType;
  private long author;
  private long owner;
  private String siteVerification;
  private String name;
  private String name2;
  private String slug;
  private String content;
  private String shortDescription;
  private long county;
  private long city;
  private String address;
  private String phone;
  private String email;
  private String description;
  private String cui;
  private String logo;
  private long featured;
  private String website;
  private String facebook;
  private String instagram;
  private String twitter;
  private String tiktok;
  private String linkedin;
  private String youtube;
  private String video;
  private String googleReview;
  private String googlePlaceId;
  private String googlePlaceUrl;
  private long rating;
  private double decimalRating;
  private long createdAt;
  private long updatedAt;
  private long status;
  private long isDeleted;
  private long plan;
  private long planId;
  private long planExpiry;
  private long wpId;
  private String token;
  private long editedBy;
  private long deletedBy;
  private long deletedDate;
  private long restoredBy;
  private long restoredDate;
  private long agent;
  private String crmStatus;
  private long hideGoogleReviews;
  private long views;
  private String buttonName;
  private String buttonLink;
  private String seoTitle;
  private String seoKeywords;
  private String seoDescription;
  private long oldPrice;

  public long getUnitType() {
    return unitType;
  }

  public void setUnitType(long unitType) {
    this.unitType = unitType;
  }


  public long getAuthor() {
    return author;
  }

  public void setAuthor(long author) {
    this.author = author;
  }


  public long getOwner() {
    return owner;
  }

  public void setOwner(long owner) {
    this.owner = owner;
  }


  public String getSiteVerification() {
    return siteVerification;
  }

  public void setSiteVerification(String siteVerification) {
    this.siteVerification = siteVerification;
  }


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


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
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


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getCui() {
    return cui;
  }

  public void setCui(String cui) {
    this.cui = cui;
  }


  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }


  public long getFeatured() {
    return featured;
  }

  public void setFeatured(long featured) {
    this.featured = featured;
  }


  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }


  public String getFacebook() {
    return facebook;
  }

  public void setFacebook(String facebook) {
    this.facebook = facebook;
  }


  public String getInstagram() {
    return instagram;
  }

  public void setInstagram(String instagram) {
    this.instagram = instagram;
  }


  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }


  public String getTiktok() {
    return tiktok;
  }

  public void setTiktok(String tiktok) {
    this.tiktok = tiktok;
  }


  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }


  public String getYoutube() {
    return youtube;
  }

  public void setYoutube(String youtube) {
    this.youtube = youtube;
  }


  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }


  public String getGoogleReview() {
    return googleReview;
  }

  public void setGoogleReview(String googleReview) {
    this.googleReview = googleReview;
  }


  public String getGooglePlaceId() {
    return googlePlaceId;
  }

  public void setGooglePlaceId(String googlePlaceId) {
    this.googlePlaceId = googlePlaceId;
  }


  public String getGooglePlaceUrl() {
    return googlePlaceUrl;
  }

  public void setGooglePlaceUrl(String googlePlaceUrl) {
    this.googlePlaceUrl = googlePlaceUrl;
  }


  public long getRating() {
    return rating;
  }

  public void setRating(long rating) {
    this.rating = rating;
  }


  public double getDecimalRating() {
    return decimalRating;
  }

  public void setDecimalRating(double decimalRating) {
    this.decimalRating = decimalRating;
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


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(long isDeleted) {
    this.isDeleted = isDeleted;
  }


  public long getPlan() {
    return plan;
  }

  public void setPlan(long plan) {
    this.plan = plan;
  }


  public long getPlanId() {
    return planId;
  }

  public void setPlanId(long planId) {
    this.planId = planId;
  }


  public long getPlanExpiry() {
    return planExpiry;
  }

  public void setPlanExpiry(long planExpiry) {
    this.planExpiry = planExpiry;
  }


  public long getWpId() {
    return wpId;
  }

  public void setWpId(long wpId) {
    this.wpId = wpId;
  }


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  public long getEditedBy() {
    return editedBy;
  }

  public void setEditedBy(long editedBy) {
    this.editedBy = editedBy;
  }


  public long getDeletedBy() {
    return deletedBy;
  }

  public void setDeletedBy(long deletedBy) {
    this.deletedBy = deletedBy;
  }


  public long getDeletedDate() {
    return deletedDate;
  }

  public void setDeletedDate(long deletedDate) {
    this.deletedDate = deletedDate;
  }


  public long getRestoredBy() {
    return restoredBy;
  }

  public void setRestoredBy(long restoredBy) {
    this.restoredBy = restoredBy;
  }


  public long getRestoredDate() {
    return restoredDate;
  }

  public void setRestoredDate(long restoredDate) {
    this.restoredDate = restoredDate;
  }


  public long getAgent() {
    return agent;
  }

  public void setAgent(long agent) {
    this.agent = agent;
  }


  public String getCrmStatus() {
    return crmStatus;
  }

  public void setCrmStatus(String crmStatus) {
    this.crmStatus = crmStatus;
  }


  public long getHideGoogleReviews() {
    return hideGoogleReviews;
  }

  public void setHideGoogleReviews(long hideGoogleReviews) {
    this.hideGoogleReviews = hideGoogleReviews;
  }


  public long getViews() {
    return views;
  }

  public void setViews(long views) {
    this.views = views;
  }


  public String getButtonName() {
    return buttonName;
  }

  public void setButtonName(String buttonName) {
    this.buttonName = buttonName;
  }


  public String getButtonLink() {
    return buttonLink;
  }

  public void setButtonLink(String buttonLink) {
    this.buttonLink = buttonLink;
  }


  public String getSeoTitle() {
    return seoTitle;
  }

  public void setSeoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
  }


  public String getSeoKeywords() {
    return seoKeywords;
  }

  public void setSeoKeywords(String seoKeywords) {
    this.seoKeywords = seoKeywords;
  }


  public String getSeoDescription() {
    return seoDescription;
  }

  public void setSeoDescription(String seoDescription) {
    this.seoDescription = seoDescription;
  }


  public long getOldPrice() {
    return oldPrice;
  }

  public void setOldPrice(long oldPrice) {
    this.oldPrice = oldPrice;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
