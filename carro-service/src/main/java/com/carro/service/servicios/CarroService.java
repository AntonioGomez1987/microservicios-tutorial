package com.carro.service.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carro.service.entidades.Carro;
import com.carro.service.repositorio.CarroRepository;

@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository; 
	
	public List<Carro> getAll(){
		return carroRepository.findAll();
	}
	
	public Carro getCarroById(int id) {
		return carroRepository.findById(id).orElse(null);
	}
	
	public Carro save(Carro carro){
		Carro nuevoCarro = carroRepository.save(carro);
		System.out.println("Nuevo carro guardado en la base de datos.");
		return nuevoCarro;
	}
	
	public List<Carro> byUsuarioid(int usuarioId){
		return carroRepository.findByUsuarioId(usuarioId);
	}
}
