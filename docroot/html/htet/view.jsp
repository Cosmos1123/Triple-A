<%@ include file="/html/init.jsp" %>

<h3>VIEW Hosting Services</h3>

<portlet:renderURL var="servicesRenderURL">
	<portlet:param name="mvcPath" value="/html/htet/servicess.jsp"></portlet:param>
</portlet:renderURL>

<c:if test='<%=ServiceModelPermission.contains(permissionChecker, scopeGroupId, "ADD_SERVICES")%>'>
<aui:button name="addServices" onClick="<%=servicesRenderURL.toString()%>" value="ADD Services"></aui:button>
</c:if>


<liferay-ui:search-container>
	<liferay-ui:search-container-results results="<%=ServicesLocalServiceUtil.getServicess(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd()) %>">
	</liferay-ui:search-container-results>
	
	<liferay-ui:search-container-row className="Services" modelVar="services">
	
	<liferay-ui:search-container-column-text name="servicesName"></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text name="servicesPrice"></liferay-ui:search-container-column-text>
	<liferay-ui:search-container-column-text name="servicesDesc"></liferay-ui:search-container-column-text>
	
	<liferay-ui:search-container-column-jsp align="right" path="/html/htet/service_action.jsp"></liferay-ui:search-container-column-jsp>
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator></liferay-ui:search-iterator>
</liferay-ui:search-container>