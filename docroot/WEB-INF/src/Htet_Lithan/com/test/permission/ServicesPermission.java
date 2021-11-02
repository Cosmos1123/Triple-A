package Htet_Lithan.com.test.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

import Htet_Lithan.com.test.model.Services;
import Htet_Lithan.com.test.service.ServicesLocalServiceUtil;

public class ServicesPermission {
	public static void check(PermissionChecker permissionChecker, long groupId, String actionId) throws PortalException, SystemException{
		if(!contains(permissionChecker, groupId, actionId))
			throw new PrincipalException();
	}
	
	public static boolean contains(PermissionChecker permissionChecker, long servicesId, String actionId) throws PortalException, SystemException {
		
		Services services = ServicesLocalServiceUtil.getServices(servicesId);
		
		return permissionChecker.hasPermission(services.getGroupId(), Services.class.getName(), services.getServicesId(), actionId);
	}

}
