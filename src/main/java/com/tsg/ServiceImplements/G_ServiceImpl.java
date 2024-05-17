package com.tsg.ServiceImplements;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tsg.Entities.G_Member;
import com.tsg.Repository.G_Repository;
import com.tsg.Services.G_Service;


@Service
public class G_ServiceImpl implements G_Service{
	
	private final G_Repository g_Repository;

	public G_ServiceImpl(G_Repository g_Repository) {
		super();
		this.g_Repository = g_Repository;
	}


	@Override
	public List<G_Member> getAllGentsMembers() {
		return g_Repository.findAll();
	}


	@Override
	public G_Member saveGentsMember(G_Member g_Member) {
		return g_Repository.save(g_Member);
	}


	
	

}
