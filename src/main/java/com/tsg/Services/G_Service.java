package com.tsg.Services;

import java.util.List;

import com.tsg.Entities.G_Member;


public interface G_Service {

	public List<G_Member> getAllGentsMembers();
	
	public G_Member saveGentsMember(G_Member g_Member);
	
}
