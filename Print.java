
public class Print {
    public static void main(String[] args) {

        // println -> imprime e pula para a próxima linha
        System.out.println("Olá, este é um exemplo de impressão com println");
        System.out.println("Cada println começa em uma nova linha");

        // print -> imprime sem quebrar a linha
        System.out.print("Este texto não quebra linha... ");
        System.out.println("continua aqui na mesma linha!");

        // Linha em branco
        System.out.println();
        System.out.println();

        //Misturando print e println
        System.out.print("Nome: "); 
        System.out.println("João Silva");

        System.out.print("Idade: ");
        System.out.println(30);

        System.out.print("Cidade: ");
        System.out.println("Goiânia");

        //Impressões formatadas
        System.out.println();
        System.out.println("Resultado:");
        System.out.println("5 + 5 = " + (5 + 5));

        //Finalizado
        System.out.println();
        System.out.println("Impressões concluídas!");












    }
}