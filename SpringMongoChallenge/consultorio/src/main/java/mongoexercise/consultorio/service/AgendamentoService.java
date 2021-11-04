package mongoexercise.consultorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mongoexercise.consultorio.model.ConsultaModel;
import mongoexercise.consultorio.model.MedicoModel;
import mongoexercise.consultorio.repository.ConsultaRepository;
import mongoexercise.consultorio.repository.MedicoRepository;

@Service
public class AgendamentoService {

	@Autowired
	ConsultaRepository consultaRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
	public List<ConsultaModel> listarConsultas() {
		return consultaRepository.findAll();
	}
	
	public List<MedicoModel> listarMedicos() {
		return medicoRepository.findAll();
	}
	
	public MedicoModel encontrarMedico (String id) {
		return medicoRepository.findById(id)
				               .orElseThrow(() -> new IllegalArgumentException("Médico Inexistente"));
	}
	
	public MedicoModel cadastrarMedico(MedicoModel medico) {
		return medicoRepository.save(medico);
	}
	
	public ConsultaModel encontrarConsulta(String id) {
		return consultaRepository.findById(id)
				                 .orElseThrow(() -> new IllegalArgumentException("Consulta inexistente!"));
	}
	
	public ConsultaModel cadastrarConsulta(ConsultaModel consulta, String medicoId) {
		MedicoModel MedicoAux = encontrarMedico(medicoId);
		consulta.setMedico(MedicoAux);
		return consultaRepository.save(consulta);
	}	
	
}
