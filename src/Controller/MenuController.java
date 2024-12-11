package Controller;

import Models.Contact;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        this.contactManager = new ContactManager();
        this.consoleView = new ConsoleView();
    }

    public void showMenu() {
        boolean exit = false;
        while (!exit) {
            consoleView.displayMenu();
            String option = consoleView.getInput("");
            switch (option) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printContact();
                    break;
                case "5":
                    exit = true;
                    consoleView.showMessage("Saliendo...");
                    break;
                default:
                    consoleView.showMessage("Opción inválida");
                    break;
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Ingrese Nombre: ");
        String phone = consoleView.getInput("Ingrese Teléfono: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact); // Añadir el contacto a la lista
        consoleView.showMessage("Contacto añadido.");
    }

    private void findContact() {
        String name = consoleView.getInput("Ingrese Nombre: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Ingrese Nombre: ");
        contactManager.deleteContactByName(name);
    }

    private void printContact() {
        contactManager.printList();
    }
}
