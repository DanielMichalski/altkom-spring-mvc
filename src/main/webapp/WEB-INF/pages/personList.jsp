<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Lista osób</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css"/>
</head>

<body>
     <h1>Lista osób</h1>

     <table border="1">
         <th>ID</th>
         <th>Imię</th>
         <th>Nazwisko</th>
         <th>Mail</th>
         <c:forEach items="${peoples}" var="person">
             <tr>
                 <td><a href="<c:url value="/person/edit"/>?id=${person.id}">${person.id}</a> </td>
                 <td>${person.name}</td>
                 <td>${person.surname}</td>
                 <td>${person.email}</td>
             </tr>
         </c:forEach>
     </table>
</body>

</html>
