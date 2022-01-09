<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title}</title>
    <link rel="stylesheet" href="/res/css/layout.css?var=3">
</head>
<body>
<div class="container">
    <div class="header">
        <div class="topMenu">
            <div>
                <ul>
                   <c:if test="${sessionScope.loginUser == null }">
                       <li><a href="/user/login">로그인</a></li>
                       <li><a href="/user/join">회원가입</a></li>
                   </c:if>
                   <c:if test="${sessionScope.loginUser != null}">
                       <li><a href="/user/logout">로그아웃</a></li>
                       <li><a>${sessionScope.loginUser.nm}(${sessionScope.loginUser.nickname})님 환영합니다.</a></li>
                       <li><a>장바구니</a></li>
                       <li><a>마이페이지</a></li>
                   </c:if>
            </ul>
        </div>
            <div>
                <ul class="search">
                    <li><a>인스타그램</a></li>
                    <li><a>카카오톡</a></li>
                    <li class="search"><input type="text"><input type="submit" value="검색"></li>
                </ul>
            </div>
        </div>

        <div class="mainname"><a href="/page/main">def shop</a></div>
        <div class="menu">
            <ul>
                <li><a href="/page/domabam">도마뱀</a></li> <!--카테고리 클릭시 페이지이동-->
                <li><a href="/page/goods">용품</a></li>
                <li><a href="/page/event">이벤트</a></li>
                <li><a>게시판</a></li>
                <li><a>커뮤니티</a></li>
                <li><a>블랙리스트</a></li>
            </ul>
        </div>
    </div>
    <div class="body"><jsp:include page="/WEB-INF/view/${page}.jsp"></jsp:include></div>
    <div class="footer">
        <div>대표전화 : 010-2411-2164</div>
        <div>대표자명 : 조성우</div>
    </div>
</div>

<c:if test="${requestScope.err ne null}">
    <script>
        var body = document.querySelector('body');
        body.onload = function() {
            setTimeout(function() {
                alert('<c:out value="${requestScope.err}"/>');
                window.location = document.referrer;//이전페이지 후 새로고침
            }, 300);
        };
    </script>
</c:if>

</body>
</html>

