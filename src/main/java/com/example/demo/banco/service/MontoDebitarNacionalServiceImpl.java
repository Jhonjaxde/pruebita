package com.example.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;
@Service("nacional")
public class MontoDebitarNacionalServiceImpl implements MontoDebitarService {

	@Override
	public BigDecimal calcular(BigDecimal monto) {
		//Enviar email
		//Guardar en la base una pista auditoria
		return monto;
	}

}
