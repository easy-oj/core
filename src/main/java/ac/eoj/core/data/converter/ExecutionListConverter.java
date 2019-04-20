package ac.eoj.core.data.converter;

import ac.eoj.core.data.entity.Submission;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class ExecutionListConverter extends AbstractJSONConverter<List<Submission.Execution>> {
	@Override
	protected TypeReference typeReference() {
		return new TypeReference<List<Submission.Execution>>() {
		};
	}
}
