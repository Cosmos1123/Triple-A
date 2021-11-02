package Htet_Lithan.com.test.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.security.auth.PrincipalException;
import com.liferay.portal.security.permission.PermissionChecker;

public class ServiceModelPermission {
public static final String RESOURCE_NAME = "Htet_Lithan.com.test.model";
	
	public static void check(PermissionChecker permissionChecker, long groupId, String actionId) throws PortalException{
		if(!contains(permissionChecker, groupId, actionId))
			throw new PrincipalException();
	}
	
	public static boolean contains(PermissionChecker permissionChecker, long groupId, String actionId) {
		return permissionChecker.hasPermission(groupId, RESOURCE_NAME, groupId, actionId);
	}

}
