import ru.netology.services.CalcService;

public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        int count = service.calcService(10000,3000,0);
        System.out.println(count);
    }
}
