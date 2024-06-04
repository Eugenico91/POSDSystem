package bitminds.posdsystem.Model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "pattern")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pattern {

    @Id
    private Long id;

    private String name;
    private String description;
    private String context;
    private String privacyByDesignPrinciples;
    private boolean isPublished;

}
