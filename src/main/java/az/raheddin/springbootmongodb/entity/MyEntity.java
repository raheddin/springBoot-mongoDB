package az.raheddin.springbootmongodb.entity;

import jakarta.persistence.EmbeddedId;
import lombok.Data;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class MyEntity implements Persistable<MyKey> {

    @EmbeddedId
    private MyKey myKey;

    private String text;

    @Override
    public MyKey getId() {
        return myKey;
    }

    @Override
    public boolean isNew() {
        return false;
    }
}
