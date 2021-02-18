package com.code.challenge.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.code.challenge.service.ReferralService;
import com.code.challenge.model.Referrals;

@RestController
public class ReferralController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ReferralService referralService;

	@RequestMapping(value = "/process", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Referrals> getReferral(@RequestParam String referralId) {
		log.info("referralId: " + referralId);
		// If ReferralCode belong to Owner
		Referrals referral = referralService.getByReferralId(referralId);
		if (referral == null) {
			log.info("Referral Info" + referral);
			return new ResponseEntity<Referrals>(HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok().body(referral);
	}
}
