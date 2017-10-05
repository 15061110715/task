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

        <form method="post" action="updateCategory">
            分类名称： <input name="name" value="${c.name}" type="text"> <br><br>
            <input type="hidden" value="${c.id}" name="id">
            <input type="submit" value="增加分类">
        </form>

    </div>
</div>
