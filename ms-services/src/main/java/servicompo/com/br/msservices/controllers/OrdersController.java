package servicompo.com.br.msservices.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/order/")
public class OrdersController {

    @GetMapping("/info")
    public ResponseEntity<String> Info(){
        return new ResponseEntity<>("Its ok...",HttpStatus.OK);
    }
}