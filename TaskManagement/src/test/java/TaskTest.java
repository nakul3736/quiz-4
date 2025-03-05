import org.example.Task;
import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TaskTest {


    @Test
    public void assignToTest() {
        Task task = new Task();
        assertTrue(task.assignTask("nakul"));
        return;
    }

    @Test
    public void updateStatus() {
        return;
    }

    @Test
    public void isOverdue() {
        Task task = new Task();
        assertFalse(task.dueTask(new Date()));
    }
}
