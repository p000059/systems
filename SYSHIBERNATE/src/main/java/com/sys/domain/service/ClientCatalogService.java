package com.sys.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sys.domain.businessException.BusinessException;
import com.sys.domain.model.Client;
import com.sys.domain.model.repository.ClientRepositoty;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ClientCatalogService {

	private ClientRepositoty clientRepositoty;
	
	@Transactional
	public Client save(Client client) {
		
		boolean emailInUse = clientRepositoty.findByEmail(client.getEmail())
				.stream()
				.anyMatch(existingClient -> existingClient.equals(client));
		
		boolean nameInUse = clientRepositoty.findByName(client.getName())
				.stream()
				.anyMatch(name -> name.equals(client));
		
		if(emailInUse == false) {
			
			throw new BusinessException(client.getEmail() + " in use.");
		}
		
		if(nameInUse == false) {
			
			throw new BusinessException(client.getName() + " in use.");
		}
		
		return clientRepositoty.save(client);
	}
	
	@Transactional
	public void delete(Long clientId) {
		
		clientRepositoty.deleteById(clientId);
	}
}
