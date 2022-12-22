package hcmute.ec.pa_ec_22_08.auction_web.dto.req;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpDTO {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private Role role;
}
