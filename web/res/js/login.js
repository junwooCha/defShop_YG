let forgot_id = document.querySelector('.forgot_id')
let close = document.querySelector('.close')
let save = document.querySelector('.save')


forgot_id.addEventListener('click',function(){
    let whereId = document.getElementById('whereId');
    whereId.style.display = 'block';
})

close.addEventListener('click',function(){
    let whereId = document.getElementById('whereId');
    whereId.style.display = 'none';
})

save.addEventListener('click',function(){
    let whereId = document.getElementById('whereId');
    whereId.style.display = 'none';
})

