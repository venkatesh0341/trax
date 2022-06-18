package com.trax.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trax.entities.Billing;
import com.trax.entities.Contact;
import com.trax.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billRepo;

	@Override
	public void saveBilling(Billing bill) {
		billRepo.save(bill);
	}

	@Override
	public List<Billing> getAllBilling() {
		List<Billing> billing = billRepo.findAll();
		return billing;
	}


}
