/*
 * Напишите три цикла выполняющих многократное слодение строк, один с помощью оператора слодения и String.
 * Другой с помощью StringBuilder и метода append, а также аналогично для StringBuffer. Сравните скорость их выполнения
 */

package partTwo;

public class Task21 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer str2 = new StringBuffer();
        StringBuilder str3 = new StringBuilder();
        long time = System.currentTimeMillis();

        System.out.println("Time before test: " + time);
        for (int i = 0; i < 100000; i++) {
            str += " ";
        }
        long timeString = System.currentTimeMillis();
        System.out.println("Time String: " + timeString);

        for (int i = 0; i < 100000; i++) {
            str2.append(" ");
        }
        long timeBuffer = System.currentTimeMillis();
        System.out.println("Time StringBuffer: " + timeBuffer);

        for (int i = 0; i < 100000; i++) {
            str3.append(" ");
        }
        long timeBuilder = System.currentTimeMillis();
        System.out.println("Time StringBuilder: " + timeBuilder);

        if (timeString - time < timeBuffer - timeString && timeString - time < timeBuilder - timeString) {
            System.out.println("Time string better");
        } else if (timeBuffer - timeString < timeString - time && timeBuffer - timeString < timeBuilder - timeBuffer) {
            System.out.println("Time Buffer better");
        } else {
            System.out.println("Time Builder better");
        }
    }
}
