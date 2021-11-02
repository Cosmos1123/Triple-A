<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects></portlet:defineObjects>
<theme:defineObjects></theme:defineObjects>

<%-- Model or Entity --%>
<%@ page import="Htet_Lithan.com.test.model.Customer" %>
<%@ page import="Htet_Lithan.com.test.model.Services" %>

<%-- Service Layer --%>
<%@ page import="Htet_Lithan.com.test.service.impl.CustomerLocalServiceImpl"%>
<%@ page import="Htet_Lithan.com.test.service.impl.ServicesLocalServiceImpl" %>
<%@page import="Htet_Lithan.com.test.service.ServicesLocalServiceUtil"%>
<%@page import="Htet_Lithan.com.test.service.CustomerLocalServiceUtil"%>

<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>

<%-- Action UPDATE, DELETE --%>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchEntry" %>
<%@ page import="com.liferay.portal.kernel.dao.search.ResultRow" %>
<%@ page import="com.liferay.portal.kernel.util.WebKeys" %>

<!-- Action Security -->
<%@ taglib uri="http://liferay.com/tld/security" prefix="liferay-security" %>

<!-- Liferay c.tld -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!-- Permission Helper Classes -->
<%@page import="Htet_Lithan.com.test.permission.ServiceModelPermission"%>
<%@page import="Htet_Lithan.com.test.permission.ServicesPermission"%>