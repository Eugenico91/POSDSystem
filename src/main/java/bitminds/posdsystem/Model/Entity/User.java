package bitminds.posdsystem.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "user_info")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private Long id;

    private String nome;
    private String cognome;
    private String email;
    private Date dataNascita;
    private Date dataRegistrazione;
    private int ruoloUtente;


}
