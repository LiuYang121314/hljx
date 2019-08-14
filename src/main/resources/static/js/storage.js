$(function () {
    $("input[readonly]").css("background-color", "rgb(233, 236, 239)")

    var messageHide = true;
    $(".nextClick").click(function () {
        $(".messTwo").hide();
        $(".message").show();
        messageHide = false;
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
    $(".banzu").change(function () {
        var banzu = ($(this).val());
        if (banzu == "") {
            if ($('.banzutips').text() == "") {
                $('.banzutips').text('*');
            }
        } else {
            $(".banzutips").empty();
        }
    });
    /* $('select[name="banzu"]').bind("select propertychange",function(event){
         if($('select[name="banzu"]').val()==""){
             if($('.banzutips').text() == ""){
                 $('.banzutips').text('*');
             }
         }else{
             $(".banzutips").empty();
         }
     });*/
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


    /*//监控变化，获取物料
        $('.aa').bind('input propertychange', function(){
         if($(".aa").val().length<5){
             return false;
         }else{
             var code = $(".select2-search__field").val();
            $.ajax({
                url: "/item/icitems"
                , type: "POST"
                ,data:{"fNumber": code}
                , success: function (data) {
                }
                , error: function (msg) {
                    console.info("获取物料代码失败");
                    console.info(msg);
                }
            });
         }
     });*/

    //获取当前用户
    $.ajax({
        url: "/session"
        , type: "POST"
        , async: false
        , data: {"parameName": "user"}
        , success: function (data) {
            $("input[name='username']").val(data.fname);
            $("input[name='fBiller']").val(data.fuserID);
        }
        , error: function () {
            console.info("error");
        }
    });
    //获取班组
    $.ajax({
        url:"/item/item3001"
        ,type:"POST"
        ,async:false
        ,success:function(data){
            $(".banzu").empty();
            $(".banzu").append("<option value='-1'>请选择班组</option>");
            $.each(data,function(i,v){
                var text = "<option value='"+v.fitemID+"'>"+v.fname+"</option>"
                $(".banzu").append(text);
            });
        }
        ,error:function(mes){
            console.info("获取班组失败");
            console.info(mes);
        }
    });
    //获取包装方式
    $.ajax({
        url:"/item/packageType"
        , type: "POST"
        ,async:false
        , success: function (data) {
            $(".packway").empty();
            $(".packway").append("<option value='-1'>请选择包装方式</option>");
            $.each(data,function(i,v){
                var text = "<option value='"+v.fid+"'>"+v.fname+"</option>";
                $(".packway").append(text);
            });
        }
        ,error : function(msg){
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
            $.each(data,function(i,v){
                v = $.parseJSON(v)
                // groupIDArr.push(v.fspGroupID);
                var text = "<option value='"+v.fItemID+"'>"+v.fName+"</option>";
                $(".stock").append(text);
            });
        }
        ,error:function(msg){
            console.info("获取仓库失败");
            console.info(msg);
        }
    });

    $(".stock").change(function(e) {
        var optionVal = $(".stock").val();
        if (optionVal == -1) {
        } else {

            // var groupId = optionVal.split('|')[1];
            var stockID = optionVal;
            $.ajax({
                url: "/stock/getPlace"
                , type: "POST"
                , data: {"stockID": stockID}
                , success: function (data) {
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
        /* $('.banzu').select2('val', "");*/
        $('.banzu').select2('data', null);
        /*$(".banzu").empty();*/
        $('select option').remove()
        $(".message input").val("");
        $(".bangType").empty();
    })
});