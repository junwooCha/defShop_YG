let whereIdFrmElem = document.querySelector('#whereIdFrm');
let forgot_idElem = document.querySelector('.forgot_id');
let closeElem = document.querySelector('.close')


forgot_idElem.addEventListener('click',function(){
    let whereId = document.getElementById('whereId');
    whereId.style.display = 'block';
})

closeElem.addEventListener('click',function(){
    let whereId = document.getElementById('whereId');
    whereId.style.display = 'none';
})

if (whereIdFrmElem){
    let whereIdSmtElem = whereIdFrmElem.querySelector('input[type=submit]');
    whereIdSmtElem.addEventListener('click', function (e){
        e.preventDefault();

        if (whereIdFrmElem.nm.value.length === 0 || whereIdFrmElem.phone.value.length === 0){
            alert('이름 또는 번호를 적어주십시오.')
            return;
        }

        var param = {
            nm : whereIdFrmElem.nm.value,
            phone : whereIdFrmElem.phone.value
        };
        let url = '/user/where?proc=id';

        fetch(url, {
            method : 'post',
            headers : {'Content-type' : 'application/json'},
            body : JSON.stringify(param)
        }).then(function (res){
            return res.json();
        }).then(function (data){
            switch (data.result){
                case 0:
                    alert('잘못된 정보입니다.');
                    break;
                case 1:
                    whereIdFrmElem = '';
                    break;
            }
        }).catch(function (err){
            console.log(err);
            alert('잘못된 정보입니다.');
        });
    });
}

