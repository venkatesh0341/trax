package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Billing;
import com.trax.entities.Contact;
import com.trax.services.BillingService;
import com.trax.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactservice;
	@Autowired
	private BillingService billingservice;
	
	@RequestMapping("/contactBill")
	public String createBill(@RequestParam("bid")long id,ModelMap model) {
		Contact contact = contactservice.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_Bill";
	}
	@RequestMapping("/saveBill")
	public String saveBill(@ModelAttribute("bill")Billing bill) {
		billingservice.saveBilling(bill);
		return"Billing_File";
	}
	@RequestMapping("/listAllBilling")
	public String viewBill(ModelMap model) {
		 List<Billing> Billing = billingservice.getAllBilling();
		 model.addAttribute("Billing", Billing);
		return "Billing_File";
		
	}

}
