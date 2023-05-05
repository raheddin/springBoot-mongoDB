package az.raheddin.springbootmongodb.repository;


import az.raheddin.springbootmongodb.entity.CommonModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommonModelRepository extends MongoRepository<CommonModel<?>, String> {
}
