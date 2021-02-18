package com.code.challenge.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.code.challenge.model.Referrals;

@Repository
public interface ReferralRepository extends CrudRepository<Referrals, Long>{
	
	Referrals getByReferralId(String referralId);

}
