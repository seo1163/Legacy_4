const fileResult = document.getElementById("fileResult");
const fileAdd = document.getElementById("fileAdd");
const del = document.getElementsByClassName("del");

let count=0;
let num=0; //id용도

fileAdd.addEventListener("click", function(){
    
    // //1번째 첨부파일 5개에서 삭제하고 다시 추가해도 최대 5개만 가능하게 하는 법
    // if(count>4){
    //     alert('첨부파일은 최대 5개만 가능합니다.');
    //     return ; 
    // }
    // //count=count+1;
    // count++;


    //2번째
    //count=count+1;
    // count++;

    // if(count>5){
    //     alert('첨부파일은 최대 5개만 가능합니다.');
    //     count--;
    //     return ; 
    // }

    //3번째
    count++;
    if(count>5){
        alert('첨부파일은 최대 5개만 가능합니다.');
        count=5;
        return ; 
    }

    let div= document.createElement('div');  //<div></div>
    div.setAttribute("id", "del"+num);
 

    let file =document.createElement("input");
    file.setAttribute("type", "file");
    file.setAttribute("name", "files");

    let button = document.createElement('button'); //<button></button>
    button.setAttribute("type", "button");
    button.className="del";
    button.setAttribute("data-num", "del"+num);
    button.innerHTML="DEL";

    div.append(file);
    div.append(button);

    fileResult.append(div);

    num++;
});

fileResult.addEventListener("click", function(event){
    let cn = event.target;
    
    

    if(cn.classList.contains('del')){
       let delNum = cn.getAttribute("data-num");
       document.getElementById(delNum).remove();
       count--;
    }
});