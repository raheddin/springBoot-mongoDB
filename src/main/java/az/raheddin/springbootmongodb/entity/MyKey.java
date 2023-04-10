package az.raheddin.springbootmongodb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MyKey implements Serializable {

    private String idempotencyKey;

    @Column(nullable = false)
    private String  name;

    @Column(nullable = false)
    private String cif;
}