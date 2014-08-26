<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add</title>
</head>

<body>
     <h1>Dodaj osobę</h1>

     <form:form action="save" commandName="person" method="POST">
         <form:input path="name"/>
         <form:errors path="name"> To pole jest wymagane </form:errors><br/>

         <form:input path="surname"/>
         <form:errors path="surname"> To pole jest wymagane </form:errors> <br/>

         <form:input path="email"/>
         <form:errors path="email"> To pole jest wymagane </form:errors><br/>

         <form:input path="discount"/>
         <form:errors path="discount">To pole jest wymagane </form:errors> <br/>

         <form:select items="${teams}" path="team.id" itemValue="id" itemLabel="name"/>

         <form:button>Zapisz</form:button>
     </form:form>
</body>

</html>
