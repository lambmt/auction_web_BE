package hcmute.ec.pa_ec_22_08.auction_web.dto.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    private String usernameOrEmail;
    private String password;
}
