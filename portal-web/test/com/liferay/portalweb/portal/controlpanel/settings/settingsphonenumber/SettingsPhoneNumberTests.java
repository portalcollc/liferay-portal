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

package com.liferay.portalweb.portal.controlpanel.settings.settingsphonenumber;

import com.liferay.portalweb.portal.BaseTests;
import com.liferay.portalweb.portal.controlpanel.settings.settingsphonenumber.addsettingsphonenumber.AddSettingsPhoneNumberTests;
import com.liferay.portalweb.portal.controlpanel.settings.settingsphonenumber.addsettingsphonenumbermultiple.AddSettingsPhoneNumberMultipleTests;
import com.liferay.portalweb.portal.controlpanel.settings.settingsphonenumber.deletesettingsphonenumber.DeleteSettingsPhoneNumberTests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author Brian Wing Shun Chan
 */
public class SettingsPhoneNumberTests extends BaseTests {

	public static Test suite() {
		TestSuite testSuite = new TestSuite();

		testSuite.addTest(AddSettingsPhoneNumberTests.suite());
		testSuite.addTest(AddSettingsPhoneNumberMultipleTests.suite());
		testSuite.addTest(DeleteSettingsPhoneNumberTests.suite());

		return testSuite;
	}

}