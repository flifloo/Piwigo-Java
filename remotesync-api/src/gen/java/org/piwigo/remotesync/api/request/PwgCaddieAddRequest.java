/*******************************************************************************
 * Copyright (c) 2014 Matthieu Helleboid.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Matthieu Helleboid - initial API and implementation
 ******************************************************************************/
package org.piwigo.remotesync.api.request;

import org.piwigo.remotesync.api.request.AbstractRequest;
import org.piwigo.remotesync.api.response.PwgCaddieAddResponse;

/**
Adds elements to the caddie. Returns the number of elements added.
**/
@org.piwigo.remotesync.generator.Generated
public class PwgCaddieAddRequest extends AbstractRequest<PwgCaddieAddResponse> {

	protected PwgCaddieAddRequest() {}

	public PwgCaddieAddRequest(Integer image_id) {
		setImageId(image_id);
	}

	public PwgCaddieAddRequest(Integer... image_id) {
		setImageId(java.util.Arrays.asList(image_id));
	}

	public PwgCaddieAddRequest(java.util.List<Integer> image_idList) {
		setImageId(image_idList);
	}

 	protected PwgCaddieAddRequest setImageId(Integer image_id) {
		addParameterValue("image_id", org.piwigo.remotesync.api.type.Type.INT_POSITIVE_NOTNULL, null, image_id);
		return this;
	}	

	protected PwgCaddieAddRequest setImageId(Integer... image_id) {
		addParameterValueList("image_id", org.piwigo.remotesync.api.type.Type.INT_POSITIVE_NOTNULL, null, java.util.Arrays.asList(image_id));
		return this;
	}

	protected PwgCaddieAddRequest setImageId(java.util.List<Integer> image_idList) {
		addParameterValueList("image_id", org.piwigo.remotesync.api.type.Type.INT_POSITIVE_NOTNULL, null, image_idList);
		return this;
	}

	public boolean isNeedPwgToken() {
		return false;
	}

	public boolean isAdminOnly() {
		return true;
	};

	public boolean isPostOnly() {
		return false;
	};

	public String getWSMethodName() {
		return "pwg.caddie.add";
	}

	public Class<PwgCaddieAddResponse> getReturnType() {
		return PwgCaddieAddResponse.class;
	}
}
