package com.sys.api.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sys.domain.model.Client;
import com.sys.domain.model.repository.ClientRepositoty;
import com.sys.domain.service.ClientCatalogService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {

	private ClientRepositoty clientRepositoty;
	private ClientCatalogService clientCatalogService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Client> read() {

		return clientRepositoty.findAll();
	}

	@RequestMapping(value = "/{clientId}", method = RequestMethod.GET)
	public ResponseEntity<Client> read(@PathVariable Long clientId) {

		return clientRepositoty.findById(clientId).map(client -> ResponseEntity.ok(client))
				.orElse(null);
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(code = HttpStatus.CREATED)
	public Client create(@Valid @RequestBody Client client) {

		return clientCatalogService.save(client);
	}

	@RequestMapping(value = "/{clientId}", method = RequestMethod.PUT)
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public ResponseEntity<Client> update(@PathVariable Long clientId, @Valid @RequestBody Client client) {

		if (!clientRepositoty.existsById(clientId)) {

			return ResponseEntity.notFound().build();
		}

		client.setId(clientId);
		client = clientCatalogService.save(client);

		return ResponseEntity.ok(client);
	}

	@RequestMapping(value = "/{clientId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long clientId) {

		if (!clientRepositoty.existsById(clientId)) {

			return ResponseEntity.notFound().build();
		}
		
		clientCatalogService.delete(clientId);
		
		return ResponseEntity.noContent().build();
	}
}
