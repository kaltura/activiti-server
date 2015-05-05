package com.kaltura.bpm.server.activiti.datacenters;

import org.activiti.engine.impl.persistence.StrongUuidGenerator;

public class IdGenerator extends StrongUuidGenerator {

	private int dataCenter = 0;
	
	@Override
	public String getNextId() {
		return dataCenter + "_" + super.getNextId();
	}

	public int getDataCenter() {
		return dataCenter;
	}

	public void setDataCenter(int dataCenter) {
		this.dataCenter = dataCenter;
	}
}
