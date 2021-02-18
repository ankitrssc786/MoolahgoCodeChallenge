-- =================================================================================================
-- REFERRALS

DROP TABLE IF EXISTS Referrals;

CREATE TABLE Referrals(id INT PRIMARY KEY, referral_id VARCHAR(6), referral_email_id VARCHAR(50), 
referral_name VARCHAR(50),national_id VARCHAR(10), dob DATE, referred_by VARCHAR(10));

-- Referrals Data
insert into Referrals(id, referral_id, referral_email_id, referral_name, national_id, dob, referred_by) 
values ('1', 'REF001', 'ref1@gmail.com', 'Referral 1', 'SING001', '2019-06-26', 'Admin');
insert into Referrals(id, referral_id, referral_email_id, referral_name, national_id, dob, referred_by)
values ('2', 'REF002', 'ref2@gmail.com', 'Referral 2', 'SING002', '2019-06-26', 'Admin');
insert into Referrals(id, referral_id, referral_email_id, referral_name, national_id, dob, referred_by)
values ('3', 'REF003', 'ref3@gmail.com', 'Referral 3', 'SING003', '2019-06-26', 'Admin');
insert into Referrals(id, referral_id, referral_email_id, referral_name, national_id, dob, referred_by)
values ('4', 'REF004', 'ref4@gmail.com', 'Referral 4', 'SING004', '2019-06-26', 'Admin');
insert into Referrals(id, referral_id, referral_email_id, referral_name, national_id, dob, referred_by)
values ('5', 'REF005', 'ref5@gmail.com', 'Referral 5', 'SING005', '2019-06-26', 'Admin');
insert into Referrals(id, referral_id, referral_email_id, referral_name, national_id, dob, referred_by) 
values ('6', 'REF006', 'ref6@gmail.com', 'Referral 6', 'SING006', '2019-06-26', 'Admin');