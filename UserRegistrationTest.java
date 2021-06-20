package com.bridgelabz.regex;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    
    /**
      * Test cases for both first name and last name.
      */
    

    @Test
    public void givenValidFirstName_shouldReturnTrue() {

        boolean name = userRegistration.validateUserName("Rikesh");
        assertTrue(name);

    }

    @Test
    public void givenFirstName_whenMinimumThreeCharacter_shouldReturnTrue() {
        boolean name = userRegistration.validateUserName("Rik");
        assertTrue(name);
    }

    @Test
    public void givenFirstName_LessThanThreecharacter_shouldReturnFalse() {
        boolean name = userRegistration.validateUserName("Ri");
        assertFalse(name);
    }

    @Test
    public void givenInvalidFirstName_WithSmallChar_shouldReturnfalse() {

        boolean name = userRegistration.validateUserName("rikesh");
        assertFalse(name);
    }


    @Test
    public void givenFirstName_whenAllUpperCaseCharacter_shouldReturnFalse() {
        boolean name = userRegistration.validateUserName("RIKESH");
        assertFalse(name);
    }

    @Test
    public void givenFirstName_whenContainNumber_shouldReturnFalse() {
        boolean name = userRegistration.validateUserName("Ri786es");
        assertFalse(name);
    }
    
     @Test
    public void givenFirstName_whenContainSpecialChars_shouldReturnFalse() {
        boolean name = userRegistration.validateUserName("Ri@kesh");
        assertFalse(name);
    }
    

    /**
     * Test cases for email ID
     *
     */
    
    @Test
    public void givenEmailId_whenProper_shouldReturnTrue() {
        boolean emailId = userRegistration.validateUserEmail("chauhanrikesh786@gmail.com");
        assertTrue(emailId);
    }

    @Test
    public void givenEmailId_whenContainSymbol_shouldReturnTrue() {
        boolean emailId = userRegistration.validateUserEmail("rikesh.786@gmail.com");
        assertTrue(emailId);
    }

    @Test
    public void givenEmailId_whenContainLessThanThreeCharacter_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserName("rik@gmail.com");
        assertFalse(emailId);
    }

    @Test
    public void givenEmailId_whenNotContainGmailPart_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserEmail("rikesh@.com");
        assertFalse(emailId);
    }

    @Test
    public void givenEmailId_whenNotContainComPart_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserEmail("rikesh@gmail");
        assertFalse(emailId);
    }

    @Test
    public void givenEmailID_havingContinuousDots_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserEmail("abc..28@gmail.com");
        assertFalse(emailId);
    }

    @Test
    public void givenEmailID_lasTLDmustcontainAtLeast2char_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserEmail("abc123@gmail.c");
       assertFalse(emailId);
    }

    @Test
    public void givenEmailID_DoubleAtSymbol_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserEmail("abc@abc@gmail.com");
        assertFalse(emailId);
    }
    
     @Test
    public void givenEmailID_DotAtStart_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserEmail(".abc@abc@gmail.com");
        assertFalse(emailId);
    }
    
    @Test
    public void givenEmailID_MultipleTopLevelDomain_AtEnd_shouldReturnFalse() {
        boolean emailId = userRegistration.validateUserEmail("abc@gmail.com.aa.au");
        assertFalse(emailId);
    }


    /**
     * Test cases for Mobile Numbers.
     */
    
    
    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("+91-7676878789");
        assertTrue(mobileNumber);
    }

    @Test
    public void givenMobileNumber_whenLessThanTenDigit_shouldReturnFalse() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("+91-767687");
        assertFalse(mobileNumber);
    }

    @Test
    public void givenMobileNumber_whenContainsSpace_shouldReturnTrue() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("+91 7676876754");
        assertTrue(mobileNumber);
    }
    
      @Test
    public void givenMobileNumber_whenContainsOtherThen_SpaceHyphenandPlusSymbol_shouldReturnFalse() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("+91@7676876754");
        assertFalse(mobileNumber);
    }

    @Test
    public void givenMobileNumber_whenNoCountryCode_shouldReturnFalse() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("234878789");
        assertFalse(mobileNumber);
    }

    @Test
    public void givenMobileNumber_whengreaterthanTen_shouldReturnFalse() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("+91-85432786534");
        assertFalse(mobileNumber);
    }

    @Test
    public void givenMobileNumber_whenSpecialCharacterGiven_shouldReturnFalse() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("+91 76768@786");
        assertFalse(mobileNumber);
    }
    
    @Test
    public void givenMobileNumber_whencharactersCharacterGiven_shouldReturnFalse() {
        boolean mobileNumber = userRegistration.validateUserPhoneNumber("+91 76768a3786");
        assertFalse(mobileNumber);
    }


    /**
     * Test cases for password
     *
     */
    @Test
    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean password = userRegistration.validateUserPassword("@Mercy123");
        assertTrue(password);
    }

    @Test
    public void givenPassword_whenLessThanEightCharacter_shouldReturnFalse() {
        boolean password = userRegistration.validateUserPassword("Silv@12");
        assertFalse(password);
    }


    @Test
    public void givenPassword_whenNotContainUpperCase_shouldReturnFalse() {
        boolean password = userRegistration.validateUserName("rikes76#");
        assertFalse(password);
    }

   

    @Test
    public void givenPassword_whenNotContainNumber_shouldReturnFalse() {
        boolean password = userRegistration.validateUserPassword("rikeSH#W");
        assertFalse(password);
    }

  

    @Test
    public void givenPassword_whenContainNoSpecialCharacter_shouldReturnFalse() {
        boolean password = userRegistration.validateUserPassword("Riki45eh");
        assertFalse(password);
    }
}

