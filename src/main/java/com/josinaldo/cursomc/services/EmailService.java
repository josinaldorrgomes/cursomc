package com.josinaldo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.josinaldo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
