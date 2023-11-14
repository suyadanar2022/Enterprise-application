<%--
  Created by IntelliJ IDEA.
  User: rabinsenchuro
  Date: 24/01/2022
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>${msg} Book</title>
</head>
<body>
<c:if test="${msg == 'Update'}">
    <form:form modelAttribute="book" action="../books/${book.id}" method="post">
        <form:errors path="*" cssClass="errorblock" element="div"/>
        <table>
            <tr>
                <td>Title:</td>
                <td><input type="text" name="title" value="${book.title}"/></td>
            </tr>
            <tr>
                <td>ISBN:</td>
                <td><input type="text" name="isbn" value="${book.isbn}"/></td>
            </tr>
            <tr>
                <td>Author:</td>
                <td><input type="text" name="author" value="${book.author}"/></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" value="${book.price}"/></td>
            </tr>
        </table>
        <input type="submit" value="${msg}"/>
    </form:form>
</c:if>
<c:if test="${msg == 'Add'}">
    <form:form modelAttribute="book" action="../books" method="post">

    <form:errors path="*" cssClass="errorblock" element="div"/>
        <table>
            <tr>
                <td>Title:</td>
                <td><input type="text" name="title" value="${book.title}"/></td>
            </tr>
            <tr>
                <td>ISBN:</td>
                <td><input type="text" name="isbn" value="${book.isbn}"/></td>
            </tr>
            <tr>
                <td>Author:</td>
                <td><input type="text" name="author" value="${book.author}"/></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" value="${book.price}"/></td>
            </tr>
        </table>
        <input type="submit" value="${msg}"/>
    </form:form>
</c:if>

<%--<c:if test="${msg == 'Update'}">
<form action="delete?carId=${car.id}" method="post">
    <button type="submit">Delete</button>
</form>
</c:if>--%>
</body>
</html>
