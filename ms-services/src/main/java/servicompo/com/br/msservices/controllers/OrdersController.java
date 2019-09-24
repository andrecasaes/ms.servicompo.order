package servicompo.com.br.msservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import servicompo.com.br.msservices.Models.Order;
import servicompo.com.br.msservices.Repository.OrdersRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("/api/order/")
public class OrdersController {

    @Autowired
    private OrdersRepository _orderRepository;

    @GetMapping("/info")
    public ResponseEntity<String> Info() {
        return new ResponseEntity<>("Its ok...", HttpStatus.OK);
    }


    @GetMapping("/cpf/{cpf}")
    public ResponseEntity<Order> GetByCpf(@PathVariable(value = "cpf") String _cpf) {
        
        List<Order> _order = _orderRepository.findByCPF(_cpf);
        if(_order.size() >0 )
            return new ResponseEntity<Order>(_order.get(0), HttpStatus.OK);
        
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/numos/{numos}")
    public ResponseEntity<Order> GetByNumOS(@PathVariable(value = "numos") String _numos) {
        
        List<Order> _order = _orderRepository.findByNumOS(_numos);
        if(_order.size() >0 )
            return new ResponseEntity<Order>(_order.get(0), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/numsinistro/{numsinistro}")
    public ResponseEntity<Order> GetByNumSinistro(@PathVariable(value = "numsinistro") String _numsinistro) {
        
        List<Order> _order = _orderRepository.findByNumeroSinistro(_numsinistro);
        if(_order.size() >0 )
            return new ResponseEntity<Order>(_order.get(0), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}