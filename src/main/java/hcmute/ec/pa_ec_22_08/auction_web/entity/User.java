package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Gender;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "User")
@Getter
@Setter
@ToString
public class User {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @NotNull
    @Size(max = 64)
    @Column(name = "username", nullable = true)
    private String username;

    @OneToOne(mappedBy = "userPassword")
    private Password password;

    @OneToOne(mappedBy = "userPayment")
    private Payment payment;

    @NotNull
    @Size(max = 64)
    @Column(name = "first_name", length = 64, nullable = true)
    private String firstName;

    @NotNull
    @Size(max = 64)
    @Column(name = "last_name", length = 64, nullable = true)
    private String lastName;

    @NotNull
    @Size(max = 100)
    @Column(name = "email", length = 100, nullable = false)
    private String email;

    @Size(max = 50)
    @Column(name = "phone_no", length = 50)
    private String phoneNo;

    @Size(max = 50)
    @Column(name = "gender", length = 50)
    private Gender gender;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @Column(name = "address")
    private String address;

    @Column(name = "day_of_birth")
    private Date dayOfBirth;

    @Column(name = "role")
    private Role role;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "del_frag")
    private boolean delFrag;

    private LocalDateTime createdDate;
    private String createdBy;
    private LocalDateTime updatedDate;
    private String updatedBy;

}
