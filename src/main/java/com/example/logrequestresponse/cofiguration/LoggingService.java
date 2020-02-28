package com.example.logrequestresponse.cofiguration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Vibol rim
 */

public interface LoggingService {

    void logRequest(HttpServletRequest httpServletRequest, Object object);
    void  logResponse(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse, Object object);
}
