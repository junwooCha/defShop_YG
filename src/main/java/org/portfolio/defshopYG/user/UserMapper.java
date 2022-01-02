package org.portfolio.defshopYG.user;

import org.apache.ibatis.annotations.Mapper;
import org.portfolio.defshopYG.user.model.UserEntity;

@Mapper
public interface UserMapper {
    UserEntity loginComplet(UserEntity entity);
    int joinUser(UserEntity entity);
}
