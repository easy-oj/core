package ac.eoj.core.data.converter;

import ac.eoj.core.object.entity.Problem;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Map;

public class LidLimitMapConverter extends AbstractJSONConverter<Map<Integer, Problem.Limit>> {
	@Override
	protected TypeReference typeReference() {
		return new TypeReference<Map<Integer, Problem.Limit>>() {
		};
	}
}
