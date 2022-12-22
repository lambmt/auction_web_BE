package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_token")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TokenItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private Role role;
    private String token;
    private String refreshToken;

    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime updatedDate;
    private String updatedBy;

}
