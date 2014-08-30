<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <title>Add</title>
</head>

<body>
<h1>Dodaj osobę</h1>

<form:form action="save" commandName="person" method="POST">
    <table>
        <tr>
            <td><form:label path="name"><spring:message code="page.add.name"/></form:label></td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name" cssClass="required"><spring:message code="page.add.name.required"/></form:errors></td>
        </tr>
        <tr>
            <td><form:label path="surname"><spring:message code="page.add.surname"/></form:label></td>
            <td><form:input path="surname"/>
            <td><form:errors path="surname" cssClass="required"><spring:message code="page.add.surname.required"/></form:errors></td>
        </tr>
        <tr>
            <td><form:label path="email"><spring:message code="page.add.email"/></form:label></td>
            <td><form:input path="email"/>
            <td><form:errors path="email" cssClass="required"><spring:message code="page.add.email.required"/></form:errors></td>
        </tr>
        <tr>
            <td><form:label path="discount"><spring:message code="page.add.discount"/></form:label></td>
            <td><form:input path="discount"/>
            <td><form:errors path="discount" cssClass="required"><spring:message code="page.add.discount.required"/></form:errors></td>
        </tr>
        <tr>
            <td><form:label path="team.id"><spring:message code="page.add.team"/></form:label></td>
            <td><form:select items="${teams}" path="team.id" itemValue="id" itemLabel="name"/></td>
        </tr>
        <tr>
            <td><form:button><spring:message code="page.add.submit"/></form:button></td>
        </tr>
    </table>
</form:form>
</body>

</html>
