package az.raheddin.springbootmongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
@CompoundIndex(name = "my_entity_index", def = "{ 'name': 1, 'cif': 1 }", unique = true)
public class MyEntity  {

    @Id
    private String id;

    @Field("name")
    private String  name;

    @Field("cif")
    private String cif;

    private String text;

}
