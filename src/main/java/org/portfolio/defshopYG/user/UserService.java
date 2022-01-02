package org.portfolio.defshopYG.user;

import org.mindrot.jbcrypt.BCrypt;
import org.portfolio.defshopYG.user.model.UserEntity;
import org.portfolio.defshopYG.utils.Const;
import org.portfolio.defshopYG.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    @Autowired
    private HttpSession hs;

    public int joinUser(UserEntity entity){
        int result = 0;
        try {
            String hashPw = BCrypt.hashpw(entity.getUpw(), BCrypt.gensalt());
            entity.setUpw(hashPw);
            result = mapper.joinUser(entity);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public int login(UserEntity entity) {
        UserEntity loginUser = null;
        try {
            loginUser = mapper.loginComplet(entity);
            if (BCrypt.checkpw(entity.getUpw(), loginUser.getUpw())) { //비밀번호 맞았음
                hs.setAttribute(Const.LOGIN_USER, loginUser);
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0; //로그인 실패
    }

}