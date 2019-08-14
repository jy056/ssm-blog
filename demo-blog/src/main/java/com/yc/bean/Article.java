package com.yc.bean;

import java.util.Date;

public class Article {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.id
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.author
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.title
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.keyWords
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String keywords;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.description
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.categoryId
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private Integer categoryid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.label
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.titleImgs
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String titleimgs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.status
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.createTime
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.readCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private Integer readcnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.agreeCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private Integer agreecnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.commCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private Integer commcnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article.content
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.id
     *
     * @return the value of article.id
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.id
     *
     * @param id the value for article.id
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.author
     *
     * @return the value of article.author
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.author
     *
     * @param author the value for article.author
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.title
     *
     * @return the value of article.title
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.title
     *
     * @param title the value for article.title
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.keyWords
     *
     * @return the value of article.keyWords
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.keyWords
     *
     * @param keywords the value for article.keyWords
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.description
     *
     * @return the value of article.description
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.description
     *
     * @param description the value for article.description
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.categoryId
     *
     * @return the value of article.categoryId
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.categoryId
     *
     * @param categoryid the value for article.categoryId
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.label
     *
     * @return the value of article.label
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.label
     *
     * @param label the value for article.label
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.titleImgs
     *
     * @return the value of article.titleImgs
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getTitleimgs() {
        return titleimgs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.titleImgs
     *
     * @param titleimgs the value for article.titleImgs
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setTitleimgs(String titleimgs) {
        this.titleimgs = titleimgs == null ? null : titleimgs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.status
     *
     * @return the value of article.status
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.status
     *
     * @param status the value for article.status
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.createTime
     *
     * @return the value of article.createTime
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.createTime
     *
     * @param createtime the value for article.createTime
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.readCnt
     *
     * @return the value of article.readCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public Integer getReadcnt() {
        return readcnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.readCnt
     *
     * @param readcnt the value for article.readCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setReadcnt(Integer readcnt) {
        this.readcnt = readcnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.agreeCnt
     *
     * @return the value of article.agreeCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public Integer getAgreecnt() {
        return agreecnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.agreeCnt
     *
     * @param agreecnt the value for article.agreeCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setAgreecnt(Integer agreecnt) {
        this.agreecnt = agreecnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.commCnt
     *
     * @return the value of article.commCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public Integer getCommcnt() {
        return commcnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.commCnt
     *
     * @param commcnt the value for article.commCnt
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setCommcnt(Integer commcnt) {
        this.commcnt = commcnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article.content
     *
     * @return the value of article.content
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article.content
     *
     * @param content the value for article.content
     *
     * @mbg.generated Wed Aug 14 19:49:43 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}