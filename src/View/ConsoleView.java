package View;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("=== Menú de Contactos ===");
        System.out.println("1. Agregar Contacto");
        System.out.println("2. Encontrar Contacto");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Imprimir Contactos");
        System.out.println("5. Salir");
        System.out.print("Elija una opción: ");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println("-- " + message);
    }
}
