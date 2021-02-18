package com.code.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.challenge.model.Referrals;
import com.code.challenge.repository.ReferralRepository;

@Service
public class ReferralService {

	@Autowired
	ReferralRepository repository;

	// Get owner details by referralId.
	public Referrals getByReferralId(String referralId) {
		return repository.getByReferralId(referralId);
	}
}
