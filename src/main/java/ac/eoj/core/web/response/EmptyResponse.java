package ac.eoj.core.web.response;

import lombok.Data;

@Data
public class EmptyResponse implements Response {
	private int code;

	public EmptyResponse() {
		this.code = 0;
	}

	protected EmptyResponse(int code) {
		this.code = code;
	}
}
