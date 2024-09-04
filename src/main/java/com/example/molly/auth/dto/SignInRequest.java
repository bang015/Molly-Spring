package com.example.molly.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SignInRequest {
  @Email(message = "이메일 형식이 아닙니다.")
  @NotBlank(message = "이메일을 입력해주세요.")
  private String email;

  @NotBlank(message = "비밀번호를 입력해주세요.")
  @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야 합니다.")
  private String password;
}
