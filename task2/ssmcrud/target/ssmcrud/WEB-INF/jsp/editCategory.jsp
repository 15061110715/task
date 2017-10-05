<%--
  Created by IntelliJ IDEA.
  User: 包子
  Date: 2017/9/28
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width:500px;margin:0px auto;text-align:center">

    <div style="text-align:center;margin-top:40px">

        <form method="post" action="updateCategory" >
            <div>姓名：<br><input name="name" value="${s.name}" type="text"></div>
            <div>QQ号：<br><input name="qq" value="${s.qq}" type="text"></div>
            <div>修真类型：<br><input name="type" value="${s.type}" type="text"></div>
            <div>时间：<br><input name="time" value="${s.time}" type="text"></div>
            <div>毕业院校：<br><input name="graduate" value="${s.graduate}" type="text"></div>
            <div>学号：<br><input name="number" value="${s.number}" type="text"></div>
            <div>日报：<br><input name="dailyreport" value="${s.dailyreport}" type="text"></div>
            <div>立愿：<br><input name="promise" value="${s.promise}" type="text"></div>
            <div>师兄：<br><input name="teacher" value="${s.teacher}" type="text"></div>
            <div>从何处获取：<br><input name="where" value="${s.where_}" type="text"></div><br><br>
            <input type="hidden" value="${s.id}" name="id">
            <%--隐藏id但是一定要写因为需要根据id修改--%>
            <%--name代表属性名，value代表属性值--%>
            <input type="submit" value="修改">
        </form>
    </div>
</div>
