import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm:ss");
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, yyyy, 'at' h:mm a'.'");
    public LocalDateTime schedule(String appointmentDateDescription) {
        LocalDateTime parse = LocalDateTime.parse(appointmentDateDescription, FORMATTER);
        return parse;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return appointmentDate.isBefore(now);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return 12 <= appointmentDate.getHour() && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String date = DESCRIPTION_FORMATTER.format(appointmentDate);
        return date;
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);
    }
}
