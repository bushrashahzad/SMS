import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

public class StaffTest {
    @Test
    public void testCalculateWorkTime() throws ParseException {
        Employee employee = new Employee(1, "Doe", "John", "password123");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = sdf.parse("2024-01-17 09:00:00");
        Date finishDate = sdf.parse("2024-01-17 17:30:00");
        employee.setStartWorkTime(startDate);
        employee.setFinishWorkTime(finishDate);
        double workTime = employee.culculateWorkTime();
        assertEquals(0.0, workTime, 0.01); 
    }
}
