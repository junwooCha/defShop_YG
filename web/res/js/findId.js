let forgot_pw = document.querySelector('.forgot_pw')
let close = document.querySelector('.close')
let save = document.querySelector('.save')


forgot_pw.addEventListener('click',function(){
    let wherePw = document.getElementById('wherePw');
    wherePw.style.display = 'block';
})

close.addEventListener('click',function(){
    let wherePw = document.getElementById('wherePw');
    wherePw.style.display = 'none';
})

save.addEventListener('click',function(){
    let wherePw = document.getElementById('wherePw');
    wherePw.style.display = 'none';
})

function findPw(){

}