import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//@RunWith(Parameterized.class)
public class UserRegistrationTest {

    @Test
    public void whenGivenFirstNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkFirstName("Pooja"));

    }

    @Test
    public void whenGivenFirstNameShouldReturnTrueFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkFirstName("Bob"));
    }


    @Test
    public void whenGivenFirstNameShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkFirstName("pooja"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnFalseFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkFirstName("KK"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnFalseSecond() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkFirstName("poOja"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnFalseThird() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkFirstName("Pooja123"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnFalseForth() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkFirstName("Pooja@123"));
    }

    @Test
    public void whenGivenFirstNameShouldReturnFalseFifth() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkFirstName("POOJA"));
    }

    @Test
    public void whenGivenLastNameShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkLastName("Todkar"));
    }

    @Test
    public void whenGivenLastNameShouldReturnTrueFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkLastName("Tom"));
    }

    @Test
    public void whenGivenLastNameShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkLastName("todkar"));
    }

    @Test
    public void whenGivenLastNameShouldReturnFalseFirst() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkLastName("MM"));
    }

    @Test
    public void whenGivenLastNameShouldReturnFalseSecond() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkLastName("chile@123"));
    }

    @Test
    public void whenGivenLastNameShouldReturnFalseThird() {
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkLastName("todkar@123"));
    }


//    @Parameterized.Parameters
//    public static Collection whenGivenEmailShouldReturnTrue() {
//        UserRegistration userRegistration = new UserRegistration();
//
//        return Arrays.asList(new Object[][]{
//                {"pooja@bridgelabz.com",true},
//                {"pooja.todkar@gmail.com",true},
//                {"pooja.todkar12@gmail.com",true},
//                {"abc.100@abc.com.in",true},
//                {"abc@1.com",true},
//                {"abc+100@gmail.com",true}
//        });
//
//    }

    @Test
    public void whenGivenEmailShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkEmail("abc"));
        assertFalse(userRegistration.checkEmail("abc@.com.my"));
        assertFalse(userRegistration.checkEmail("abc123@gmail.a"));
        assertFalse(userRegistration.checkEmail("abc123@.com"));
        assertFalse(userRegistration.checkEmail("abc123@.com.com"));
        assertFalse(userRegistration.checkEmail(".abc@abc.com"));
        assertFalse(userRegistration.checkEmail("abc()*@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc@%*.com"));
        assertFalse(userRegistration.checkEmail("abc..2002@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc.@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc@abc@gmail.com"));
        assertFalse(userRegistration.checkEmail("abc@gmail.com.1a"));
        assertFalse(userRegistration.checkEmail("abc@gmail.com.aa.au"));
    }

    @Test
    public void whenGivenNumberShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkMobileNumber("91 9822081280"));
    }

    @Test
    public void whenGivenNumberShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkMobileNumber("98081280"));
    }

    @Test
    public void whenGivenNumberShouldReturnFalseFirst(){
        UserRegistration userRegistration = new UserRegistration();

        assertFalse(userRegistration.checkMobileNumber("980812abc"));
    }

    @Test
    public void whenGivenNumberShouldReturnFalseSecond(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkMobileNumber("980812895632"));
    }

    @Test
    public void whenGivenNumberShouldReturnTrueFirst(){

        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkMobileNumber("9822081280"));

    }

    @Test
    public void whenGivenPasswordShouldReturnTrue(){
        UserRegistration userRegistration = new UserRegistration();

        assertTrue(userRegistration.checkPassword("PooJaqwe"));
    }

    @Test
    public void whenGivenPasswordShouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();
        assertFalse(userRegistration.checkPassword("Poojaqwes@123"));
    }


}

