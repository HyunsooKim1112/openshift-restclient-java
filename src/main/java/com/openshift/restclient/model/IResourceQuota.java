/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package com.openshift.restclient.model;

import com.openshift.restclient.model.IResource;

/**
 * @author jeff.cantrill
 */
public interface IResourceQuota extends IResource {
	
	public String getCpu();
	
	public void setCpu(String cpu);
	
	public String getMemory();
	
	public void setMemory(String memory);
	
	public String getPods();
	
	public void setPods(String pods);
	
	public String getServices();
	
	public void setServices(String services);
	
	public String getReplicationcontrollers();
	
	public void setReplicationcontrollers(String replicationcontrollers);
	
	public String getResourcequotas();
	
	public void setResourcequotas(String resourcequotas);

}
