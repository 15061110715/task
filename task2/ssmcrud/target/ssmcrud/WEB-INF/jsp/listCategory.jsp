<%--
  Created by IntelliJ IDEA.
  User: 包子
  Date: 2017/9/28
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div style="width:500px;margin:0px auto;text-align:center">
    <table align='center' border='1' cellspacing='0' width='100%'>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>qq</td>
            <td>type</td>
            <td>time</td>
            <td>graduate</td>
            <td>number</td>
            <td>dailyreport</td>
            <td>promise</td>
            <td>teacher</td>
            <td>where_</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${cs}" var="s" varStatus="st">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.qq}</td>
                <td>${s.type}</td>
                <td>${s.time}</td>
                <td>${s.graduate}</td>
                <td>${s.number}</td>
                <td>${s.dailyreport}</td>
                <td>${s.promise}</td>
                <td>${s.teacher}</td>
                <td>${s.where_}</td>
                <td><a href="editCategory?id=${s.id}">编辑</a></td>
                <td><a href="deleteCategory?id=${s.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align:center">
        <a href="?start=0">首  页</a>
        <a href="?start=${page.start-page.count}">上一页</a>
        <a href="?start=${page.start+page.count}">下一页</a>
        <a href="?start=${page.last}">末  页</a>
    </div>


    <div style="text-align:center;margin-top:40px">

        <form method="get" action="addone">
            <input type="submit" value="增加">
        </form>
    </div>
</div>