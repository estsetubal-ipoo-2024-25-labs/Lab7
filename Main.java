import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // TODO: Instanciar um jornal com um nome à sua escolha

        while (continuar) {
            System.out.println("\nMenu de Gestão do Jornal:");
            System.out.println("1. Mostrar informação jornal (toString)");
            System.out.println("2. Adicionar nova notícia");
            System.out.println("3. Alterar título de uma notícia");
            System.out.println("4. Alterar texto de uma notícia");
            System.out.println("5. Publicar uma notícia");
            System.out.println("6. Mostrar notícias publicadas");
            System.out.println("7. Mostrar todas as notícias");
            System.out.println("8. Mostrar notícias de um autor");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // consumir o '\n' remanescente para não afetar leituras subsequentes

            switch (option) {
                case 0:
                    continuar = false;
                    break;

                case 1:
                    // TODO
                    break;

                case 2:
                    System.out.print("Autor: ");
                    String author = scanner.nextLine();
                    System.out.print("Título: ");
                    String title = scanner.nextLine();
                    System.out.print("Texto: ");
                    String text = scanner.nextLine();
                    // TODO

                    break;

                case 2:
                    System.out.print("ID da notícia: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Novo texto: ");
                    String newText = scanner.nextLine();
                    // TODO

                    break;

                case 3:
                    // TODO
                    break;

                case 4:
                    // TODO
                    break;

                case 5:
                    // TODO
                    break;

                case 6:
                    // TODO
                    break;

                case 7:
                    // TODO
                    break;

                case 8:
                    // TODO
                    break;

                default:
                    System.out.println("[Opção inválida. Tente novamente.]");
            }
        }

        System.out.println("[Programa terminado.]");

    }
}