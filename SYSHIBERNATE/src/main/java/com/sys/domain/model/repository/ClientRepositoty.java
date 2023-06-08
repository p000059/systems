package com.sys.domain.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sys.domain.model.Client;

@Repository
public interface ClientRepositoty extends JpaRepository<Client, Long> {
	
	Optional<Client> findById(Long id);
	List<Client> findByName(String name);
	List<Client> findByNameContaining(String name);
	Optional<Client> findByEmail(String email);
}
