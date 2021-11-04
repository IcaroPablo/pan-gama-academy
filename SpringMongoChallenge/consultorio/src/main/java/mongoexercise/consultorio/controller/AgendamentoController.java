package mongoexercise.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mongoexercise.consultorio.model.ConsultaModel;
import mongoexercise.consultorio.model.MedicoModel;
import mongoexercise.consultorio.service.AgendamentoService;

@RestController
@RequestMapping(path = "/consultorio")
public class AgendamentoController {

	@Autowired
	AgendamentoService agendamentoService;

	@GetMapping("/consulta")
	public ResponseEntity<List<ConsultaModel>> listarConsultas() {
		return ResponseEntity.ok().body(agendamentoService.listarConsultas());
	}
	
	@GetMapping("/medico")
	public ResponseEntity<List<MedicoModel>> listarMedicos() {
		return ResponseEntity.ok().body(agendamentoService.listarMedicos());
	}
	
	@GetMapping("/medico/{id}")
	public ResponseEntity<MedicoModel> encontrarMedico(@PathVariable String id) {
		return ResponseEntity.ok().body(agendamentoService.encontrarMedico(id));
	}
	
	@PostMapping("/medico")
	public ResponseEntity<MedicoModel> cadastrarMedico(@RequestBody MedicoModel medico) {
		return ResponseEntity.ok().body(agendamentoService.cadastrarMedico(medico));
	}
	
	@GetMapping("/consulta/{id}")
	public ResponseEntity<ConsultaModel> encontrarConsulta(@PathVariable String id) {
		return ResponseEntity.ok().body(agendamentoService.encontrarConsulta(id));
	}
	
	@PostMapping("/consulta/{MedicoId}")
	public ResponseEntity<ConsultaModel> cadastrarConsulta(@RequestBody ConsultaModel consulta, @PathVariable String MedicoId) {
		return ResponseEntity.ok().body(agendamentoService.cadastrarConsulta(consulta, MedicoId));
	}
	
}
