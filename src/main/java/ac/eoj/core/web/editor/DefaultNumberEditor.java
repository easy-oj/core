package ac.eoj.core.web.editor;

import java.beans.PropertyEditorSupport;

public class DefaultNumberEditor extends PropertyEditorSupport {
	private final int defaultValue;

	public DefaultNumberEditor(int defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Override
	public void setAsText(String s) throws IllegalArgumentException {
		try {
			setValue(Integer.valueOf(s));
		} catch (NumberFormatException e) {
			setValue(defaultValue);
		}
	}

	@Override
	public String getJavaInitializationString() {
		Object obj = this.getValue();
		return obj != null ? obj.toString() : "null";
	}
}
