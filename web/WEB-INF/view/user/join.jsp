<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/res/css/join.css?ver=3">

    <form action="/user/join" method="post" class="joinForm" id="joinfrm" onsubmit="return joinChk();">

        <h2>회원가입</h2>
        <div class="textForm">
            <input name="nm" type="text" class="name" placeholder="이름" required>
        </div>
        <div class="textForm">
            <input name="phone" type="text" class="cellphoneNo" placeholder="010-****-****" required>
        </div>
        <div class="textForm">
            <input name="uid" type="text" class="id" placeholder="아이디" required>
        </div>
        <font>*8자리에서 20자 이내로 입력 주십시오.</font>
        <div class="textForm">
            <input name="upw" type="password" class="pw" placeholder="비밀번호" required>
        </div>
        <font>*8자리에서 20자 이내로 입력 주십시오.</font>
        <div class="textForm">
            <input name="reupw" type="password" class="pw" placeholder="비밀번호 확인" required>
        </div>
        <font>*위비밀번호와 동일하게 입력 해주십시오.</font>
        <div class="textForm">
            <input name="email" type="text" class="email" placeholder="이메일" required>
        </div>
        <div class="textForm">
            <input name="nickname" type="text" class="nickname" placeholder="닉네임" required>
        </div>
        <div class="labels">
            <label>남<input type="radio" value="1" name="gender" checked></label>
            <label>여<input type="radio" value="2" name="gender"></label>
            <br>
            <font>*성별을 선택 해주십시오.</font>
        </div>
        <input type="submit" class="btn" value="완료"/>
    </form>

<script src="/res/js/join.js?ver=1"></script>
