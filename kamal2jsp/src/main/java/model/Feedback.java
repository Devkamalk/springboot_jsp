package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	
	/*
	 * public Feedback(int feedbackId, String name, String emailId, String
	 * feedbackMessage) { super(); this.feedbackId = feedbackId; this.name = name;
	 * this.emailId = emailId; this.feedbackMessage = feedbackMessage; }
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="feedback_id")
	private int feedbackId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="emailid")
	private String emailId;
	
	@Column(name="feedback_msg")
	private String feedbackMessage;

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFeedbackMessage() {
		return feedbackMessage;
	}

	public void setFeedbackMessage(String feedbackMessage) {
		this.feedbackMessage = feedbackMessage;
	}
	
	
	
	

}
