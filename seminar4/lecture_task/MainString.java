package geekbrains_course.java_core.seminar4.lecture_task;

class StringConversionException extends Exception {
	public StringConversionException(String message) {
		super(message);
	}

	public StringConversionException(String message, Throwable cause) {
		super(message, cause);
	}
}

class ColumnConversionException extends Exception {
	public ColumnConversionException(String message) {
		super(message);
	}

	public ColumnConversionException(String message, Throwable cause) {
		super(message, cause);
	}
}

public class MainString {
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
		if (str.equals("неверная строка")) {
			throw new StringConversionException("Не удалось преобразовать строку: " + str);
		}

		System.out.println("Строка успешно преобразована: " + str);
	}
}
