import java.time.LocalDate;

/**
 * Exemplo de como manipular LocalDate
 */

public class Exemplo011 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(ontem);
    }
}
