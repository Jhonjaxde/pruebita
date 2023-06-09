package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.repository.modelo.Transferencia;
import com.example.demo.repository.modelo.Estudiante;

@Repository
public class TransferenciaRepositoryImpl implements TransferenciaRepository{

	private static List<Transferencia> baseDatos = new ArrayList<>();
	
	@Override
	public void insertar(Transferencia transferencia) {
		baseDatos.add(transferencia);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		this.eliminar(transferencia.getNumero());
		this.insertar(transferencia);
	}

	@Override
	public void eliminar(String numero) {
		Transferencia transfer = this.seleccionarPorNumero(numero);
		baseDatos.remove(transfer);
	}

	@Override
	public Transferencia seleccionarPorNumero(String numero) {
		Transferencia transEncontrado = new Transferencia();
		for (Transferencia trans : baseDatos) {
			if (numero.equals(trans.getNumero())) { 
				transEncontrado = trans;
			}
		}
		return transEncontrado;
	}

}
