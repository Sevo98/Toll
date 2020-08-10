import org.junit.Test;

public class serverUITest {
    @Test
    public void toJson() throws Exception{
        serverUI UI = new serverUI();

        UI.getTask(1,"Иванов Иван","Разработчики","Создать сервис автоматической оплаты на платной дороге");
    }
}
