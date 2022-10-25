package com.atguigu.Entity;


public class ArticleInfo {

  private long articleId;
  private long userId;
  private long categoryId;
  private String articleTitle;
  private String articleContent;
  private String articleImg;
  private String articleRecom;
  private java.sql.Timestamp articleTime;
  private String articleMark;


  public long getArticleId() {
    return articleId;
  }

  public void setArticleId(long articleId) {
    this.articleId = articleId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getArticleTitle() {
    return articleTitle;
  }

  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
  }


  public String getArticleContent() {
    return articleContent;
  }

  public void setArticleContent(String articleContent) {
    this.articleContent = articleContent;
  }


  public String getArticleImg() {
    return articleImg;
  }

  public void setArticleImg(String articleImg) {
    this.articleImg = articleImg;
  }


  public String getArticleRecom() {
    return articleRecom;
  }

  public void setArticleRecom(String articleRecom) {
    this.articleRecom = articleRecom;
  }


  public java.sql.Timestamp getArticleTime() {
    return articleTime;
  }

  public void setArticleTime(java.sql.Timestamp articleTime) {
    this.articleTime = articleTime;
  }


  public String getArticleMark() {
    return articleMark;
  }

  public void setArticleMark(String articleMark) {
    this.articleMark = articleMark;
  }

}
