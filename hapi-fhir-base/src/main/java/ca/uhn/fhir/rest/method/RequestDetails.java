package ca.uhn.fhir.rest.method;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 - 2015 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.Map;

import ca.uhn.fhir.model.dstu.valueset.RestfulOperationSystemEnum;
import ca.uhn.fhir.model.dstu.valueset.RestfulOperationTypeEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.api.RequestTypeEnum;
import ca.uhn.fhir.rest.server.RestfulServer;

public class RequestDetails {

	private String myCompartmentName;
	private String myCompleteUrl;
	private IdDt myId;
	private OtherOperationTypeEnum myOtherOperationType;
	private Map<String, String[]> myParameters;
	private RequestTypeEnum myRequestType;
	private String myResourceName;
	private RestfulOperationTypeEnum myResourceOperationType;
	private RestfulServer myServer;
	private RestfulOperationSystemEnum mySystemOperationType;

	public String getCompartmentName() {
		return myCompartmentName;
	}

	public String getCompleteUrl() {
		return myCompleteUrl;
	}

	public IdDt getId() {
		return myId;
	}

	public OtherOperationTypeEnum getOtherOperationType() {
		return myOtherOperationType;
	}

	public Map<String, String[]> getParameters() {
		return myParameters;
	}

	public RequestTypeEnum getRequestType() {
		return myRequestType;
	}

	public String getResourceName() {
		return myResourceName;
	}

	public RestfulOperationTypeEnum getResourceOperationType() {
		return myResourceOperationType;
	}

	public RestfulServer getServer() {
		return myServer;
	}

	public RestfulOperationSystemEnum getSystemOperationType() {
		return mySystemOperationType;
	}

	public void setCompartmentName(String theCompartmentName) {
		myCompartmentName = theCompartmentName;
	}

	public void setCompleteUrl(String theCompleteUrl) {
		myCompleteUrl = theCompleteUrl;
	}

	public void setId(IdDt theId) {
		myId = theId;
	}

	public void setOtherOperationType(OtherOperationTypeEnum theOtherOperationType) {
		myOtherOperationType = theOtherOperationType;
	}

	public void setParameters(Map<String, String[]> theParams) {
		myParameters = theParams;
	}

	public void setRequestType(RequestTypeEnum theRequestType) {
		myRequestType = theRequestType;
	}

	public void setResourceName(String theResourceName) {
		myResourceName = theResourceName;
	}

	public void setResourceOperationType(RestfulOperationTypeEnum theResourceOperationType) {
		myResourceOperationType = theResourceOperationType;
	}

	public void setServer(RestfulServer theServer) {
		myServer = theServer;
	}

	public void setSystemOperationType(RestfulOperationSystemEnum theSystemOperationType) {
		mySystemOperationType = theSystemOperationType;
	}

}
