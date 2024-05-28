package com.tsg.ServiceImplements;

import com.tsg.Entities.G_memberPayment;
import com.tsg.Repository.G_paymentRepository;
import com.tsg.Services.G_paymentService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class G_paymentServiceImpl implements G_paymentService {

	private final G_paymentRepository g_paymentRepository;

    public G_paymentServiceImpl(G_paymentRepository gPaymentRepository) {
        g_paymentRepository = gPaymentRepository;
    }

    @Override
	public List<G_memberPayment> getAllGentsMembersPayment() {
		return g_paymentRepository.findAll();
	}

    @Override
    public G_memberPayment saveGentsPayments(G_memberPayment g_memberPayment) {
        return g_paymentRepository.save(g_memberPayment);
    }

    @Override
    public G_memberPayment getGentsMemberById(Long pid) {
        return g_paymentRepository.findById(pid).get();
    }

    @Override
    public G_memberPayment updateGentsPayments(G_memberPayment g_memberPayment) {
        return g_paymentRepository.save(g_memberPayment);
    }

    @Override
    public void deletePaymentInfoById(Long pid) {
        g_paymentRepository.deleteById(pid);
    }
}
