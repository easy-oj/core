package ac.eoj.core.util;

import ac.eoj.core.util.exceptions.ConflictException;
import ac.eoj.core.util.exceptions.ForbiddenException;
import ac.eoj.core.util.exceptions.NotFoundException;

public final class Assert {
	public static void hasAccess(boolean bool) {
		if (!bool) {
			throw new ForbiddenException();
		}
	}

	public static void notNull(Object object) {
		if (object == null) {
			throw new NotFoundException();
		}
	}

	public static void isNull(Object object) {
		if (object != null) {
			throw new ConflictException();
		}
	}

	public static void isNull(Object object, String message) {
		if (object != null) {
			throw new ConflictException(message);
		}
	}
}
