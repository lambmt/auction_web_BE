package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.CategoryType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Category")
@Getter
@Setter
public class Category extends AbstractAuditingEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long categoryId;

    private String categoryName;
    private CategoryType categoryType;
}
