package com.web.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.jpa.entities.AppFeature;
import com.jpa.entities.UserRole;
import com.pmsapp.view.vo.LoginUser;
import com.web.service.AuthorizationService;
import com.web.util.RestResponse;

@Service("authorizationService")
public class AuthorizationServiceImpl implements AuthorizationService {

	private static final Logger logger = LoggerFactory.getLogger(AuthorizationServiceImpl.class);

	@Override
	@PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_SITE_STAFF','ROLE_OPS_MANAGER', 'ROLE_SALES_MANAGER')") 
	public RestResponse authorizeUserAccess(final LoginUser loginUser) throws Exception {
		RestResponse response = new RestResponse();
		logger.info("Authorizing user  : " + loginUser.getUsername());
		UserRole userRole = loginUser.getUserRoles().get(0);
		List<AppFeature> featureAccessList =loginUser.getFeatureList();
		/*if(!featureAccessList.isEmpty()){
			for(AppFeature feature:featureAccessList){
				if(feature.getAccessCode().equalsIgnoreCase("AC-0001")){
					//validateAppFeatureAccess(feature);
				}
				if(feature.getAccessCode().equalsIgnoreCase("AC-0002")){

				}
				if(feature.getAccessCode().equalsIgnoreCase("AC-0003")){

				}
				if(feature.getAccessCode().equalsIgnoreCase("AC-0004")){

				}

			}
		}*/
		response.setObject(featureAccessList);
		response.setLoggedInUserMail(loginUser.getUsername());
		response.setStatusCode(200);
		//}
		return response;
	}

	/**
	 * @param feature
	 */
	/*private String validateAppFeatureAccess(final AppFeature feature) {
		switch(feature.getId().intValue()){
		case 1 : ;
		case 2 : ;
		case 3 : ;
		case 4 : ;
		case 5 : ;
		case 6 : ;
		case 7 : ;
		case 8 : ;
		default: ;

		}
	}*/

}
