package com.uriamp.models;

public class AudioFile {
  private String title;
  private int duration;
  private int likes;
  private int plays;

  public void like() {
    likes++;
  }

  public void play() {
    plays++;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getDuration() {
    return duration;
  }

  public int getLikes() {
    return likes;
  }

  public int getPlays() {
    return plays;
  }

}
