package com.tsg.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tsg.Entities.G_Member;


public interface G_Repository extends JpaRepository<G_Member, Long>{


}
