package org.wso2.sample.identity.oauth2;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by piraveena on 9/11/17.
 */
public class OidcBackChannelLogoutServlet extends HttpServlet {
    private static Log log= LogFactory.getLog(OidcBackChannelLogoutServlet.class);
    public void init(ServletConfig config) throws SecurityException {
        log.info("**********Playground app-oidc bclogout uri");
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        log.info("*****accessing get method");
    }
}
