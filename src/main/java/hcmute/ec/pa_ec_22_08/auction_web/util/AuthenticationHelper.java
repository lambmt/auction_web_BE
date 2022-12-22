package hcmute.ec.pa_ec_22_08.auction_web.util;

import hcmute.ec.pa_ec_22_08.auction_web.entity.AuthenticationUser;
import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationHelper {
    public static String getUsernameFromContext() {
        AuthenticationUser principal = (AuthenticationUser) SecurityContextHolder.getContext().getAuthentication();
        return principal != null ? principal.getUsername() : null;
    }

    public static Role getRoleFromContext() {
        AuthenticationUser principal = (AuthenticationUser) SecurityContextHolder.getContext().getAuthentication();
        return principal != null ? principal.getRole() : Role.CUSTOMER;
    }
}
