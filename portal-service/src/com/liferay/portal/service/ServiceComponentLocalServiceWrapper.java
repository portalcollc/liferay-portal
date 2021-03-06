/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service;

/**
 * <p>
 * This class is a wrapper for {@link ServiceComponentLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ServiceComponentLocalService
 * @generated
 */
public class ServiceComponentLocalServiceWrapper
	implements ServiceComponentLocalService,
		ServiceWrapper<ServiceComponentLocalService> {
	public ServiceComponentLocalServiceWrapper(
		ServiceComponentLocalService serviceComponentLocalService) {
		_serviceComponentLocalService = serviceComponentLocalService;
	}

	/**
	* Adds the service component to the database. Also notifies the appropriate model listeners.
	*
	* @param serviceComponent the service component
	* @return the service component that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ServiceComponent addServiceComponent(
		com.liferay.portal.model.ServiceComponent serviceComponent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.addServiceComponent(serviceComponent);
	}

	/**
	* Creates a new service component with the primary key. Does not add the service component to the database.
	*
	* @param serviceComponentId the primary key for the new service component
	* @return the new service component
	*/
	public com.liferay.portal.model.ServiceComponent createServiceComponent(
		long serviceComponentId) {
		return _serviceComponentLocalService.createServiceComponent(serviceComponentId);
	}

	/**
	* Deletes the service component with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceComponentId the primary key of the service component
	* @throws PortalException if a service component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public void deleteServiceComponent(long serviceComponentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_serviceComponentLocalService.deleteServiceComponent(serviceComponentId);
	}

	/**
	* Deletes the service component from the database. Also notifies the appropriate model listeners.
	*
	* @param serviceComponent the service component
	* @throws SystemException if a system exception occurred
	*/
	public void deleteServiceComponent(
		com.liferay.portal.model.ServiceComponent serviceComponent)
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceComponentLocalService.deleteServiceComponent(serviceComponent);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.portal.model.ServiceComponent fetchServiceComponent(
		long serviceComponentId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.fetchServiceComponent(serviceComponentId);
	}

	/**
	* Returns the service component with the primary key.
	*
	* @param serviceComponentId the primary key of the service component
	* @return the service component
	* @throws PortalException if a service component with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ServiceComponent getServiceComponent(
		long serviceComponentId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.getServiceComponent(serviceComponentId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the service components.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of service components
	* @param end the upper bound of the range of service components (not inclusive)
	* @return the range of service components
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.ServiceComponent> getServiceComponents(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.getServiceComponents(start, end);
	}

	/**
	* Returns the number of service components.
	*
	* @return the number of service components
	* @throws SystemException if a system exception occurred
	*/
	public int getServiceComponentsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.getServiceComponentsCount();
	}

	/**
	* Updates the service component in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceComponent the service component
	* @return the service component that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ServiceComponent updateServiceComponent(
		com.liferay.portal.model.ServiceComponent serviceComponent)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.updateServiceComponent(serviceComponent);
	}

	/**
	* Updates the service component in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param serviceComponent the service component
	* @param merge whether to merge the service component with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the service component that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ServiceComponent updateServiceComponent(
		com.liferay.portal.model.ServiceComponent serviceComponent,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.updateServiceComponent(serviceComponent,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _serviceComponentLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_serviceComponentLocalService.setBeanIdentifier(beanIdentifier);
	}

	public void destroyServiceComponent(
		javax.servlet.ServletContext servletContext,
		java.lang.ClassLoader classLoader)
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceComponentLocalService.destroyServiceComponent(servletContext,
			classLoader);
	}

	public com.liferay.portal.model.ServiceComponent initServiceComponent(
		javax.servlet.ServletContext servletContext,
		java.lang.ClassLoader classLoader, java.lang.String buildNamespace,
		long buildNumber, long buildDate, boolean buildAutoUpgrade)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _serviceComponentLocalService.initServiceComponent(servletContext,
			classLoader, buildNamespace, buildNumber, buildDate,
			buildAutoUpgrade);
	}

	public void upgradeDB(java.lang.ClassLoader classLoader,
		java.lang.String buildNamespace, long buildNumber,
		boolean buildAutoUpgrade,
		com.liferay.portal.model.ServiceComponent previousServiceComponent,
		java.lang.String tablesSQL, java.lang.String sequencesSQL,
		java.lang.String indexesSQL) throws java.lang.Exception {
		_serviceComponentLocalService.upgradeDB(classLoader, buildNamespace,
			buildNumber, buildAutoUpgrade, previousServiceComponent, tablesSQL,
			sequencesSQL, indexesSQL);
	}

	public void verifyDB()
		throws com.liferay.portal.kernel.exception.SystemException {
		_serviceComponentLocalService.verifyDB();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ServiceComponentLocalService getWrappedServiceComponentLocalService() {
		return _serviceComponentLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedServiceComponentLocalService(
		ServiceComponentLocalService serviceComponentLocalService) {
		_serviceComponentLocalService = serviceComponentLocalService;
	}

	public ServiceComponentLocalService getWrappedService() {
		return _serviceComponentLocalService;
	}

	public void setWrappedService(
		ServiceComponentLocalService serviceComponentLocalService) {
		_serviceComponentLocalService = serviceComponentLocalService;
	}

	private ServiceComponentLocalService _serviceComponentLocalService;
}