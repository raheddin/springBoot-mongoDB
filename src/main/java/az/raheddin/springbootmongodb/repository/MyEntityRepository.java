package az.raheddin.springbootmongodb.repository;

import az.raheddin.springbootmongodb.entity.MyEntity;
import az.raheddin.springbootmongodb.entity.MyKey;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyEntityRepository extends MongoRepository<MyEntity, MyKey> {
}