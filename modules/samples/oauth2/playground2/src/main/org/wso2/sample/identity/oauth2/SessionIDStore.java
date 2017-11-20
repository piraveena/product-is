package org.wso2.sample.identity.oauth2;

import com.nimbusds.jwt.SignedJWT;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by piraveena on 11/20/17.
 */
public class SessionIDStore {
    private static Log log= LogFactory.getLog(SessionIDStore.class);
    private static Map<String , HttpSession> sessionMap =  new HashMap<>();
    public static void storeSession( String sid, HttpSession session){
        sessionMap.put(sid, session);
        log.info("******* "+sid +" "+session.getMaxInactiveInterval());
    }

    public static String getSid(String idToken) throws ParseException {
        String sid =  (String) SignedJWT.parse(idToken).getJWTClaimsSet().getClaim("sid");
        log.info("******* "+sid);
        return idToken !=null?sid :null;
    }

    public static HttpSession getSession(String sid){
       return sessionMap.get(sid);
    }

    public static void setf(String code){
        String hh= "ddddddddddd";
    }

    public static void getGrant(String grant){
        String gr=grant;
    }
}
