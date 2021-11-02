<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="/html/init.jsp" %>


<portlet:defineObjects />

<h3>VIEW CUSTOMER</h3>

<portlet:renderURL var="customerRenderURL">
	<portlet:param name="mvcPath" value="/html/customer/customer.jsp"></portlet:param>
</portlet:renderURL>

<aui:button name="addCustomer" onClick="<%=customerRenderURL.toString() %>" value="ADD CUSTOMER"></aui:button>

<liferay-ui:search-container>
<liferay-ui:search-container-results results="<%=CustomerLocalServiceUtil.getCustomers(scopeGroupId, searchContainer.getStart(),searchContainer.getEnd()) %>">
</liferay-ui:search-container-results>

<liferay-ui:search-container-row className="Customer" modelVar="customer">

	<liferay-ui:search-container-column-text name="customerName"></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text name="customerEmail"></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text name="customerContact"></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text name="customerAddress"></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text name="payment"></liferay-ui:search-container-column-text>
	
	<%
			String servicesName = "";
			try{
			servicesName = ServicesLocalServiceUtil.getServices(customer.getServicesId()).getServicesName();
			}catch(Exception e){
				
			}
	%>
		
	<liferay-ui:search-container-column-text name="servicesName" value="<%=servicesName%>"></liferay-ui:search-container-column-text>
	
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
	%>
	
	<liferay-ui:search-container-column-text name="time" value="<%=sdf.format(customer.getTime()) %>"></liferay-ui:search-container-column-text>
	
	<liferay-ui:search-container-column-jsp align="right" path="/html/customer/customer_action.jsp"></liferay-ui:search-container-column-jsp>
</liferay-ui:search-container-row>	

<liferay-ui:search-iterator></liferay-ui:search-iterator>
	
</liferay-ui:search-container>


