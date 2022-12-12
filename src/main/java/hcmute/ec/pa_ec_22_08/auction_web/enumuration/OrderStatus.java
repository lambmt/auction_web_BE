package hcmute.ec.pa_ec_22_08.auction_web.enumuration;

public enum OrderStatus {
    NEW(0),
    WAITING_FOR_CONFIRM_FROM_BUYER(1),
    WAITING_FOR_CONFIRM_FROM_SELLER(2),
    DELIVERY(3),
    COMPLETED(4);

    private final int status;

    OrderStatus(int status) {
        this.status = status;
    }
}
