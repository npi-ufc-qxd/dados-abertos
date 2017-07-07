package br.ufc.npi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.npi.model.Pagamento;
import br.ufc.npi.repository.PagamentoRepository;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoRepository pagamentoRepository;	
	
	public List<Pagamento> findAll(){
		return pagamentoRepository.findAll();
	}
	
	public List<Object[]> findByMonths(){
		return pagamentoRepository.listByDataBetween();
	}
	
	public List<Object[]> findPagamentosOrgSuperiorByMonths(Long codigoOrgSuperior){
		return pagamentoRepository.listPagamentosOrgSuperiorByDataBetween(codigoOrgSuperior);
	}
	
	public List<Object[]> findPagamentosOrgSubordinadoByMonths(Long codigoOrgSubordinado){
		return pagamentoRepository.listPagamentosOrgSubordinadoByDataBetween(codigoOrgSubordinado);
	}
	
	public List<Object[]> findPagamentosUnidadeGestoraByMonths(Long codigoUnidadeGestora){
		return pagamentoRepository.listPagamentosUnidadeGestoraByDataBetween(codigoUnidadeGestora);
	}
}