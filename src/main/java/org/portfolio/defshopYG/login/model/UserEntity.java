package org.portfolio.defshopYG.login.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserEntity {
    private int iuser;
    private String nm;
    private String phone;
    private String uid;
    private String upw;
    private String email;
    private String nickname;
    private int gender;
    private String rdt;
}
