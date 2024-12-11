package Controller;

import Materia.Models.NodeGeneric;
import Models.Contact;
import Models.LinkedList;
import View.ConsoleView;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;
    private ConsoleView consoleView;

    public ContactManager() {
        this.contacts = new LinkedList<>();
        this.consoleView = new ConsoleView();
    }

    public void addContact(Contact<?, ?> contact) {
        this.contacts.AppendToTail(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();

        while (current != null) {
            if (current.getValue().getName() instanceof String && ((String) current.getValue().getName()).equalsIgnoreCase(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteContactByName() {
        String name = consoleView.getInput("Enter a name to delete ");
        deleteContactByName(name);
    }

    public void deleteContactByName(String name) {
        NodeGeneric<Contact<?, ?>> current = contacts.getHead();
        NodeGeneric<Contact<?, ?>> previous = null;

        if (current == null) {
            return;
        }

        if (current.getValue().getName() instanceof String && ((String) current.getValue().getName()).equalsIgnoreCase(name)) {
            contacts.setHead(current.getNext());
            contacts.setSize(contacts.getSize() - 1);
            System.out.println("Contacto eliminado: " + name);
            return;
        }

        while (current != null) {
            if (current.getValue().getName() instanceof String && ((String) current.getValue().getName()).equalsIgnoreCase(name)) {
                if (previous != null) {
                    previous.setNext(current.getNext());
                }
                contacts.setSize(contacts.getSize() - 1);
                System.out.println("Contacto eliminado: " + name);
                return;
            }
            previous = current;
            current = current.getNext();
        }

        System.out.println("Contacto no encontrado: " + name);
    }

    public void findContactByNameCommand() {
        String name = consoleView.getInput("Enter a name to find ");
        Contact<?, ?> contact = findContactByName(name);
        if (contact != null) {
            System.out.println("Contacto encontrado: " + contact);
        } else {
            System.out.println("Contacto no encontrado: " + name);
        }
    }

    public void printList() {
        contacts.print();
    }
}
