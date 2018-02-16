package com.vakatip.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by pvakati on 2/15/2018.
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "There is a problem while processing your request. please wait for some time")
public class CustomException extends Exception {

    private static final long serialVersionUID = 100L;
}
