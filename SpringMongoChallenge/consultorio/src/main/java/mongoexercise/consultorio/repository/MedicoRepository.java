package mongoexercise.consultorio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mongoexercise.consultorio.model.MedicoModel;

public interface MedicoRepository extends MongoRepository<MedicoModel, String> {
	
}
