package ac.eoj.core.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class ResourceResponse<T> extends EmptyResponse {
	@JsonProperty("res")
	private T resource;

	public ResourceResponse(T resource) {
		this.resource = resource;
	}
}
