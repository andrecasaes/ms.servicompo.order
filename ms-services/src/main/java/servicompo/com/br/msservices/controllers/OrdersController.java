package servicompo.com.br.msservices.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/order/")
public class OrdersController {

    // @Autowired
    // private OrdersRepository orderRepository ;

    @GetMapping("/info")
    public ResponseEntity<String> Info() {
        return new ResponseEntity<>("Its ok...", HttpStatus.OK);
    }


    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<String> GetByCpf(@PathVariable(value = "cpf") String _cpf) {
        // Orders order = ordersRepository.findByCPF(_cpf);
        return new ResponseEntity<>("Its ok...", HttpStatus.OK);
    }
}