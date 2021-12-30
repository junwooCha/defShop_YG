function findPw(){
    var findPwfrm = document.querySelector('#findPwfrm');
    let changeUpw = document.getElementById('changeUpw').value;
    let changeUpwConfirm = document.getElementById('changeUpwConfirm').value;

    if (findPwfrm.changeUpw.value.length < 8 || findPwfrm.changeUpw.value.length > 20){
        alert('변경할 패스워드를 8~20자 이내로 입력해주세요')
        location.reload();
        return false;
    }
    if (findPwfrm.changeUpwConfirm.value.length < 8 || findPwfrm.changeUpwConfirm.value.length > 20){
        alert('변경할 패스워드를 8~20자 이내로 입력해주세요')
        location.reload();
        return false;
    }
    if (changeUpw.valueOf() == changeUpwConfirm.valueOf()){//input안 text내용 비교
        alert('비밀번호가 변경되었습니다')
        document.location.href="http://localhost:8090/user/login";
        return true;
    }else{
        alert('비밀번호가 일치하지 않습니다')
        location.reload();
        return false;
    }
}