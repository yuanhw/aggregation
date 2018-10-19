<%--
  Created by IntelliJ IDEA.
  User: wangyuanhang
  Date: 2018/9/30
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎！</h1>
<script>
    var count = 0;
    var ws = new WebSocket("ws://echo.websocket.org/echo")
    ws.onopen = function (e) {
        console.log('已连接...')
        setInterval(function () {
            ws.send('发送消息' + (++count))
        }, 2000)
    }
    ws.onclose = function (e) {
        console.log('已关闭...')
    }
    ws.onerror = function (e) {
        console.log('发生错误...')
        console.log(e)
    }
    ws.onmessage = function (e) {
        console.log('接收消息...')
        console.log(e.data)
        //ws.close()
    }
    function sendMessage(msg) {
        ws.send(msg);
    }
</script>
</body>
</html>
