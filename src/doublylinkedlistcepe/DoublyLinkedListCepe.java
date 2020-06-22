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
public class DoublyLinkedListCepe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person<String> node1 = new Person(null, "node1", null);
        Person<String> node2 = new Person(null, "node2", null);
        Person<String> node3 = new Person(null, "node3", null);
        
        PersonList<Person> list = new PersonList<>();
        list.addFirst(node1);
        list.addFirst(node2);
        list.addLast(node3);
        
        System.out.println("Before Remove");
        list.showList();
        
        
        System.out.println("\nAfter Remove First");
        System.out.println("Removed: " + list.removeFirst().getElement());
        list.showList();
        
        System.out.println("\nAfter Remove Last");
        System.out.println("Removed: " + list.removeLast().getElement());
        list.showList();
    }
    
}
