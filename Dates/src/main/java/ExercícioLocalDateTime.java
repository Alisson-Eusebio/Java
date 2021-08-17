import java.time.LocalDateTime;

public class ExercícioLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.MAX.withYear(2010).withMonth(5).withDayOfMonth(15).withHour(10).withMinute(0).withSecond(0).withNano(00);

        System.out.println(agora);

        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro);
    }
}
