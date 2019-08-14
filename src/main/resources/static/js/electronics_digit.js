var setNumber = function (digit, number) {
    var segments = digit.querySelectorAll('.segment');
    var current = parseInt(digit.getAttribute('data-value'));
    if (!isNaN(current) && current != number) {
        digitSegments[current].forEach(function (digitSegment, index) {
            segments[digitSegment - 1].classList.remove('on');
        });
    }
    if (isNaN(current) || current != number) {
        setTimeout(function () {
            digitSegments[number].forEach(function (digitSegment, index) {
                segments[digitSegment - 1].classList.add('on');
            });
        }, 250);
        digit.setAttribute('data-value', number);
    }
}
var digitSegments = [[1, 2, 3, 4, 5, 6], [2, 3], [1, 2, 7, 5, 4], [1, 2, 7, 3, 4], [6, 7, 2, 3], [1, 6, 7, 3, 4], [1, 6, 5, 4, 3, 7], [1, 2, 3], [1, 2, 3, 4, 5, 6, 7], [1, 2, 7, 3, 6]]
var _hours = document.querySelectorAll('.hours');
var _minutes = document.querySelectorAll('.minutes');
var _seconds = document.querySelectorAll('.seconds');

/*setInterval(function () {
var date = new Date();
var hours = date.getHours(),
minutes = date.getMinutes(),
seconds = date.getSeconds();
setNumber(_hours[0], Math.floor(hours / 10));
setNumber(_hours[1], hours % 10);
setNumber(_minutes[0], Math.floor(minutes / 10));
setNumber(_minutes[1], minutes % 10);
setNumber(_seconds[0], Math.floor(seconds / 10));
setNumber(_seconds[1], seconds % 10);
},1000);*/

$.fn.digit = function (number) {
    //判断字符串是否为数字//判断正整数/[1−9]+[0−9]∗]∗/;//判断字符串是否为数字//判断正整数/[1−9]+[0−9]∗]∗/ 
    //验证数字
    if (1 != 1) {
        console.err("请输入数字");
    } else {
        //输入数字的长度
        var numberLen = number.toString().length;
        //整数长度
        var zhengLen = Math.floor(number).toString().length;
        //小数位数
        var xiaoLen = numberLen - zhengLen - 1;
        for (i = 0; i < numberLen; i++) {
            if (i == zhengLen) {
                $(this).append('<div class="separator"></div>');
            } else {
                var element = '<div class="digit no' + i + '">'
                    + '<div class="segment heng"></div>'
                    + '<div class="segment shu"></div>'
                    + '		<div class="segment shu"></div>'
                    + '		<div class="segment heng"></div>'
                    + '		<div class="segment shu"></div>'
                    + '		<div class="segment shu"></div>'
                    + '		<div class="segment heng"></div>'
                    + '	</div>';
                $(this).append(element);
                var tempNum;
                if (i < zhengLen) {
                    var yuNum = Math.pow(10, numberLen - 1 - xiaoLen - i);
                    var chuNum = yuNum / 10;
                    //先取余数，为了把上一个单位过滤掉
                    tempNum = number % yuNum / chuNum;
                } else {
                    tempNum = number * Math.pow(10, i - zhengLen) % 10;
                }
                tempNum = Math.floor(tempNum);
                setNumber($(".no" + i + "")[0], tempNum);
            }
        }
    }
}