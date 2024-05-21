package com.tsg.Services;

import java.util.List;

import com.tsg.Entities.G_Member;


public interface G_Service {

	List<G_Member> getAllGentsMembers();
	
	G_Member saveGentsMember(G_Member g_Member);

	G_Member getGentsMemberById(Long id);

	G_Member updategentsMember(G_Member g_member);


	
}
