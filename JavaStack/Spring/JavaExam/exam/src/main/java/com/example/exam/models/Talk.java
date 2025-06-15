package com.example.exam.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "talks")
public class Talk {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Size(min = 4, max = 200, message = "Title mmust be 4 charachter or more")
	private String talkTitle;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date talkDate;

	@NotNull
	@Size(min = 20, max = 500, message = "Talk details must be more than 20 char and less than 500  chars")
	private String talkDetails;

	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	public Talk() {
	}

	public Talk(Long id, String talkTitle, Date talkDate, String talkDetails) {
		this.id = id;
		this.talkTitle = talkTitle;
		this.talkDate = talkDate;
		this.talkDetails = talkDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTalkTitle() {
		return talkTitle;
	}

	public void setTalkTitle(String talkTitle) {
		this.talkTitle = talkTitle;
	}

	public Date getTalkDate() {
		return talkDate;
	}

	public void setTalkDate(Date talkDate) {
		this.talkDate = talkDate;
	}

	public String getTalkDetails() {
		return talkDetails;
	}

	public void setTalkDetails(String talkDetails) {
		this.talkDetails = talkDetails;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
