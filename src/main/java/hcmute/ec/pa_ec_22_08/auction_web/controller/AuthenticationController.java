package hcmute.ec.pa_ec_22_08.auction_web.controller;

import hcmute.ec.pa_ec_22_08.auction_web.dto.req.LoginDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.SignUpDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.res.TokenRes;
import hcmute.ec.pa_ec_22_08.auction_web.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auction/auth")
public class AuthenticationController {

    private final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
    private final LoginService loginService;

    public AuthenticationController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<TokenRes> login(HttpServletRequest request, @RequestBody LoginDTO loginDTO) throws Exception {
        return ResponseEntity.ok(loginService.loginUser(loginDTO));
    }

    @PostMapping("/signup")
    public ResponseEntity<TokenRes> signup(@RequestBody SignUpDTO signUpDTO) throws Exception {
        logger.info("avc");
        return ResponseEntity.ok(loginService.signUpUser(signUpDTO));
    }
}
