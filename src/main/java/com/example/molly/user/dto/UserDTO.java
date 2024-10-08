package com.example.molly.user.dto;

import com.example.molly.user.entity.User;

import lombok.Data;

@Data
public class UserDTO {
  private Long id;
  private String email;
  private String nickname;
  private String name;
  private String introduce;
  private ProfileImageDTO profileImage;
  private long postCount;
  private long followerCount;
  private long followingCount;

  public UserDTO(User user) {
    this.id = user.getId();
    this.email = user.getEmail();
    this.nickname = user.getNickname();
    this.name = user.getName();
    this.introduce = user.getIntroduce();
    this.profileImage = user.getProfileImage() != null ? new ProfileImageDTO(user.getProfileImage().getPath()) : null;
  }
}
