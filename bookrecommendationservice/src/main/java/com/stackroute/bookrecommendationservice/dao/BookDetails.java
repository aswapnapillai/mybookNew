package com.stackroute.bookrecommendationservice.dao;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_details")
public class BookDetails implements Serializable {
	
	private static final long serialVersionUID = -2648969757919112609L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 600)
	@JsonProperty("subtitle")
	private String subtitle;
	
	@Column(length = 600)
	@JsonProperty("title")
	private String title;
	
	@Column(length = 600)
	@JsonProperty("url")
	private String url;
	
	@Column(length = 600)
	@JsonProperty("notes")
	private String notes;
	
	@Column(length = 600)
	@JsonProperty("publish_date")
	private String publishDate;


	@Column(length = 100)
	@JsonProperty("count")
	private int count;

	
	@JsonProperty("subtitle")
	public String getSubtitle() {
		return subtitle;
	}

	@JsonProperty("subtitle")
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("notes")
	public String getNotes() {
		return notes;
	}

	@JsonProperty("notes")
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonProperty("publish_date")
	public String getPublishDate() {
		return publishDate;
	}

	@JsonProperty("publish_date")
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}


	@JsonProperty("count")
	public void setCount(int count) {
		 this.count=count;
	}

	@JsonProperty("count")
	public int getcount() {
		return count;
	}


}
