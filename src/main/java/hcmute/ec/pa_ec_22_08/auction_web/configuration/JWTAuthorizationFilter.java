package hcmute.ec.pa_ec_22_08.auction_web.configuration;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import hcmute.ec.pa_ec_22_08.auction_web.constant.RegexConstant;
import hcmute.ec.pa_ec_22_08.auction_web.constant.VariableConstant;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

    public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res,
                                    FilterChain chain) throws IOException, ServletException {
        String header = req.getHeader(VariableConstant.HEADER_STRING);
        if (header == null || !header.startsWith(VariableConstant.TOKEN_PREFIX)) {
            chain.doFilter(req, res);
            return;
        }

        UsernamePasswordAuthenticationToken authenticationToken = getAuthentication(req);

        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        chain.doFilter(req, res);
    }

    private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
        String token = request.getHeader(VariableConstant.HEADER_STRING);
        if (token != null) {
            //parse the token
            String user = JWT.require(Algorithm.HMAC512(VariableConstant.SECRET.getBytes()))
                    .build()
                    .verify(token.replace(VariableConstant.TOKEN_PREFIX, RegexConstant.REGEX_BLANK))
                    .getSubject();
            if (user != null) {
                //new arrayList mean authorities
                return new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
            }
            return null;
        }
        return null;
    }
}
