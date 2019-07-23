package com.devglan.userportal.com.myBasePackage.Payment;

import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    PaymentPOJO delete(int id);

    PaymentPOJO findOne(int id);
}
