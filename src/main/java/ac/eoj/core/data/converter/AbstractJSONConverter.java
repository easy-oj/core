package ac.eoj.core.data.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.AttributeConverter;
import java.io.IOException;

abstract class AbstractJSONConverter<T> implements AttributeConverter<T, String> {
	private final ObjectMapper mapper;
	private final TypeReference typeReference;

	AbstractJSONConverter() {
		this.mapper = new ObjectMapper();
		this.typeReference = typeReference();
	}

	protected abstract TypeReference typeReference();

	@Override
	public final String convertToDatabaseColumn(T attribute) {
		try {
			return mapper.writer().forType(typeReference).writeValueAsString(attribute);
		} catch (JsonProcessingException e) {
			return null;
		}
	}

	@Override
	public final T convertToEntityAttribute(String dbData) {
		try {
			return mapper.reader().forType(typeReference).readValue(dbData);
		} catch (IOException e) {
			return null;
		}
	}
}
