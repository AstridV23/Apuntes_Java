package MyDate;

public class myDate {
    private int year;
    private int month;
    private int day;
    String[] strMonths =
            {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
             "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    String[] strDays =
            {"Sunday", "Monday", "Tuesday", "Wednesday",
             "Thursday", "Friday", "Saturday"};
    int[] daysInMonths =
            {31,28,31,30,31,30,31,31,30,31,30,31};

    public myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return ""; // terminar
    }
}
