package com.homeoffice.brdata.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homeoffice.brdata.entities.Senso;

@RestController
@RequestMapping(value = "/senso")
public class SensoResource {

	@GetMapping
	public ResponseEntity<Senso> findAll() {
		Senso s = new Senso(2010, 21, "Maranhão", "2105302", "Imperatriz", "RM Sudoeste Maranhense", "2102",
				"Oeste Maranhense", "21009", "Imperatriz", 2936194.000, 247553, 11861.000);
		return ResponseEntity.ok().body(s);
	}

}
