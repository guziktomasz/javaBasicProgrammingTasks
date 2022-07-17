package javaPodstawyProgramowanie;

public class TaskButelkaClient {
    public static void main(String[] args) {
        TaskButelka taskButelka = new TaskButelka(1000, 1, "aaaaa");
        //taskButelka.pourWater(1000000);
        //taskButelka.pourOutWater(50);
        System.out.println(taskButelka);

        TaskButelka taskButelka1 = new TaskButelka(2000, 0, "bbbbb");
        taskButelka.overflow(taskButelka1, 3);

    }
}
