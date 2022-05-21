
function objectifyForm(formArray) {
    //serialize data function
    let returnArray = {};
    for (let i = 0; i < formArray.length; i++){
        returnArray[formArray[i]['name']] = formArray[i]['value'];
    }
    return returnArray;
}

function join() {
    let url = '/user/join';
    let type = 'POST';
    let val = $("form").serializeArray();
    let param = objectifyForm(val);
    // console.log('param : ', param);
    $.ajax({
        data : JSON.stringify(param),
        type : type,
        url : url,
        dataType:"json",
        contentType: "application/json",
        success : function(res) {
            if(res.success()) {
                alert('회원가입성공!');
            }
        }
    });
    location.href = '/board/main';
}