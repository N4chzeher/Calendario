/**
 * Created by NACHZEHER on 23/02/2017.
 */
public class Calendar {

    private int day;
    private int month;
    private int year;


    public Calendar(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;
        if (!checkFecha()) {
            throw new RuntimeException("La fecha es incorrecta: " + year + "-" + month + "-" + day);
        }
    }

    private boolean esBisiesto() {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }


    public boolean checkFecha() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = year > 0;
        mesCorrecto = month >= 1 && month <= 12;
        switch (month) {
            case 2:
                if (esBisiesto()) {
                    diaCorrecto = day >= 1 && day <= 29;
                } else {
                    diaCorrecto = day >= 1 && day <= 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaCorrecto = day >= 1 && day <= 30;
                break;
            default:
                diaCorrecto = day >= 1 && day <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }


    public void incrementarDia(int incday) {

        if (day + incday < getDays(month)) {
            day = day + incday;
        } else {
            day = (day + incday) - getDays(month);

            if (day == 0) {
                day = getDays(month);
                month--;
            }
            if (month < 12) {
                month++;

            } else {
                month = 1;
                year++;
            }
        }
    }

    public int getDays(int month) {

        int dmes;

        switch (month) {
            case 2:
                if (esBisiesto()) {
                    dmes = 29;
                } else {
                    dmes = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dmes = 30;
                break;
            default:
                dmes = 31;
        }
        return dmes;
    }

    public void incrementarMes(int incmes) {

        if ((month + incmes) < 12) {
            month = month + incmes;
        } else {
            month = (month + incmes) - 12;
            year++;

            if (month == 0) {
                month = 12;
                year--;
            }
        }
    }

    public void incrementarAnio(int incanio) {

        if (incanio >= 0) {
            year = year + incanio;
        } else {
            year = year - incanio;

        }
    }

    public void printDate() {

        System.out.println("Fecha  es: " +
                +day +
                "/" + month +
                "/" + year +
                '.');
    }

    public boolean equalsDates(Calendar calendar){

        if(this.day==calendar.day && this.month==calendar.month && this.year==calendar.year){

            return true;
        }
        return false;


    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
