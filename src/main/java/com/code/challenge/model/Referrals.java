package com.code.challenge.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Referrals {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "referral_id")
	private String referralId;
	@Column(name = "referral_email_id")
	private String referralEmailId;
	@Column(name = "referral_name")
	private String referralName;
	@Column(name = "national_id")
	private String nationalId;
	private Date dob;
	@Column(name = "referred_by")
	private String referredBy;

	// Default constructor.
	public Referrals() {
	}

	public Referrals(Long id, String referralId, String referralEmailId, String referralName, String nationalId,
			Date dob, String referredBy) {
		super();
		this.id = id;
		this.referralId = referralId;
		this.referralEmailId = referralEmailId;
		this.referralName = referralName;
		this.nationalId = nationalId;
		this.dob = dob;
		this.referredBy = referredBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReferralId() {
		return referralId;
	}

	public void setReferralId(String referralId) {
		this.referralId = referralId;
	}

	public String getReferralEmailId() {
		return referralEmailId;
	}

	public void setReferralEmailId(String referralEmailId) {
		this.referralEmailId = referralEmailId;
	}

	public String getReferralName() {
		return referralName;
	}

	public void setReferralName(String referralName) {
		this.referralName = referralName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(String referredBy) {
		this.referredBy = referredBy;
	}

}
