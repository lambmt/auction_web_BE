package hcmute.ec.pa_ec_22_08.auction_web.enumuration;

public enum CategoryType {
    BEAUTY("BEAUTY"),
    CLOTHING_ACCESSORIES("CLOTHING ACCESSORIES"),
    PET("PET"),
    JEWELRY("JEWELRY"),
    FOOD("FOOD"),
    TRANSPORT("TRANSPORT"),
    ELECTRONIC_DEVICE("ELECTRONIC DEVICE"),
    OFFICE_SUPPLIES("OFFICE SUPPLIES"),
    FURNITURE("FURNITURE");

    private final String categoryType;

    CategoryType(String categoryType) {
        this.categoryType = categoryType;
    }
}
