package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "user_token")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class TokenItem extends AbstractAuditingEntity implements Serializable,Comparable<TokenItem> {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String userId;
    private Role role;
    private String token;
    private String refreshToken;

    @CreatedDate
    @Column(name = "created_date", updatable = true)
    protected LocalDateTime createdDate;

    @CreatedBy
    @Column(name = "created_by", length = 50, updatable = false)
    protected String createdBy;

    @LastModifiedDate
    @Column(name = "updated_date")
    protected LocalDateTime updatedDate;

    @LastModifiedBy
    @Column(name = "updated_by", length = 50)
    protected String updatedBy;

    @Override
    public int compareTo(TokenItem tokenItem) {
        LocalDateTime date1 = this.getCreatedDate();
        LocalDateTime date2 = tokenItem.getCreatedDate();
        return date1.compareTo(date2);
    }
}
