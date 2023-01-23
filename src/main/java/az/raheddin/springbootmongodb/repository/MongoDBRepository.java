package az.raheddin.springbootmongodb.repository;

import az.raheddin.springbootmongodb.entity.Commission;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDBRepository extends MongoRepository<Commission,String> {
}
