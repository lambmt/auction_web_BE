package hcmute.ec.pa_ec_22_08.auction_web.dto.res;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@Builder
@Data
public class TokenRes {
    private String username;
    private Role role;
    private String token;
    private String refreshToken;
    private boolean validated;
}
