$(function () {
    var cookArr = document.cookie.split(";");
    $('.wuliao').select2({
        minimumInputLength: 5,
    });
    $("input[name='pwd']").focus(function () {
        $.each(cookArr, function (i, v) {
            var arr = v.split("=");
            if (arr[0] == $("input[name='fName']").val()) {
                $("input[name='pwd']").val(arr[1]);
                return false;
            }
        });
    });
    $.ajax({
        url: "/getaccs"
        , type: "POST"
        , success: function (data) {
            $(".zhangtao").empty();
            var text = '<option value="-1" >请选择账套</option>';
            $(".zhangtao").append(text);
            $.each(data, function (i, v) {
                var text = '<option value="' + v.facctID + '" >' + v.facctNumber + '|' + v.facctName + '</option>';
                $(".zhangtao").append(text);
            });
        }
        , error: function (msg) {
            console.info(msg);
        }
    });
    $('input[name="fName"]').bind("input propertychange", function (event) {
        if ($('input[name="fName"]').val() == "") {
            if ($('.fNameTips').text() == "") {
                $('.fNameTips').text('*');
            }
        } else {
            $(".fNameTips").empty();
        }
    });
    $('input[name="pwd"]').bind("input propertychange", function (event) {
        if ($('input[name="pwd"]').val() == "") {
            if ($('.pwdTips').text() == "") {
                $('.pwdTips').text('*');
            }
        } else {
            $(".pwdTips").empty();
        }
    });
    $(".load").click(function () {
        load();
    });
    //回车事件
    $(".infor").keyup(function (event) {
        if (event.keyCode == 13) {
            load();
        }
    });

    function load() {
        var zhang = $("select[name='fAcctID']").val();
        if (zhang == -1) {
            $(".divTipsZh").css("display", "");
            return false;
        }
        var fName = $('input[name="fName"]').val();
        if (fName == "") {
            $(".divTipsName").css("display", "");
            return false;
        }
        var pwd = $('input[name="pwd"]').val();
        if (pwd == "") {
            $(".divTipsPwd").css("display", "");
        }
        $.ajax({
            url: "/load"
            , type: "POST"
            , data: $(".infor").serialize()
            , success: function (data) {
                data = $.parseJSON(data).data;
                if (data.success) {
                    location.href = "/index";
                } else {
                    $(".errMsg").css("display", "none");
                    $(".tipsDiv").css("display", "none");
                    $(".tipsSpan").empty();
                    $("tipsSpan").append("*");
                    $(".errMsg").css("display", "");
                }
            }
            , error: function (msg) {
                console.info("获取账套信息失败");
                console.info(msg);
            }
        });

    }
});