<%--
  Created by IntelliJ IDEA.
  User: 221qs
  Date: 2021/2/21
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Test the java ajax</title>
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.3/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcdn.net/ajax/libs/axios/0.21.1/axios.min.js"></script>
      <style>
          #isuser{
              /*color: red;*/
          }
      </style>
  </head>
  <body>
  <div class="container clearfix">

<%--    单纯的ajax请求--%>
    <div class="row clearfix">
        <div class="col-md-12 column">
          <h1>1.Test the ajax</h1>
        </div>
    </div>
    <div class="row clearfix">
      <div class="col-md-12 column">
        <%--一个·form表单--%>
        <form action="" class="form-inline" method="post">
          <div class="input-group col-md-6 column">
            <input type="text" class="form-control" placeholder="请输入参数" id="input">
          </div>
          <div class="input-group col-md-6 column ">
            <input type="submit" class="btn-primary" value="请 求" id="submit" onclick="">
          </div>
        </form>
      </div>
    </div>

<%--    测试获取一个pojolist的值--%>
    <div class="row clearfix">
      <div class="col-md-12 column">
        <br><br>
        <h1>2.getUser</h1>
        <button id="getuserbtn" class="btn-primary">获取全部的user对象</button>
      </div>
    </div>


  <div class="row clearfix">

    <div class="col-md-12 column">
      <table class="table table-hover table-striped">
        <thead>
        <tr>
          <th>姓名</th>
          <th>年龄</th>
          <th>性别</th>
        </tr>
        </thead>
        <tbody id="userdata">
        </tbody>
      </table>
      <br>
      <br>
    </div>
  </div>



    <div class="row clearfix">
      <div class="col-md-12 column">
        <br><br>
        <h1>3.user登录</h1>
      </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-3 column"></div>
        <div class="col-md-6 column">
        <form action="" method="post">

          <div class="form-grop">
              <lable>账号:</lable><span id="isuser"></span>
              <input type="text" id="logininput" class="form-control" name="account" required>
              <br>
          </div>

          <div class="form-grop">
              <lable>密码:</lable>
              <input type="password" id="password"  class="form-control" name="account" >
              <br>
          </div>

          <div class="form-grop"><span id="islogin"></span>
            <input type="submit" id="loginbtn" class="btn-primary" value="登 录">
          </div>

        </form>
      </div>
    </div>


  </div>
  <script>
<%--    获取dom元素--%>
    let input = document.querySelector("#input")
    let submit = document.querySelector("#submit")
    let getuserbtn = document.querySelector("#getuserbtn")
    let userdata = document.querySelector("#userdata")
    let logininput = document.querySelector("#logininput")
    let loginbtn = document.querySelector("#loginbtn")
    let isuser = document.querySelector("#isuser")
    let islogin = document.querySelector("#islogin")
    let password = document.querySelector("#password")


    //绑定事件
    submit.onclick=function (event) {
      event.preventDefault()
      let value = input.value
      //发送请求
      axios.post('/a/'+value)
      .then(function (response) {
          console.log(response.data);
          alert(response.data)
      })
      .catch(function (error) {
          console.log(error);
      });
    }

    //绑定事件
    getuserbtn.onclick=function () {
      axios.post('/getUsers')
      .then(function (response) {
          console.log(response.data)
          let html = ""
        response.data.map((value)=>{
          html +='<tr><td>'+value.name+'</td><td>'+value.age+'</td><td>'+value.sex+'</td></tr>'
        })
        userdata.innerHTML = html
      })
      .catch(function (error) {
        console.log(error)
      })
    }

    //绑定鼠标移出事件函数
    logininput.onblur=function(){
        axios.post('/isuser/'+logininput.value)
        .then(function (response) {
            if(response.data){
                isuser.innerHTML = "该用户可用"
                isuser.style.color = "green"
            }else{
                isuser.innerHTML = "该用户未注册"
                isuser.style.color = "red"
            }
        })
        .catch(function (error) {
            console.log(error)
        })
    }

    //绑定点击登录的事件函数
    loginbtn.onclick=function (event) {
        event.preventDefault()
        axios.post("/login/"+logininput.value+"/"+password.value)
        .then(function (response) {
            alert(response.data)
        })
        .catch(function (error) {
            console.log(error)
        })
    }

  </script>
  </body>
</html>
