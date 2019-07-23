package com.devglan.userportal.com.myBasePackage.Payment;

import org.springframework.data.repository.Repository;

public interface PaymentRepository extends Repository<PaymentPOJO, Integer> {

    void delete(int paymentPOJO);

    PaymentPOJO findOne(int id);
}
