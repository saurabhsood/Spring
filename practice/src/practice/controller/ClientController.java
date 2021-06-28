package practice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import practice.model.Client;



@RestController
@CrossOrigin
@RequestMapping(path = "/client")
public class ClientController {

	@PostMapping(path = "/add")
	public ResponseEntity<Client> addClient(@RequestBody Client client)
	{
		client.getClientData().setClientId(7);
		return ResponseEntity.ok().body(client);
	}
	
}
