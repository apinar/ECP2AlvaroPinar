package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
private User usr;

@Before
public void before() {
    usr = new User(1,"David", "Perez");
}


@Test
public void testUserIntStringString(){
	assertEquals(1, usr.getNumber());
    assertEquals("David", usr.getName());
    assertEquals("Perez", usr.getFamilyName());
}

@Test
public void testFullName(){
	assertEquals("David Perez", usr.fullName());	
}

@Test
public void testInitials(){
	assertEquals("D.", usr.initials());
	
}

@Test
public void testUpper(){
	assertEquals("DAVID PEREZ", usr.upper());
	
}

}
