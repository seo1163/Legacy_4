//ID, PW, EMAIL, PHONE

const id =document.getElementById('id');
const idResult=document.getElementById('idResult')
const pw = document.getElementById('pw');
const pwResult = document.getElementById('pwResult');
const pw2 = document.getElementById('pw2');
const pwResult2 = document.getElementById('pwResult2');
const name = document.getElementById('name');
const phone = document.getElementById('phone');
const email = document.getElementById('email');
const btn =document.getElementById('btn');
const frm = document.getElementById('frm');

//-------------검증이 끝난 pw를 수정할 경우------
pw.addEventListener('change', function(){
    pwCheck=false;
    pw2.value='';
    pwResult2.innerHTML='';
    pw2.focus();
});

//--------------pw 와 pw2가 같은지-------------
let pwCheck=true; //같지 않을 때 true, 같으면 false
pw2.addEventListener('blur', function(){
   
    let message ="PW가 일치 합니다";
    if(pw.value != pw2.value){
        pwCheck = true;;
        message = "PW가 일치하지 않습니다";
        pw2.value='';
       
    }else{
        pwCheck=false;
    }

    pwResult2.innerHTML=message;
});

//---------------pw 길이검증-------------------------
pw.addEventListener('blur',function(){
    if(pw.value.length<8 || pw.length>12){
        pwResult.innerHTML='PW 글자수가 맞지 않습니다.'
       
    }
});

//---------------ID 입력 후-------------------
id.addEventListener('blur',function(){
    if(id.value==''){
        idResult.innerHTML='ID를 입력하세요';
        
    }
});

//--------------- 가입 버튼 -------------------
btn.addEventListener("click", function(){
    if(id.value==''){
        alert('ID를 입력해 주세요');
        id.focus();
        return;
    }

    if(pw.value=='' || pw.value.length<8 || pw.value.length>12){
        alert('PW를 정확히 입력해 주세요')
        pw.focus();
        return;
    }

    if(pwCheck){
        alert('PW가 일치하지 않습니다')
        pw2.focus();
        return;
    }

    if(name.value==''){
        alert('이름을 입력해 주세요')
        name.focus();
        return;
    }

    if(phone.value==''){
        alert('전화번호를 입력하세요')
        phone.focus();
        return;
    }

    if(email.value==''){
        alert('이메일을 입력하세요')
        email.focus();
        return;
    }

    frm.submit();

});

