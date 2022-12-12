package hcmute.ec.pa_ec_22_08.auction_web.constant;

import org.springframework.stereotype.Component;

@Component
public class VariableConstant {
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SECRET = "SECRET_KEY";
    public static final long EXPIRATION_TIME = 900_000; //15 minutes
}
