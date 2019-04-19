package ac.eoj.core.web.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class PageResourceResponse<T> extends ResourceResponse<List<T>> {
	@JsonProperty("page")
	private PageInfo pageInfo;

	public PageResourceResponse(Page<T> page) {
		super(page.getContent());
		this.pageInfo = new PageInfo(page);
	}

	@Data
	private static class PageInfo {
		private int page;
		private int limit;
		private int size;
		private long total;

		PageInfo(Page page) {
			this.page = page.getNumber() + 1;
			this.limit = page.getSize();
			this.size = page.getContent().size();
			this.total = page.getTotalElements();
		}
	}
}
