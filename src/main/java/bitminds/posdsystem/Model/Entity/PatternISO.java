package bitminds.posdsystem.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "pattern_ISO")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PatternISO {

    @Id
    private Long id;

    private Long idISO;
    private Long idPattern;
}
