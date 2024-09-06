package geekbrains_course.java_core.seminar4.lecture_task;

class StringConversionException extends Exception {
	private final String expected;
	private final String actual;

	public StringConversionException(String expected, String actual) {
		super("Ожидание: " + expected + ", Реальность: " + actual);
		this.expected = expected;
		this.actual = actual;
	}

	public String getExpected() {
		return expected;
	}

	public String getActual() {
		return actual;
	}
}

class ColumnConversionException extends Exception {
	private final String expected;
	private final String actual;

	public ColumnConversionException(String expected, String actual) {
		super("Ожидание: " + expected + ", Реальность: " + actual);
		this.expected = expected;
		this.actual = actual;
	}

	public String getExpected() {
		return expected;
	}

	public String getActual() {
		return actual;
	}
}

public class MainExpAct {
	public static void main(String[] args) {
		try {
			convertString("неверная строка");
		} catch (StringConversionException e) {
			System.err.println("Ошибка преобразования строки: " + e.getMessage());
		} catch (ColumnConversionException e) {
			System.err.println("Ошибка преобразования столбца: " + e.getMessage());
		}
	}

	public static void convertString(String str) throws StringConversionException {
		String expected = "правильная строка";

		if (!str.equals(expected)) {
			throw new StringConversionException(expected, str);
		}

		System.out.println("Строка успешно преобразована: " + str);
	}
}
