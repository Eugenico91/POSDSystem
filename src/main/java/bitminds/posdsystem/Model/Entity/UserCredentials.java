package bitminds.posdsystem.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "user_credential")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserCredentials {

    @Id
    private Long idUser;
    private String password;
    private Date dateLastModificationPassword;

}
