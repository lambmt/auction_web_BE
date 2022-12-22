package hcmute.ec.pa_ec_22_08.auction_web.service.impl;

import hcmute.ec.pa_ec_22_08.auction_web.constant.MessageConstant;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.LoginDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.req.SignUpDTO;
import hcmute.ec.pa_ec_22_08.auction_web.dto.res.TokenRes;
import hcmute.ec.pa_ec_22_08.auction_web.entity.Password;
import hcmute.ec.pa_ec_22_08.auction_web.entity.User;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import hcmute.ec.pa_ec_22_08.auction_web.repository.PasswordRepository;
import hcmute.ec.pa_ec_22_08.auction_web.repository.TokenItemRepository;
import hcmute.ec.pa_ec_22_08.auction_web.repository.UserRepository;
import hcmute.ec.pa_ec_22_08.auction_web.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    private final UserRepository userRepository;
    private final TokenItemRepository tokenItemRepository;
    private final PasswordRepository passwordRepository;

    public LoginServiceImpl(UserRepository userRepository,
                            TokenItemRepository tokenItemRepository,
                            PasswordRepository passwordRepository) {
        this.userRepository = userRepository;
        this.tokenItemRepository = tokenItemRepository;
        this.passwordRepository = passwordRepository;
    }

    @Override
    public TokenRes signUpUser(SignUpDTO signUpDTO) throws Exception {
        log.info("Start sign up new user");
        //validate input
        if (signUpDTO.getRole().equals(Role.ADMIN)) {
            throw new Exception(MessageConstant.ROLE_NOT_AVAILABLE);
        }
        boolean validated = validateReq(signUpDTO);
        if (validated) {
            Optional<User> userOtp = userRepository.findByUsernameOrEmail(signUpDTO.getUsername(), signUpDTO.getEmail());
            if (userOtp.isPresent()) {
                throw new Exception(MessageConstant.USER_EXISTED);
            }
            LocalDateTime now = LocalDateTime.now();
            User newUser = new User();
            newUser.setFirstName(signUpDTO.getFirstName());
            newUser.setLastName(signUpDTO.getLastName());
            newUser.setEmail(signUpDTO.getEmail());
            String passwordEncoder = signUpDTO.getPassword();
            Password password = new Password(passwordEncoder, signUpDTO.getUsername());
            newUser.setUsername(signUpDTO.getUsername());
            newUser.setRole(signUpDTO.getRole());
            newUser.setCreatedDate(now);
            newUser.setCreatedBy("admin");
            newUser.setUpdatedDate(now);
            newUser.setUpdatedBy("admin");

            userRepository.save(newUser);
        }
        return new TokenRes();
    }

    @Override
    public TokenRes loginUser(LoginDTO loginDTO) throws Exception {
        log.info("Start login user");
        Optional<User> userOtp = userRepository.findByUsernameOrEmail(loginDTO.getUsernameOrEmail(), loginDTO.getUsernameOrEmail());
        if (userOtp.isPresent()) {
            User existedUser = userOtp.get();
            if (loginDTO.getPassword().equals(passwordRepository.findByUsername(existedUser.getUsername()).getPassword())) {
                String token = genToken();
                return TokenRes.of(existedUser.getUsername(), existedUser.getRole(), token, token, true);
            } else {
                throw new Exception("Password incorrect");
            }
        } else {
            throw new Exception(MessageConstant.USER_NOT_FOUND);
        }
    }

    private boolean validateReq(SignUpDTO signUpDTO) {
        if (signUpDTO.getFirstName() == null) {
            return false;
        }
        if (signUpDTO.getLastName() == null) {
            return false;
        }
        if (signUpDTO.getUsername() == null) {
            return false;
        } else {
            if (signUpDTO.getPassword().length() < 6) {
                return false;
            }
        }
        if (signUpDTO.getPassword() == null) {
            return false;
        } else {
            if (signUpDTO.getPassword().length() < 6) {
                return false;
            }
        }
        if (signUpDTO.getEmail() == null) {
            return false;
        } else {
            if (!signUpDTO.getEmail().contains("@")) {
                return false;
            }
        }
        if (signUpDTO.getRole() == null) {
            return false;
        }
        return true;
    }

    private String genToken(){
        return null;
    }
}
