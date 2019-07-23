package com.devglan.userportal.com.myBasePackage.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }


    @Override
    public PaymentPOJO delete(int id) {
       PaymentPOJO paymentPOJO = findOne(id);
       if(paymentPOJO != null) {
           paymentRepository.delete(id);
       }

       return paymentPOJO;
    }

    @Override
    public PaymentPOJO findOne(int id) {
       return paymentRepository.findOne(id);
    }
}
