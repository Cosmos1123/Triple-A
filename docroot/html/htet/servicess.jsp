
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/init.jsp" %>

<%
	//When rendering to the pizza.jsp, get current pizzaId which want to edit
	long servicesId = ParamUtil.getLong(renderRequest, "servicesId");
	//create services object
	Services services = null;
	//Check servicesId, if 0 it is request to add services, or >0 it is requested to edit services
	if(servicesId > 0){
		services = ServicesLocalServiceUtil.getServices(servicesId);
	}
%>


<h2>Hosting Service Form</h2>
<h3>Add new services </h3>

<portlet:renderURL var="viewRenderURL">
	<portlet:param name="mvcPath" value="/html/htet/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addServices" var="servicesActionURL"></portlet:actionURL>

<aui:form action="<%=servicesActionURL %>">

<!-- Updated services is displaying in the form -->
<aui:model-context bean="<%=services%>" model="<%=Services.class %>">
</aui:model-context>
	<aui:input name="servicesId" type="hidden" ></aui:input>
	<aui:input name="servicesName" type="text"></aui:input>
	<aui:input name="servicesPrice" type="text"></aui:input>
	<aui:input name="servicesDesc" type="text"></aui:input>

	<aui:button type="submit" value="SUBMIT"></aui:button>
	<aui:button onClick="<%=viewRenderURL.toString() %>" type="cancel" value="CANCEL"></aui:button>

</aui:form>
