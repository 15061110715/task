<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 包子
  Date: 2017/10/2
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="from-group">
    <h1>欢迎注册</h1>
    <hr/>
    <form:form action="/addInto" method="post" commandName="student" reole="form">
    <div class="form-group">
        <label for="name">姓名:</label>
        <input type="text" id="name" name="name" placeholder="请输入姓名"/>
    </div>
    <div class="form-group">
        <label for="qq">qq :</label>
        <input type="text" id="qq" name="qq" placeholder="请输入QQ号" />
    </div>
    <div class="form-group">
        <label for="type">type :</label>
        <input type="text" id="type" name="type" placeholder="请输入修真类型" />
    </div>
    <div class="form-group">
    <label for="time">time</label>
    <input type="text" id="time" name="time" placeholder="请输入入学时间" />
</div>
    <div class="form-group">
        <label for="graduate">graduate :</label>
        <input type="text" id="graduate" name="graduate" placeholder="请输入毕业院校" />
    </div>
    <div class="form-group">
        <label for="number">number</label>
        <input type="text" id="number" name="number" placeholder="请输入学号" />
    </div>
    <div class="form-group">
        <label for="dailyreport">dailyreport</label>
        <input type="text" id="dailyreport" name="dailyreport" placeholder="请输入日报链接" />
    </div>
    <div class="form-group">
        <label for="promise">promise:</label>
        <input type="text" id="promise" name="promise" placeholder="请输入立愿" />
    </div>
    <div class="form-group">
        <label for="teacher">teacher</label>
        <input type="text" id="teacher" name="teacher" placeholder="请输入时间" />
    </div>
    <div class="form-group">
        <label for="where_">where_</label>
        <input type="text" id="where_" name="where_" placeholder="请输入来源" />
    </div>
    <div class="form-group">
        <button type="submit" class="btn btn-sm btn-success">增加</button>
    </div>
    <%--提交按钮，这个必须在form里面，如果像下面一样的话在就只会执行分类名称来传入数据--%>
    <%--<form method="post" action="/addInto">--%>
        <%--分类名称： <input name="name" value="" type="text"> <br><br>--%>
        <%--<input type="submit" value="增加">--%>
    <%--</form>--%>
    </form:form>

</body>
</html>


