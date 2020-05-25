package com.globhack.leaf.Controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globhack.leaf.model.entity.ParticipantesEntity;
import com.globhack.leaf.model.service.IParticipantesService;

@RestController
@RequestMapping("/LEAF/V1")
public class ParticipantesController {

	@Autowired
	private IParticipantesService participanteService;

	@PostMapping("/participar")
	public ResponseEntity<?> inscriptionClass(@RequestHeader Map<String, String> headers) {
		Map<String, Object> response = new HashMap<>();
		ParticipantesEntity participante = null;
		try {
			participante = new ParticipantesEntity();
			participante.setNmdocumento(Integer.parseInt(headers.get("x-nmdocumento")));
			participante.setCdclase(Integer.parseInt(headers.get("x-cdclase")));
			participante.setFeregistro(new Date());
			participanteService.inscriptionClass(participante);
			response.put("mensaje", "Registro creado con éxito");
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al insertar en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			response.put("mensaje", "Error al insertar en la base de datos");
			response.put("error", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
}
