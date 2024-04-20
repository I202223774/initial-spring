package pe.cibertec.application.model;

import lombok.*;

//@Data //Getter, Setter, ToString, EqualsAndHashCode, NoArsConstrutor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class DocenteEntity {
    private int id;
    private String name;
    private String lastName;
    private String email;


}

