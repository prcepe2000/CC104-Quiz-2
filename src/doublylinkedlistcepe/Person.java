/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlistcepe;

/**
 *
 * @author username
 */
public class Person {
    private String firstname, lastname, address;
    private Person next;
    
    public Person(String firstname, String lastname, String address, Person next){
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.next = next;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the next
     */
    public Person getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Person next) {
        this.next = next;
    }

    Object getPrev() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
