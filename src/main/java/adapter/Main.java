package adapter;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Create an instance of CalendarToNewDateAdapter
        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter(calendar);

        // Set the date
        adapter.setDay(15);
        adapter.setMonth(Calendar.OCTOBER);
        adapter.setYear(2024);

        // Print the initial date
        System.out.println("Initial date: " + adapter.getDay() + "/" + (adapter.getMonth() + 1) + "/" + adapter.getYear());

        adapter.advanceDays(10);

        // Print the new date
        System.out.println("New date: " + adapter.getDay() + "/" + (adapter.getMonth() + 1) + "/" + adapter.getYear());
    }
}