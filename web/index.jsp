<%-- 
    Document   : index
    Created on : Jun 13, 2016, 6:26:29 PM
    Author     : Rasna
--%>

<%@page import="org.git.webapp.dao.MemberDAO"%>
<%@page import="org.git.webapp.dao.impl.MemberDAOImpl"%>
<%@page import="org.git.webapp.entity.Member"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<h1> Member</h1>
<table class ="table table-bordered table-striped table-hover">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Contact</th>
        <th>Action</th>

    </tr>
    <%
        MemberDAO memberDAO = new MemberDAOImpl();
        for (Member m:memberDAO.getAll()) {
    %>

    <tr>
        <td><%=m.getId()%></td>
        <td><%=m.getFirstName()%> <%=m.getLastName()%></td>
        <td><%=m.getEmail()%></td>
        <td><%=m.getContact_no()%></td>
        <td>
            <a herf="editmember.jsp?id=<%=m.getId()%>" class="btn btn-success btn-sm" title="Edit" onclick="">
                <span class="glyphicon glyphicon-pencil"></span>
            </a>
            <a herf="" class="btn btn-danger btn-sm" title="Delete" onclick="return confirm('Are you sure to Delete?')">
                <span class="glyphicon glyphicon-trash"></span>
            </a>
        </td>


    </tr>
    <%}%>
</table>

<%@include file="footer.jsp" %>
