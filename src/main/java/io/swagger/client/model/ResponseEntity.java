package io.swagger.client.model;

import io.swagger.client.model.HttpHeaders;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 **/
@ApiModel(description = "")
public class ResponseEntity  {
  
  private HttpHeaders headers = null;
  private Object body = null;
  public enum StatusCodeEnum {
     100,  101,  102,  103,  200,  201,  202,  203,  204,  205,  206,  207,  208,  226,  300,  301,  302,  302,  303,  304,  305,  307,  308,  400,  401,  402,  403,  404,  405,  406,  407,  408,  409,  410,  411,  412,  413,  413,  414,  414,  415,  416,  417,  418,  419,  420,  421,  422,  423,  424,  426,  428,  429,  431,  500,  501,  502,  503,  504,  505,  506,  507,  508,  509,  510,  511, 
  };
  private StatusCodeEnum statusCode = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("headers")
  public HttpHeaders getHeaders() {
    return headers;
  }
  public void setHeaders(HttpHeaders headers) {
    this.headers = headers;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("body")
  public Object getBody() {
    return body;
  }
  public void setBody(Object body) {
    this.body = body;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("statusCode")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseEntity {\n");
    
    sb.append("  headers: ").append(headers).append("\n");
    sb.append("  body: ").append(body).append("\n");
    sb.append("  statusCode: ").append(statusCode).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
