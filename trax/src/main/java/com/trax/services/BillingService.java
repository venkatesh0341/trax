package com.trax.services;

import java.util.List;

import com.trax.entities.Billing;

public interface BillingService {
public void saveBilling(Billing bill);
public List<Billing>getAllBilling();
}
