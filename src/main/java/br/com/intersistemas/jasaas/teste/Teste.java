/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.intersistemas.jasaas.teste;

import br.com.intersistemas.jasaas.adapter.ApacheHttpClientAdapter;
import br.com.intersistemas.jasaas.api.Asaas;
import br.com.intersistemas.jasaas.api.PaymentConnection;
import br.com.intersistemas.jasaas.entity.Payment;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @author bosco
 */
public class Teste {

    public static void main(String[] args) throws URISyntaxException, MalformedURLException, IOException, ClassNotFoundException {
        String acessToken = "0ebde6de3835057f42291b64c21a0449f4aec2674b5ea28e748df298425370e4";

        Asaas asaas = new Asaas(new ApacheHttpClientAdapter(acessToken), Asaas.AMBIENTE_HOMOLOGACAO);
        PaymentConnection conn = asaas.payment();
        
        Payment payment = new Payment();
        payment.set
        
        conn.createPayment();
        
        
        List<Payment> all = conn.getAll();
        for (Payment payment : all) {
            System.out.println(payment);
        }
                
    }
}