package az.raheddin.springbootmongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;

@Data
@Document
public class Commission {

    @Id
    private String msgId;
    private String cif;
    private Integer amount;
    private HashMap<String,Integer> commission;
}
