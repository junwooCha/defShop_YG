<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/res/css/findPw.css?=ver4">
<input type="hidden" name="${iuser}">
<c:if test="${sessionScope.loginUser != null}">
    <script>
        alert('잘못된 요청입니다.');
        document.location.href="http://localhost:8090/page/main";
    </script>
</c:if>
<div class="pw">
    <div class="center">
        <form action="/user/updUpw" method="post" id="findPwfrm"onsubmit ="return findPw();">
            <div>
                <input type="hidden" name="iuser" value="${iuser}">
                <div><input type="password" id="changeUpw" name="changeUpw" placeholder="변경 비밀번호"></div>
                <div><input type="password" id="changeUpwConfirm" name="changeUpwConfirm" placeholder="확인 비밀번호"></div>
                <div class="forgot_pw"><input type="submit" value="비밀번호 변경"></div>
            </div>
        </form>
    </div>
</div>

<script src="/res/js/findPw.js?ver=2"></script>