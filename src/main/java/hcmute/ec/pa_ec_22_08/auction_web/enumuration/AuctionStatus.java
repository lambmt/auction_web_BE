package hcmute.ec.pa_ec_22_08.auction_web.enumuration;

public enum AuctionStatus {
    WAITING_FOR_APPROVE(0),
    ON_AUCTION(1),
    AUCTION_SUCCESS(2),
    AUCTION_FAIL(3);

    private final int status;

    AuctionStatus(int status) {
        this.status = status;
    }
}
