package br.com.cdeworks.sgp.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cdeworks.sgp.entity.model.Membro;

@Repository
public interface MembroRepository extends JpaRepository<Membro, Integer> {

}
