package com.tsg.ServiceImplements;

import java.util.List;

import com.tsg.Entities.G_memberPayment;
import com.tsg.Repository.G_paymentRepository;
import org.springframework.stereotype.Service;

import com.tsg.Entities.G_Member;
import com.tsg.Repository.G_Repository;
import com.tsg.Services.G_Service;


@Service
public class G_ServiceImpl implements G_Service{
	
	private final G_Repository g_Repository;
	private final G_paymentRepository g_paymentRepository;

	public G_ServiceImpl(G_Repository g_Repository, G_paymentRepository gPaymentRepository) {
		super();
		this.g_Repository = g_Repository;
        this.g_paymentRepository = gPaymentRepository;
    }


	@Override
	public List<G_Member> getAllGentsMembers() {
		return g_Repository.findAll();
	}




	@Override
	public G_Member saveGentsMember(G_Member g_Member) {
		return g_Repository.save(g_Member);
	}

	@Override
	public G_Member getGentsMemberById(Long id) {
		return g_Repository.findById(id).get();
	}

	@Override
	public G_Member updategentsMember(G_Member g_member) {
		return g_Repository.save(g_member);
	}

	@Override
	public void deleteGentsMemberById(Long id) {
		g_Repository.deleteById(id);
	}

	@Override
	public List<G_Member> searchMembers(String query) {
		try {
			int id = Integer.parseInt(query);
			return g_Repository.findByGidOrGnumber(id, query);
		} catch (NumberFormatException e) {
			return g_Repository.findByGidOrGnumber(-1, query);  // Passing -1 if query is not an integer
		}
	}

	@Override
	public G_memberPayment savePayment(G_memberPayment g_memberPayment) {
		return g_paymentRepository.save(g_memberPayment);
	}

	@Override
	public List<G_memberPayment> findByGpid(int gpid) {
		return g_paymentRepository.findByGpid(gpid);
	}

}
