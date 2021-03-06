package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationToken {
  @JsonProperty("token")
  private String token = null;
  @JsonProperty("userId")
  private Long userId = null;
  @JsonProperty("userSignature")
  private String userSignature = null;
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  public Long getUserId() {
    return userId;
  }
  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserSignature() {
    return userSignature;
  }
  public void setUserSignature(String userSignature) {
    this.userSignature = userSignature;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationToken {\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  userSignature: ").append(userSignature).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

