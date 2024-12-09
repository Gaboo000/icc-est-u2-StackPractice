package Controller;


import Models.Contact;
import Models.LinkedList;


public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        this.contacts = new LinkedList<>();
    }

    public void addContact (Contact<?, ?> contact){
        contacts.AppendToTail(contact);
        contacts.print();
        
    }


    
    
}
