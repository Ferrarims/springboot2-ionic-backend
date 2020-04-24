package com.ferrari.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ferrari.cursomc.domains.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
