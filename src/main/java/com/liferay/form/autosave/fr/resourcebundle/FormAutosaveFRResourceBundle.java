/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.form.autosave.fr.resourcebundle;

import com.liferay.portal.kernel.language.UTF8Control;

import java.util.Enumeration;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.log.LogService;

/**
 * @author Liferay
 */
@Component(
	immediate = true, property = "language.id=fr",
	service = ResourceBundle.class
)
public class FormAutosaveFRResourceBundle extends ResourceBundle {

	@Activate
	public void activate() {
		_log.log(LogService.LOG_INFO, "Form Autosave AR Resource Bundle Deployed!");
	}

	@Override
	public Enumeration<String> getKeys() {
		return _resourceBundle.getKeys();
	}

	@Override
	protected Object handleGetObject(String key) {
		return _resourceBundle.getObject(key);
	}

	@Reference
	private LogService _log;

	private final ResourceBundle _resourceBundle = ResourceBundle.getBundle(
		"content.Language_fr", UTF8Control.INSTANCE);

}