package com.kasisto.api;

import com.kasisto.api.*;
import com.kasisto.api.model.*;

import com.sun.jersey.multipart.FormDataParam;

import com.kasisto.api.model.ValidateOtpResponse;
import com.kasisto.api.model.ValidateOtpRequest;

import java.util.List;
import com.kasisto.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-02-08T11:56:06.345-05:00")
public abstract class ValidateOtpApiService {
  
      public abstract Response validateOtpPost(String secret,String token,ValidateOtpRequest validateOtpRequest,SecurityContext securityContext)
      throws NotFoundException;
  
}
