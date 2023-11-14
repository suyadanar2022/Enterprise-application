<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: rabinsenchuro
  Date: 24/01/2022
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books List</title>
</head>
<body>
    <div>
        <h1>List of Books</h1>
        <table>
            <tr>
               <th>Title</th>
                <th>ISBN</th>
                <th>Author</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.title}</td>
                    <td>${book.isbn}</td>
                    <td>${book.author}</td>
                    <td>${book.price}</td>
                    <sec:authorize access="hasRole('ADMIN')">
                        <td><a href="books/${book.id}">edit</a></td>
                    </sec:authorize>
                    <td>
                        <form action="books/delete/${book.id}" method="post">
                            <button type="submit">Delete</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
       <sec:authorize access="hasRole('ADMIN')">
           <a href="books/add"> Add a Book</a>
       </sec:authorize>
        <a href="logout">Logout</a>
    </div>

</body>
</html>
