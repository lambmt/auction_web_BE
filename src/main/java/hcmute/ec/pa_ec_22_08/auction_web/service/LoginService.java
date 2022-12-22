package hcmute.ec.pa_ec_22_08.auction_web.service;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.LoginDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.SignUpDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.res.TokenRes;
import hcmute.ec.pa_ec_22_08.auction_web.entity.TokenItem;

public interface LoginService {
    TokenRes signUpUser(SignUpDTO signUpDTO) throws Exception;

    TokenRes loginUser(LoginDTO loginDTO) throws Exception;
}
