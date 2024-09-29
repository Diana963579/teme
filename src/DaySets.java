import java.util.EnumSet;

public class DaySets {
        public static void main(String[] args) {
            EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
            EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

            System.out.println("Weekdays: " + weekdays);
            System.out.println("Weekend: " + weekend);
        }
    }
