package listChallenge;

import java.util.ArrayList;

public class MobilePhone {
  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  public boolean addNewContact(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      System.out.println("Contact is already there");
      return false;
    }
    myContacts.add(contact);
    return true;
  }

  // overload findContacts method
  private int findContact(Contact contact) {
    return this.myContacts.indexOf(contact);
  }

  private int findContact(String contactName) {
    for (int i = 0; i < this.myContacts.size(); i++) {
      Contact contact = this.myContacts.get(i) ;
      if (contact.getName().equals(contactName) {
        return i;
      }
    }
    return -1;
  }

  public boolean updateContact(Contact oldContact, Contact newContact) {
    int foundPosition = findContact(oldContact);
    if (foundPosition < 0) {
      System.out.println(oldContact.getName() + " not found");
      return false;
    } 
    this.myContacts.set(foundPosition, newContact)
    return true;
  }

  public String queryContact(Contact contact) {
    if (findContact(contact) >= 0) {
      return contact.getName();
    }
    return null;
  }

  public boolean removeContact(Contact contact) {
    int foundPosition = findContact(contact);
    if (foundPosition < 0) {
      System.out.println(contact.getName() + " not found");
      return false;
    }
    this.myContacts.remove(foundPosition);
    System.out.println(contact.getName() + " was removed");
    return true;

  }
}