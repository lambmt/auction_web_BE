package hcmute.ec.pa_ec_22_08.auction_web.enumuration;

public enum ProductStatus {
    WAITING_FOR_APPROVE(0),
    ON_SALE(1),
    SOLD_OUT(2);

    private final int status;

    ProductStatus(int status) {
        this.status = status;
    }
}
