package hcmute.ec.pa_ec_22_08.auction_web.repository;

import hcmute.ec.pa_ec_22_08.auction_web.entity.Password;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Long> {
    Password findByUsername(String username);
}
