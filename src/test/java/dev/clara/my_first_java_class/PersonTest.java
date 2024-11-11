package dev.clara.my_first_java_class;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testPersonAttributes() {
        Person person = new Person("Clara", "Vilera", "123456789", 1978, "Venezuela", 'M');

        
        assertEquals("Clara", person.getFirstName());
        assertEquals("Vilera", person.getLastName());
        assertEquals("123456789", person.getIdNumber());
        assertEquals(1978, person.getBirthYear());
        assertEquals("Venezuela", person.getBirthCountry());
        assertEquals('M', person.getGender());

    }

    
}
