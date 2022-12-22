package hcmute.ec.pa_ec_22_08.auction_web.service;

import hcmute.ec.pa_ec_22_08.auction_web.entity.TokenItem;
import hcmute.ec.pa_ec_22_08.auction_web.repository.TokenItemRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TokenService {

    private final TokenItemRepository tokenItemRepository;

    public TokenService(TokenItemRepository tokenItemRepository) {
        this.tokenItemRepository = tokenItemRepository;
    }

    public TokenItem getTokenItem(String tokenId) {
        Optional<TokenItem> otp = tokenItemRepository.findByToken(tokenId);
        return otp.orElseGet(() -> null);
    }
}
