package br.com.vidracaria.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.vidracaria.domain.model.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
	
	@Query("SELECT SUM(valor) FROM Despesa")
	public int valorTotal();
}
