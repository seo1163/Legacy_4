/**
 * 
 */

//전역변수
//var
const pw = document.getElementById("pw");
const pwResult = document.getElementById("pwResult");
const pwResult2 = document.getElementById("pwResult2");
const pw2 = document.getElementById("pw2");
const id = document.getElementById("id");
const idResult = document.getElementById("idResult");

const name=document.getElementById("name");
const nameResult=document.getElementById("nameResult");

const phone = document.getElementById("phone");
const phResult = document.getElementById("phResult");

const email = document.getElementById("email");
const emailResult = document.getElementById("emailResult");

const frm = document.getElementById("frm")
const btn = document.getElementById("btn")



let idCheck=false; //check OK : True, check X : False
let pwCheck=false;
let nameCheck=false;
let phoneCheck=false;
let emailCheck=false;



email.addEventListener('blur', function(){
    if(email.value==''){
        emailCheck=false;
    }else{
        emailCheck=true;
    }
});

phone.addEventListener('blur', function(){
    if(phone.value==''){
        phoneCheck=false;
    }else{
        phoneCheck=true;
    }
});

name.addEventListener('blur', function(){
    if(name.value==''){
        nameCheck=false;
    }else{
        nameCheck=true;
    }
});

btn.addEventListener("click", function(){
    
    if(idCheck && pwCheck && nameCheck && phoneCheck && emailCheck){
    frm.submit();
    }else{
        alert('필수 요소를 확인하세요');
    }
});

id.addEventListener("blur", function(){
    
   let v = id.value;
   let message = '';

   if(v.length==0){//v==''
      message="ID를 입력해주세요"
      idCheck=false;
   }else{
       idCheck=true;
   }

   idResult.innerHTML=message;
});

 pw2.addEventListener("blur",function(){
    
    let v1 = pw.value;
    let v2 = pw2.value;
    let message = "일치하지 않습니다."

    if(v1 == v2){
        message = "일치합니다"
        pwCheck=true;
    }else{
        pwCheck=false;
    }

    pwResult2.innerHTML=message;
    
 });  
   
pw.addEventListener("change",function(){
    pwCheck=false;
    pw2.value='';
    pwResult2.innerHTML='';
    pw2.focus();
});

pw.addEventListener("keyup", function(){
    let length = pw.value.length;
    let message='사용할 수 없는 비번';

    if(length>=8 && length <=12){
        message='사용할 수 있습니다'
    }
    pwResult.innerHTML=message;
});

