package com.tsg.Services;

import com.tsg.Entities.G_memberPayment;

import java.util.List;

public interface G_paymentService {

	List<G_memberPayment> getAllGentsMembersPayment();

	G_memberPayment saveGentsPayments(G_memberPayment g_memberPayment);

	G_memberPayment getGentsMemberById(Long pid);

	G_memberPayment updateGentsPayments(G_memberPayment g_memberPayment);

	void deletePaymentInfoById(Long pid);


}
