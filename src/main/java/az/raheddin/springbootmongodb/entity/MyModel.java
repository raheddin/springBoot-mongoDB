package az.raheddin.springbootmongodb.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyModel {
    private Long id;
    private String acc;
    private String name;
}
