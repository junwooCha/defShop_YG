<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="/res/css/findId.css?=ver3">
<c:if test="${sessionScope.loginUser != null}">
    <script>
        alert('잘못된 요청입니다.');
        document.location.href="http://localhost:8090/page/main";
    </script>
</c:if>
<div class="id">
    <div class="center">
        <div>
            <div>ID : ${requestScope.id} 입니다.</div>
            <div>
                <span class="forgot_pw"><input type="submit" value="비밀번호 찾기"></span>
            </div>
        </div>
    </div>
</div>

<div id="wherePw" class="modal">
        <form action="/user/findPw" method="get" id="chkId">
                <div> <input type="text" name="uid" placeholder="아이디" required></div>
                <div> <input type="text" name="phone" placeholder="번호" required></div>
                <div>
                    <span class="save"><input type="submit" value="확인"></span>
                    <span class="close"><input type="button" value="닫기"></span>
                </div>
        </form>
</div>

<c:if test="${requestScope.err2 ne null}">
    <script>
        alert('<c:out value="${requestScope.err2}"/>');
        history.back();//이전페이지
    </script>
</c:if>

<script src="/res/js/findId.js?ver=1"></script>
