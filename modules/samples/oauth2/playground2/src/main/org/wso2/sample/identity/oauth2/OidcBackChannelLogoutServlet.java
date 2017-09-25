package org.wso2.sample.identity.oauth2;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.json.JSONObject;


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
        BasicConfigurator.configure();
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        doPost(req,resp);
        log.info("*****accessing get method");
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        log.info("*****accessing post method");
        log.info("*********"+req.getParameter("logout_token"));
        byte[] decodedBytes = Base64.decodeBase64(req.getParameter("logout_token"));
        String logout_Token = new String(decodedBytes);
        log.info(logout_Token);
        JSONObject header = new JSONObject(logout_Token);
//        resp.sendRedirect("playground2/logout/logout-token.jsp");
        RequestDispatcher dispatcher = req.getRequestDispatcher("logout/logout-token.jsp");
        dispatcher.forward(req, resp);


    }
}
