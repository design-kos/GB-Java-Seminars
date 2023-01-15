package Seminars.Seminar11.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Attendance {

    private Map<LocalDate, Boolean> attendance;

    public Attendance() {
        attendance = new HashMap<>();
    }

    public void addDateVisit(LocalDate date, Boolean visit) {
        attendance.putIfAbsent(date, visit);
    }

    public int attendanceCount() {
        int count = 0;
        for (Map.Entry<LocalDate, Boolean> map : attendance.entrySet()) {
            if (map.getValue()) {
                count++;
            }
        }
        return count;
    }

    public int percentAttendance() {
        return attendanceCount() * 100 / attendance.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<LocalDate, Boolean> map : attendance.entrySet()) {
            sb.append(map.getKey());
            sb.append(", ");
            sb.append(map.getValue());
            sb.append("\n");
        }
        return sb.toString();
    }

}
