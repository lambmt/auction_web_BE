package hcmute.ec.pa_ec_22_08.auction_web.enumuration;

public enum State {
    NEW(0),
    USED(1);

    private final int state;

    State(int state) {
        this.state = state;
    }
}
