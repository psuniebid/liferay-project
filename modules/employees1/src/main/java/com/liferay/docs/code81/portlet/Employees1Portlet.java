package com.liferay.docs.code81.portlet;

import com.liferay.docs.code81.constants.Employees1PortletKeys;

import com.liferay.docs.code81.model.EmployeeModel;
import com.liferay.docs.code81.service.EmployeeLocalService;
import com.liferay.docs.code81.model.Employee;
import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * @author basiony.ebid
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Employees1",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + Employees1PortletKeys.EMPLOYEES1,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class Employees1Portlet extends MVCPortlet {

	@Reference
	private EmployeeLocalService _employeeLocalService;

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		String searchQuery = ParamUtil.getString(renderRequest, "searchQuery", "");

		List<Employee> employees;

		if (searchQuery.isEmpty()) {
			System.err.println("1111111111111111111");
			employees = _employeeLocalService.findALlEmployees();
		} else {
			System.err.println("2222222222222222222");
			employees = _employeeLocalService.findByEmployeeName(searchQuery);
		}

		renderRequest.setAttribute("employees", employees);

		super.render(renderRequest, renderResponse);
	}



}