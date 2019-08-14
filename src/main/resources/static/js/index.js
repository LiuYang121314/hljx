function getDate() {
    var myData = new Date();
    var myTime = myData.getFullYear() + "-" + (myData.getMonth() + 1) + "-"
        + myData.getDate() + " " + myData.getHours() + ":"
        + myData.getMinutes() + ":" + myData.getSeconds();
    $(".gbTime").attr("placeholder", myTime);
}

$(function () {
    /* 过磅时间 */
    getDate();

    var stockPlace = new Array();
    var items = new Map();
    /* 打印按钮 */
    $(".printBtn").click(function () {
        $('.twoweicode').qrcode($(".wuliao option:selected").text());
        var c = $(".twoweicode canvas")[0];
        var image = new Image();
        image.src = c.toDataURL("image/png");
        $(".twoweicode canvas").replaceWith(image);
        $(".twoweicode img").css("width", "175px").css("margin", "5px");
        $("#print").jqprint();
    });

//	新增按钮
    $(".newBill").click(function () {
        getDate();
        $(".select2 option").attr("selected", false);
        $(".select2 option[value='-1']").attr("selected", true);
        var opts = $(".select2 option[value='-1']");
        $(".select2 + span .select2-selection__rendered").empty();
        var arr = $(".select2 option[value='-1']");
        var spanArr = $(".select2 + span .select2-selection__rendered");
        console.info(arr);
        $.each(arr, function (i, v) {
            spanArr[i].innerHTML = v.innerHTML;
        });

    });

    //初始化下拉框
    $('.select2:not(.wuliao)').select2();
    $('.wuliao').select2({
        minimumInputLength: 5,
    });
    //移除一些select2里的样式
    $(".select2-container").css("flex", "auto");
    $(".select2-container--default .select2-selection--multiple").css("border-top-left-radius", "0").css("border-bottom-left-radius", "0");
    $(".select2-container--default .select2-selection--single").css("display", "block").css("height", "100%")
        .css("border-top-left-radius", "0").css("border-bottom-left-radius", "0");
    $(".select2-selection__arrow").remove();

    $(".wuliao").on("select2:select", function (e) {
        var text = e.params.data.text.split("|");
        $(".FName").val(text[1]);
        $(".FNameSpan").text(text[1]);
        $(".wuliaoNumber").text(text[0]);
        $(".FModel").val(items.get(text[0]).fModel);
        $(".FModelSpan").text(items.get(text[0]).fModel);
    });
    $(".select2").on("select2:select", function (e) {
        $(this).remove($("option[value='-1']"));
        console.info();
    });
    $(".stock").on("select2:select", function (e) {
        var id = e.params.data.id;
        $(".stockPla").empty();
        if (id == '-1') {
            $(".stockPla+span .select2-selection__rendered").text('').attr("title", "");
        } else {
            var text = id.split('|');
            $.each(stockPlace, function (i, v) {
                var text = "<option value='" + v.fspid + "' >" + v.ffullName + "</option>"
                $(".stockPla").append(text);
            });
        }
    });


    /* 获取数据 */
    $.ajax({//过磅类型
        url: "/submsg/getGuoBangType",
        type: "POST",
        success: function (data) {
            $(".bangType").empty();
            $(".bangType").append("<option value='-1'>请选择过磅类型</option>");
            $.each(data, function (i, v) {
                $(".bangType").append(
                    '<option value=' + v.FInterID + ' >' + v.fid
                    + ' | ' + v.fname + '</option>');
            });
        },
        error: function (msg) {
            console.info("error");
            console.info(msg);
        }
    });

    $.ajax({//班组
        url: "/submsg/getGroups"
        , type: "POST"
        , success: function (data) {
            $(".banzu").empty();
            $(".banzu").append("<option value='-1'>请选择班组</option>");
            $.each(data, function (i, v) {
                var text = "<option value='" + v.fItemID + "'>" + v.fName + "</option>";
            });
        }
        , error: function (msg) {
            console.info(msg);
        }
    });

    $.ajax({//仓库
        url: "/stock/allstock"
        , type: "POST"
        , success: function (data) {
            $(".stock").empty();
            $(".stock").append("<option value='-1'>请选择入库仓库</option>");
            $.each(data, function (i, v) {
                var text = "<option value='" + v.fitemID + "|" + v.fspgroupID + "' >" + v.fname + "</option>"
                $(".stock").append(text);
            });
        }
        , error: function (msg) {
            console.info(msg);
        }
    });

    $.ajax({//仓位
        url: "/stock/allplace"
        , type: "POST"
        , success: function (data) {
            stockPlace = data;
        }
        , error: function (msg) {
            console.info(msg);
        }
    });


    $.ajax({
        url: "/submsg/getWays"
        , type: "POST"
        , success: function (data) {
            $(".packway").empty();
            $(".packway").append("<option value='-1'>请选择包装方式</option>");
            $.each(data, function (i, v) {
                var text = "<option value='" + v.fID + "' >" + v.fName + "</option>";
                $(".packway").append(text);
            });
        }
        , error: function (msg) {
            console.info(msg);
        }
    });

    $.ajax({//物料
        url: "/item/getAllWuLiao",
        type: "POSE"
        , async: false
        , success: function (data) {
            $(".wuliao").empty();
            $(".wuliao").append('<option value="-1" >请输入物料代码</option>');
            $.each(data, function (i, v) {
                items.set(v.fnumber, v);
                var text = v.fnumber + '|' + v.fname + '|' + v.fModel;
                $(".wuliao").append('<option value=' + v.fnumber + ' >' + text + '</option>');
            });
        },
        error: function (msg) {
            console.info("error");
            console.info(msg);
        }
    });

    $(".quitBtn").click(function () {
        location.href = "";
    });
});