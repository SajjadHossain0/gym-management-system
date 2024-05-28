package com.tsg.Repository;


import com.tsg.Entities.G_Member;
import com.tsg.Entities.G_memberPayment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface G_paymentRepository extends JpaRepository<G_memberPayment, Long>{


}
