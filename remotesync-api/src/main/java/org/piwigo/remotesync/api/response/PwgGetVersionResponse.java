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
package org.piwigo.remotesync.api.response;

import org.piwigo.remotesync.api.util.StringUtil;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.core.Commit;

public class PwgGetVersionResponse extends BasicResponse {
	
	@Text
	public String version;
	
	@Commit
	public void commit() {
		version = StringUtil.removeFormatting(version);
	}
}
