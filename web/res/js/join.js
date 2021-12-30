
function joinChk() {
    var joinfrm = document.querySelector('#joinfrm');

    if (joinfrm.uid.value.length < 8 || joinfrm.uid.value.length > 20){
        if (joinfrm.uid.value.length == 0){
            alert('아이디를 입력 하십시오.')
            return false;
        }
        alert('아이디를 8자리에서 20자 이내로 입력 하십시오.')
        return false;
    } else if (joinfrm.upw.value.length < 8 || joinfrm.upw.value.length > 20){
        if (joinfrm.upw.value.length == 0){
            alert('비밀번호를 입력 하십시오.')
            return false;
        }
        alert('비밀번호를 8자리에서 20자 이내로 입력 하십시오.')
        return false;
    } else if (joinfrm.upw.value.length != joinfrm.reupw.value.length){
        alert('비밀번호가 일치하지 않습니다.')
        return false
    }
}