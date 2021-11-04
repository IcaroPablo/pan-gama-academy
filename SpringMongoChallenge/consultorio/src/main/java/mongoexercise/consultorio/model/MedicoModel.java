package mongoexercise.consultorio.model;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DatabaseMedicos")
public class MedicoModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	@NotBlank
	private String nome;
	
	public MedicoModel() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicoModel other = (MedicoModel) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
