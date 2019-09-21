package servicompo.com.br.msservices.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import servicompo.com.br.msservices.Models.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {  
    
     @Query("select  u from vw_ms_getorders u " )
      List<Orders> findByCPF(@Param("searchTerm") String cpf);

}