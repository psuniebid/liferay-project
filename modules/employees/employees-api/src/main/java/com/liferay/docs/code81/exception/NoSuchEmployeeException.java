/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */
package com.liferay.docs.code81.exception;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author Brian Wing Shun Chan
 */
public class NoSuchEmployeeException extends NoSuchModelException {

	public NoSuchEmployeeException() {
	}

	public NoSuchEmployeeException(String msg) {
		super(msg);
	}

	public NoSuchEmployeeException(String msg, Throwable throwable) {
		super(msg, throwable);
	}

	public NoSuchEmployeeException(Throwable throwable) {
		super(throwable);
	}

}