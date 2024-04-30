package com.uriamp.models;

public class Podcast extends AudioFile {
  private String host;
  private String preview;

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getPreview() {
    return preview;
  }

  public void setPreview(String preview) {
    this.preview = preview;
  }

}
