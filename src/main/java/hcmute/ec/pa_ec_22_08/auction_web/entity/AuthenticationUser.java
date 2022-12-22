package hcmute.ec.pa_ec_22_08.auction_web.entity;

import hcmute.ec.pa_ec_22_08.auction_web.enumuration.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Data
@Builder
@AllArgsConstructor
public class AuthenticationUser implements Authentication {
    private String username;
    private Role role;
    private boolean authenticate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return username;
    }

    @Override
    public boolean isAuthenticated() {
        return authenticate;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        authenticate = isAuthenticated;
    }

    @Override
    public String getName() {
        return username;
    }
}
