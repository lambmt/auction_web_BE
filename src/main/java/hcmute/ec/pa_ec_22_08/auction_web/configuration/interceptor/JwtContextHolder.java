package hcmute.ec.pa_ec_22_08.auction_web.configuration.interceptor;

public class JwtContextHolder {
    private static InheritableThreadLocal<String> jwt = new InheritableThreadLocal<>();
    public static void setCurrentJwt(String currentJwt) {
        jwt.set(currentJwt);
    }
    public static String getCurrentJwt() {
        return jwt.get();
    }
    public static void clear() {
        jwt.remove();
    }
}
