package com.globhack.leaf.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globhack.leaf.model.entity.UsuariosEntity;
import com.globhack.leaf.model.service.IUsuariosService;


@RestController
@RequestMapping("/LEAF/V1")
public class UsuarioController {

	@Autowired
	private IUsuariosService usuarioService;

	@PostMapping("/usuario")
	public ResponseEntity<?> createUser(@RequestBody UsuariosEntity usuario) {
		Map<String, Object> response = new HashMap<>();
		UsuariosEntity usuarioCreado = null;
		try {
			usuarioCreado = usuarioService.createUser(usuario);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al insertar en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			response.put("mensaje", "Error al insertar en la base de datos");
			response.put("error", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		response.put("mensaje", "Usuario creado con éxito");
		response.put("usuario", usuarioCreado);

		return new ResponseEntity<UsuariosEntity>(usuarioCreado, HttpStatus.OK);
	}
}
