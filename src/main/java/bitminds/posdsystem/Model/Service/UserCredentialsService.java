package bitminds.posdsystem.Model.Service;

import bitminds.posdsystem.Model.Repository.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserCredentialsService {

    @Autowired
    private UserCredentialsRepository userCredentialsRepository;


}
