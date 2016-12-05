package live_coding.tdd

import spock.lang.Specification

class ContactSpec extends Specification {

    def 'Create new contact' () {

        when: 'a contact is created'

        Contact contact = new Contact("Alex", "Sanchez");

        then:

        contact.getFirstName() == "Alex";
        contact.getLastName() == "Sanchez";

    }

    def 'Create new contact with email' () {

        when: 'a contact with email is created'

        Contact contact = new Contact("Alex", "Sanchez", "alex@alex.com");

        then:

        contact.getFirstName() == "Alex";
        contact.getLastName() == "Sanchez";
        contact.getEmailAddress() == "alex@alex.com"

    }

    def "Set email address" () {

        given: 'a contact'

        Contact contact = new Contact("Bruce", "Wayne");

        when: 'when the email adress is set'

        contact.setEmailAddress("batman@gotham.com");

        then:

        contact.getEmailAddress() == "batman@gotham.com"
    }

    def "Rename contact" () {

        given:

        Contact contact = new Contact("Clark", "Kent");

        when: "the contact renamed"

        contact.rename("Super", "Man");

        then:

        contact.getFirstName() == "Super"
        contact.getLastName() == "Man"
    }
}
