package org.portfolio.defshopYG.user.model;

//모든 필드 값을 파라미터로 받는 생성자를 만듦
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LoginResult {
    private final int result;
    private final UserEntity loginUser;
}