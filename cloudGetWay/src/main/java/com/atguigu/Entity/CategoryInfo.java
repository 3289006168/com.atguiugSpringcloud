package com.atguigu.Entity;


public class CategoryInfo {

  private long categoryId;
  private String categoryName;
  private String categoryAlias;
  private String categoryDesc;


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public String getCategoryAlias() {
    return categoryAlias;
  }

  public void setCategoryAlias(String categoryAlias) {
    this.categoryAlias = categoryAlias;
  }


  public String getCategoryDesc() {
    return categoryDesc;
  }

  public void setCategoryDesc(String categoryDesc) {
    this.categoryDesc = categoryDesc;
  }

}
