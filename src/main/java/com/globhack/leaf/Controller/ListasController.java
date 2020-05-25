package com.globhack.leaf.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globhack.leaf.model.entity.ListasEntity;
import com.globhack.leaf.model.service.IListasService;

@RestController
@RequestMapping("/LEAF/V1/listas")
public class ListasController {

	@Autowired
	private IListasService listaService;

	@GetMapping("/categoria/{dscodigo}")
	public ResponseEntity<?> findCategory(@PathVariable String dscodigo) {
		List<ListasEntity> lstCategorias = null;
		Map<String, Object> response = new HashMap<>();

		try {
			lstCategorias = listaService.findCategory(dscodigo);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos ");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (lstCategorias.size() <= 0) {
			response.put("mensaje",
					"La palabra: ".concat(dscodigo.concat(" no existe como categoría en la base de datos")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<ListasEntity>>(lstCategorias, HttpStatus.OK);
	}
}
