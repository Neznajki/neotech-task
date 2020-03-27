$(() => {
    $("#phone").keypress(function(event){
        var keycode = (event.keyCode ? event.keyCode : event.which);
        if(keycode == '13'){
            submitPhone();
        }
    });
    $("#submit").on("click", submitPhone);
});

function submitPhone() {
    $("#error").html("");
    $("#warning").html("");
    $("#success").html("");
    let phone = $("#phone").val();

    if (! phone) {
        $("#error").html("please enter phone value");
        return;
    }

    if (! phone.match(/^\+/)) {
        $("#error").html("please add + in beginning of the phone");
        return;
    }

    $.ajax({
        type: "GET",
        url: "/rest/json/check/phone",
        data: {phone: phone}, // serializes the form's elements.
        dataType: "json",
        success: function(data)
        {
            if (data.exceptionMessage) {
                $("#error").html(data.exceptionMessage);

                return;
            }

            let result = data.result;
            if (result.type == 'country') {
                $("#success").text("country code :" + result.code + ', phone code :' + result.matchedPhoneCode);
            } else {
                $("#warning").text("commentary :" + result.commentContent + ', phone code :' + result.matchedPhoneCode);
            }

            console.info(data); // show response from the php script.
        }
    });
}