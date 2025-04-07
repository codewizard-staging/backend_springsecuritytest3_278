package com.app.springsecuritytest3.Exception;

public class InvalidTokenException extends RuntimeException{
  public InvalidTokenException(String message){
    super(message);
  }
}
