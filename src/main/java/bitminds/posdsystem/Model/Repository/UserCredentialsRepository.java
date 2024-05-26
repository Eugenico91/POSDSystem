package bitminds.posdsystem.Model.Repository;

import bitminds.posdsystem.Model.Entity.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Long> {

}
