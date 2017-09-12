<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table class="Ptable" border="1"cellpadding="0" cellspacing="1" width="100%">
	<c:forEach  items="${pramItemVos }" var="paramItem">
	
	<thead>
		<tr>
			<th colspan="2">${paramItem.group }</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach  items="${paramItem.params }" var="p">
		<tr>
			<td>${p.k }</td><td>${p.v }</td>
		</tr>
		</c:forEach>
	</tbody>
	</c:forEach>
</table>