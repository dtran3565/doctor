/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import checkinput.CheckUserINput;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    @Test
    public void Test_NameLeightLonger50() {
        String str = "ban hien dang rat cham chi hoc mon swt cua thay pham ngoc ha nhung abcxyz";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.checkNameLenght(str, 50);

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void Test_NameLeightSmaller50() {
        String str = "abcxyz";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.checkNameLenght(str, 50);

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void Test_NameLeightEqual50() {
        String str = "abcxyzvbcsjcsjbcjsbcsjcbscbksbksckbckscmmgdjsgdjsds";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.checkNameLenght(str, 50);

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void Test_WrongDateFormat() {
        String str = "05-11-2000";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.validateJavaDate(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_RightDateFormat() {
        String str = "05/11/2000";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.validateJavaDate(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_SpecLeightLonger50() {
        String str = "sdvajkvabhvafhvbhafaiduvbưkhfbuhsrgunafbvuasdnysevf8naeufbvnasdubvusdhnvbygsdbvugauvsav"
                + "wdfbfdbdfvfdbdfbdfbzfdbszfdbsdfbsbsbsgafbafbafbsfbafvfv";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.checkSpecialization(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_SpecLeightSmaller50() {
        String str = "sdvajkvabhvafhvbhafaiduvbưkhfbuhsrgunafbvuasdnysevf";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.checkSpecialization(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_AvailabilityNotInt() {
        String str = "2.4";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isDigit(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_AvailabilityNotPositiveInt() {
        String str = "-1";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isDigit(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_AvailabilityPositiveInt() {
        String str = "2";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isDigit(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_WrongEmailFormat1() {
        String str = "svfdabdbakbffbjka";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isEmail(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_WrongEmailFormat2() {
        String str = "svfdabd@bakbffbjka";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isEmail(str);

        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void Test_WrongEmailFormat3() {
        String str = "svf+-dabd@bakb*/ffbjka.com";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isEmail(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_EmailFormat() {
        String str = "dtran3565@gmail.com";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isEmail(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_WrongPhoneFormat() {
        String str = "0866585470";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isPhoneNumber(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_WrongPhoneFormat2() {
        String str = "086-658-5470";
        
        final boolean expected = false;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isPhoneNumber(str);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_PhoneFormat() {
        String str = "(086)-658-5470";
        
        final boolean expected = true;
             
        CheckUserINput check = new CheckUserINput();

        final boolean actual  = check.isPhoneNumber(str);

        Assert.assertEquals(expected, actual);
    }
}
