package com.devglan.userportal.com.myBasePackage.controllers;
import com.devglan.userportal.com.myBasePackage.Payment.PaymentPOJO;
import com.devglan.userportal.com.myBasePackage.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path = "/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @RequestMapping("/test")
    public String TestController() {
        return "test";
    }

    @GetMapping(path = {"get/{id}"})
    public PaymentPOJO findOne(@PathVariable int id) {
        return paymentService.findOne(id);
    }

    @GetMapping(path ={"delete/{id}"})
    public PaymentPOJO deletePayment(@PathVariable int id) {
        return paymentService.delete(id);
    }



}
