package com.tsg.Services;

import java.util.List;

import com.tsg.Entities.G_Member;
import com.tsg.Entities.G_memberPayment;

public interface G_Service {

	List<G_Member> getAllGentsMembers();

	G_Member saveGentsMember(G_Member g_Member);

	G_Member getGentsMemberById(Long id);

	G_Member updategentsMember(G_Member g_member);

	void deleteGentsMemberById(Long id);

	List<G_Member> searchMembers(String query);

	G_memberPayment savePayment(G_memberPayment g_memberPayment);
	List<G_memberPayment> findByGpid(int gpid);




}
