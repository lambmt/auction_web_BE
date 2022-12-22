package hcmute.ec.pa_ec_22_08.auction_web.enumuration;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.CategoryType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

public enum Category {
    BEAUTY(0),
    CLOTHING_ACCESSORIES(1),
    JEWELRY(2),
    PET(3),
    FOOD(4),
    TRANSPORT(5),
    DEVICE(6),
    FURNITURE(7),
    ART(8);



    private final int category;

    Category(int category) {
        this.category = category;
    }
}
