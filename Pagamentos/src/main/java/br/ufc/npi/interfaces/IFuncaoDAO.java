package br.ufc.npi.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufc.npi.model.Funcao;

public interface IFuncaoDAO extends JpaRepository<Funcao, Integer>{
	
	

}
