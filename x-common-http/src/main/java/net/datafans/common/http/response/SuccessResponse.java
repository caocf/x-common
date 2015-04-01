package net.datafans.common.http.response;

import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class SuccessResponse extends BaseResponse {

	private Map<String, Object> data;

	public SuccessResponse() {
		setStatus(ResponseStatus.STATUS_SUCCESS);
	}

	public SuccessResponse(Map<String, Object> data) {
		setStatus(ResponseStatus.STATUS_SUCCESS);
		setData(data);

	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

}
