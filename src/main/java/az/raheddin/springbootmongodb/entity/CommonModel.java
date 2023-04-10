package az.raheddin.springbootmongodb.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document
@CompoundIndex(name = "CommandModel_UNIQUE", def = "{'name': 1, 'cif': 1}", unique = true)
public class CommonModel<T> {
    @Id
    private String id;

    private String name;

    private String cif;

    private String type;

    private T model;
}
