package hcmute.ec.pa_ec_22_08.auction_web.service;

import hcmute.ec.pa_ec_22_08.auction_web.constant.VariableConstant;
import hcmute.ec.pa_ec_22_08.auction_web.entity.TokenItem;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class TokenAuthenticationFilter extends OncePerRequestFilter {
    protected abstract TokenItem getTokenItem(String tokenId);

    @Override
    protected void doFilterInternal (
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain
    ) throws ServletException, IOException {
        String tokenId = getTokenId(request);
    }

    private String getTokenId(HttpServletRequest request) {
        String bearerToken = request.getHeader(VariableConstant.HEADER_STRING);
        if (StringUtils.startsWithIgnoreCase(bearerToken, VariableConstant.TOKEN_PREFIX)) {
            return bearerToken.substring(7);
        }
        return request.getParameter("token");
    }
}
