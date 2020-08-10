import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class usersUITest {

    @Test
    public void toJson() throws Exception{
        usersUI UI = new usersUI();
        UI.openSettings();
        assertTrue(UI.sendCoordinate().contains("Russian Federation"));
    }
}
