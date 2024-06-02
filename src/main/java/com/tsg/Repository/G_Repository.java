package com.tsg.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.tsg.Entities.G_Member;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface G_Repository extends JpaRepository<G_Member, Long>{

    @Query("SELECT g FROM G_Member g WHERE g.gid = :gid OR g.gnumber LIKE %:gnumber%")
    List<G_Member> findByGidOrGnumber(@Param("gid") int gid, @Param("gnumber") String gnumber);


}
