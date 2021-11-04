package mongoexercise.consultorio.model;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DatabaseConsultas")
public class ConsultaModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@NotBlank
	private String data;
	
	@DBRef
	@NotBlank
	private MedicoModel medico;

	@NotBlank
	private String descricao;
	
	@NotBlank
	private String paciente;

	public ConsultaModel() {
		super();
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(data, descricao, id, medico, paciente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaModel other = (ConsultaModel) obj;
		return Objects.equals(data, other.data) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(id, other.id) && Objects.equals(medico, other.medico)
				&& Objects.equals(paciente, other.paciente);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public MedicoModel getMedico() {
		return medico;
	}

	public void setMedico(MedicoModel medico) {
		this.medico = medico;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
}
