<%--
  Created by IntelliJ IDEA.
  User: 221qs
  Date: 2021/2/9
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>收集信息</title>
  </head>
  <body>

  <form action="/getinfo">
    姓名：<input type="text" name="name"><br/>
    性别：<input type="text" name="sex"><br/>
    爱好：<input type="text" name="hobby"><br/>
    <input type="submit" value="提交">
  </form>

  </body>
</html>
