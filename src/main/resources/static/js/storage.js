$(function () {
    $("input[readonly]").css("background-color", "rgb(233, 236, 239)")
    //<!-- 打印 -->
    var panduan=true;
    $(".print").click(function (event) {
        if(panduan==false){
            $(".main").printThis({
                debug: false,
                importCSS: true,
                importStyle: true,
                printContainer: true,
                pageTitle: "商标打印",
                removeInline: false,
                printDelay: 333,
                header: null,
                formValues: false
            });
        }else{
            alert("请先保存！")
        }
    });
    <!--自动生成二维码-->
    $(document).ready(function () {
        //实例化
        var qrcode = new QRCode(
            //二维码存放的div
            document.getElementsByClassName("ewm")[0], {
                width: 125, //设置宽高
                height: 120
            });
        //根据input框的值生成二维码
        qrcode.makeCode(document.getElementsByClassName("wldm")[0].textContent);
    });
    //切换页面
    var messageHide = true;
    $(".nextClick").click(function () {
        console.log($(".banzu").trigger("change").val())
        if ($(".banzu").trigger("change").val() == (-1)) {
            $(".warning").html("班组属性不能为空！")
            return false;
        } else if ($(".packway").trigger("change").val() == (-1)) {
            $(".warning").html("包装方式属性不能为空！")
            return false;
        } else if ($(".stock").trigger("change").val() == (-1)) {
            $(".warning").html("入库仓库属性不能为空！")
            return false;
        } else if ($(".stockPla").trigger("change").val() == (-1)) {
            $(".warning").html("入库仓位属性不能为空！")
            return false;
        } else {
            $(".warning").html("");
            $(".messTwo").hide();
            $(".message").show();
            messageHide = false;
        }
    });
    $(".return").click(function () {
        if (messageHide) {
            location.href = "/index";
        } else {
            $(".messTwo").show();
            $(".message").hide();
            messageHide = true;
        }
    });

    //获取过磅类型
    $.ajax({
        url: "submsg/measureInType",
        type: "POST",
        success: function (data) {
            $(".bangType").empty();
            $(".bangType").append("<option value='-1'>请选择过磅类型</option>");
            $.each(data, function (i, v) {
                var text = "<option value='" + v.fInterID + "'>" + v.fName + "</option>"
                $(".bangType").append(text);
            });
        },
        error: function () {
            console.log("error")
        }
    });
    //保存单据
    $(".save").click(function () {
        console.info($(".weigh").serialize());
        var arr = $(".museFill");
        $.each(arr, function (i, v) {
            console.info(v.value);
            if (v.value == "" || v.value == -1) {
                $(".warning").html($(v).prev().find("span").text() + "属性不能为空！");
            } else (
                $.ajax({
                    url: "/tbos/saveWeight"
                    , type: "POST"
                    , data: $(".weigh").serialize()
                    , success: function (data) {
                        data = $.parseJSON(data).data
                        if (data.success) {
                            alert("保存成功");
                            panduan=false;
                        }
                    }
                    , error: function (msg) {
                        console.info(msg);
                    }
                })
            );
        });
    });
    //获取当前用户
    $.ajax({
        url: "/session"
        , type: "POST"
        , async: false
        , data: {"parameName": "user"}
        , success: function (data) {
            console.log(data)
            $("input[name='username']").val(data.fname);
            $("input[name='fBiller']").val(data.fuserID);
        }
        , error: function () {
            console.info("error");
        }
    });
    //获取班组
    $.ajax({
        url: "/item/item3001"
        , type: "POST"
        , async: false
        , success: function (data) {
            $(".banzu").empty();
            $(".banzu").append("<option value='-1'>请选择班组</option>");
            $.each(data, function (i, v) {
                var text = "<option value='" + v.fitemID + "'>" + v.fname + "</option>"
                $(".banzu").append(text);
            });
        }
        , error: function (mes) {
            console.info("获取班组失败");
            console.info(mes);
        }
    });
    //获取包装方式
    $.ajax({
        url: "/item/packageType"
        , type: "POST"
        , async: false
        , success: function (data) {
            $(".packway").empty();
            $(".packway").append("<option value='-1'>请选择包装方式</option>");
            $.each(data, function (i, v) {
                var text = "<option value='" + v.fid + "'>" + v.fname + "</option>";
                $(".packway").append(text);
            });
        }
        , error: function (msg) {
            console.info("获取包装方式失败");
            console.info(msg);
        }
    });
    var groupIDArr = new Array();
    //获取入库仓库
    $.ajax({
        url: "/stock/getStocks"
        , type: "POST"
        , success: function (data) {
            $(".stock").empty();
            $(".stock").append("<option value='-1'>请选择入库仓库</option>");
            $.each(data, function (i, v) {
                v = $.parseJSON(v)
                // groupIDArr.push(v.fspGroupID);
                var text = "<option value='" + v.fItemID + "'>" + v.fName + "</option>";
                $(".stock").append(text);
            });
        }
        , error: function (msg) {
            console.info("获取仓库失败");
            console.info(msg);
        }
    });
    //获取入库仓位
    $(".stock").change(function (e) {
        var optionVal = $(".stock").val();
        if (optionVal == -1) {
        } else {
            var stockID = optionVal;
            $.ajax({
                url: "/stock/getPlace"
                , type: "POST"
                , data: {"stockID": stockID}
                , success: function (data) {
                    console.log(data)
                    $(".stockPla").empty();
                    $(".stockPla").append("<option value='-1'>请选择入库仓位</option>");
                    $.each(data, function (i, v) {
                        v = $.parseJSON(v);
                        var text = "<option value='" + v.fspID + "'>" + v.fName + "</option>";
                        $(".stockPla").append(text);
                    });
                }
                , error: function (msg) {
                    console.info("获取库位失败");
                    console.info(msg);
                }
            });
        }
    });
    //新增
    $(".new").click(function () {
        /*$('.select2').select2("val", "");*/
       /* $('.select2').select2('val','all');*/
        $('.select2').val(-1).trigger("change");
        console.log($(".banzu").val())
       /* $('.select2').select2().select2('val', $('#seclectID option:eq(0)').val());*/
        $(".message input").val("");
        //(".bangType").empty();
    })
});