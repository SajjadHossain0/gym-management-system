package com.tsg.Repository;

import com.tsg.Entities.G_memberPayment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface G_paymentRepository extends JpaRepository<G_memberPayment, Long> {

    List<G_memberPayment> findByGpid(int gpid);


}
