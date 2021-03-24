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
