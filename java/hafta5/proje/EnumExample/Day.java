package hafta5.proje.EnumExample;

public enum Day {

    MONDAY("08.00 - 16.00"),
    TUESDAY("09.00 - 17.00"),
    WEDNESDAY("07.00 - 15.00"),
    THURSDAY("10.00 - 17.00"),
    FRIDAY("10.00 - 19.00"),
    SATURDAY("09.00 - 13.00"),
    SUNDAY("09.00 - 10.00");

    private final String workHours;

    Day(String workHours) {
        this.workHours = workHours;
    }

    public String getWorkHours() {
        return workHours;
    }

    //Kullanıcıdan alınan veriyi kontrol eden metod
    public static boolean isValidDay(String dayName) {
        for (Day day : Day.values()) {
            if (day.name().equalsIgnoreCase(dayName)) {
                return true;
            }
        }
        return false;
    }

}

