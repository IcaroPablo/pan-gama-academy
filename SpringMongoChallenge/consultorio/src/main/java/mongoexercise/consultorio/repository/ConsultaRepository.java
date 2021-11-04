package mongoexercise.consultorio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mongoexercise.consultorio.model.ConsultaModel;

public interface ConsultaRepository extends MongoRepository<ConsultaModel, String> {
	
}