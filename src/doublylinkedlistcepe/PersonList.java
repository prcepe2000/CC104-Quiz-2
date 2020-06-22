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
public class PersonList {
    
    private Person header, trailer;
    private int size;

    public PersonList(){
        header = new Person(null, null, null);
        trailer = new Person(header, null, null);
        header.setNext(trailer);
        size = 5;
    } 
    /**
     * @return the header
     */
    public Person getHeader() {
        return header;
    }

    /**
     * @param header the header to set
     */
    public void setHeader(Person header) {
        this.header = header;
    }

    /**
     * @return the trailer
     */
    public Person getTrailer() {
        return trailer;
    }

    /**
     * @param trailer the trailer to set
     */
    public void setTrailer(Person trailer) {
        this.trailer = trailer;
    }

    /**
     * @return the size
     */
    public int size() {
        return size;
    }
    
    public boolean isEmpty(){
        return size <= 0;
    }
    
    public Person first(){
        return header.getNext();
    }
    
    public Person last(){
        return trailer.getFirstname();
    }
    
    private void addBetween(Person prevNode, Person newNode, Person nextNode){
        newNode.setPrev(prevNode);
        newNode.setNext(nextNode);
        prevNode.setNext(newNode);
        nextNode.setPrev(newNode);
        size++;
    }
    
    private void remove(Person node){
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        node.setNext(null);
        node.setPrev(null);
        size--;
    }
    
    public Person removeFirst(){
        Person temp = header.getNext();
        remove(header.getNext());
        return temp;
    }
    
    public Person removeLast(){
        Person temp = trailer.getFirstname();
        Person temp = trailer.getLastname();
        Person temp = trailer.getAddress();
        remove(trailer.getAddress());
        remove(trailer.getFirstname());
        remove(trailer.getLastname());
        return temp;
    }
    
    public void addFirst(Person newNode){
        addBetween(header, newNode, header.getNext());
    }
    
    public void addLast(Person newNode){
        addBetween(trailer.get(), newNode, trailer);
    }
    
    public void showList(){
        Person<E> tempNode = header.getNext();
        for(int i = 0; i < size; i++){
            System.out.print("[" + tempNode.getfirstname() + tempnode.getlastname() + tempnode.getaddress() + "]");
            tempNode = tempNode.getNext();
        }
    }
}
