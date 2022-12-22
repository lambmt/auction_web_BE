package hcmute.ec.pa_ec_22_08.auction_web.service.impl;

import hcmute.ec.pa_ec_22_08.auction_web.entity.TokenItem;
import hcmute.ec.pa_ec_22_08.auction_web.service.TokenAuthenticationFilter;
import hcmute.ec.pa_ec_22_08.auction_web.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TokenAuthenticationFilterImpl extends TokenAuthenticationFilter {

    @Autowired
    TokenService tokenService;

    @Override
    protected TokenItem getTokenItem(String tokenId) {
        return tokenService.getTokenItem(tokenId);
    }
}
