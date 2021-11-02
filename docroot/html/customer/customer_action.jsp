<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="Htet_Lithan.com.test.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/html/init.jsp" %>

<% 
	//Retrieve current row
	ResultRow row = (ResultRow) request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	//Get current row to services object
	Customer customer = (Customer) row.getObject();
%>

<!-- Delete Action URL -->
<portlet:actionURL name="deleteCustomer" var="deleteCustomerActionURL">
	<portlet:param name="customerId" value="<%=String.valueOf(customer.getCustomerId())%>"></portlet:param>
</portlet:actionURL>

<portlet:renderURL var="EditCustomerRenderURL">
	<portlet:param name="customerId" value="<%=String.valueOf(customer.getCustomerId())%>"></portlet:param>
	<portlet:param name="mvcPath" value="/html/customer/customer.jsp"></portlet:param>
</portlet:renderURL>

<!-- Liferay Action Icon Menu -->
<liferay-ui:icon-menu>
	<!-- Delete Action Button -->
	<liferay-ui:icon-delete url="<%=deleteCustomerActionURL.toString()%>"></liferay-ui:icon-delete>
	
	<!-- Edit Action Button -->
	<liferay-ui:icon image="edit" message="Edit" url="<%=EditCustomerRenderURL.toString()%>"></liferay-ui:icon>
</liferay-ui:icon-menu>