import java.time.LocalTime;

/**
 * Exemplo de como manipular LocalTime
 */
public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
    }
}
