package live_coding.tdd

import spock.lang.Specification

class AddressBookSpec extends Specification {

    def "Add contact"() {

        given:

        AddressBook book = new AddressBook();

        when:

        book.addContact("Alex", "Sanchez");

        then:

        book.contains("Alex", "Sanchez");

    }

    def "Add multiple contacts"() {

        given:

        AddressBook book = new AddressBook();

        when:

        book.addContact("Alex", "Sanchez");
        book.addContact("Nikolay", "Zinin");

        then:

        book.contains("Alex", "Sanchez");
        book.contains("Nikolay", "Zinin");

    }
}
