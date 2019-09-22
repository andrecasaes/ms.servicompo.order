package servicompo.com.br.msservices.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import servicompo.com.br.msservices.Models.Order;


@Repository
public interface OrdersRepository extends JpaRepository<Order,Long> {  
    
      @Query("select u from vw_ms_getorders u where u.CPF_CNPJ = dbo.GetOnlyNumeric(?1) " )
      List<Order> findByCPF(String cpf);


      @Query("select u from vw_ms_getorders u where u.NumOS = dbo.GetOnlyNumeric(?1) " )
      List<Order> findByNumOS(String _numos);

      @Query("select u from vw_ms_getorders u where u.NumeroSinistro = dbo.GetOnlyNumeric(?1) " )
      List<Order> findByNumeroSinistro(String _numsinistro);

}