/**
 * 
 */
const checkAll = document.getElementById('checkAll');
const check = document.getElementsByClassName('check');
const btn = document.getElementById("btn");

checkAll.addEventListener('click', function(){
    
    for(c of check){
        c.checked = checkAll.checked;
    }

});


for(ch of check){
    ch.addEventListener("click", function(){
        let last=true;
        for(c of check){
            if(!c.checked){
                last = false;
            }
        }

        checkAll.chcked=last;
        

    });
}

btn.addEventListener("click", function(){

    // let c =true;
    // for(ch of check){
    //     if(!ch.checked){
    //         c = false;
    //     }
    // if(c){
//     location.href="./join";
// }else{
//     alert("약관의 동의하세요")
// } }  2번

    //check[0].checked && check[1].checked && check[2].checked && check[3].checked 1번
    
    if(checkAll.checked){
    location.href="./join";
    }else{
        alert("약관의 동의하세요")
    }
});