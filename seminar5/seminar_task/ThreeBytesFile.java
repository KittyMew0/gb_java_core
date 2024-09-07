package geekbrains_course.java_core.seminar5.seminar_task;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ThreeBytesFile {
    public static void main(String[] args) {
        int[] values = {0, 1, 2, 1, 0, 3, 2, 1, 0};

        int result = 0;
        for (int i = 0; i < 9; i++) {
            result |= (values[i] & 0b11) << (i * 2);
        }

        try (FileOutputStream fos = new FileOutputStream("field.bin")) {
            fos.write(new byte[]{
                (byte) (result & 0xFF),
                (byte) ((result >> 8) & 0xFF),
                (byte) ((result >> 16) & 0xFF),
                (byte) ((result >> 24) & 0xFF)
            });
            System.out.println("Записано значение: " + result + " в файл field.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("field.bin")) {
            byte[] data = new byte[4];
            fis.read(data);
            int readValue = ((data[3] & 0xFF) << 24) | ((data[2] & 0xFF) << 16) |
                            ((data[1] & 0xFF) << 8) | (data[0] & 0xFF);

            int[] extractedValues = new int[9];
            for (int i = 0; i < 9; i++) {
                extractedValues[i] = (readValue >> (i * 2)) & 0b11;
            }

            System.out.print("Извлеченные значения: ");
            for (int value : extractedValues) {
                System.out.print(value + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
