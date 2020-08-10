public class serverUI {
    public void getTask(int taskNumber, String namePerson, String department, String task){
        System.out.println("Задача №" + taskNumber + ":");
        System.out.println(task + "\nИсполнительный отдел: " + department + "\nСотрудник: " + namePerson);
    }
}
