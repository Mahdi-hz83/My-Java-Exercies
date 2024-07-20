package Members;

import GymClass.GymClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberTest {
    private Member standardMember;
    private Member premiumMember;
    private GymClass yogaClass;
    private GymClass pilatesClass;

    @Before
    public void setUp(){
        this.standardMember = new StandardMember("John Stam" , "J102");
        this.premiumMember = new PremiumMember("Ali Reihani" , "A206");
        this.yogaClass = new GymClass("Y101","Yoga","Monday 6PM",50.0,true);
        this.pilatesClass = new GymClass("P201" , "Pilates", "Saturday 8AM",20.0,false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegative(){
        this.standardMember.deposit(-1);
    }

    @Test
    public void testDepositPositive(){
        this.standardMember.deposit(50.0);
        assertEquals(50.0 , standardMember.accountBalance);
    }

    @Test
    public void testClassRegistrationStandardMember(){
        standardMember.registerToClass(yogaClass);
        assertTrue(yogaClass.getRegisteredMembers().contains(standardMember));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnavailableClassRegistrationStandardMember(){
        standardMember.registerToClass(pilatesClass);
    }

    @Test
    public void testClassRegistrationPremiumMember(){
        premiumMember.registerToClass(yogaClass);
        premiumMember.registerToClass(pilatesClass);
        assertTrue(pilatesClass.getRegisteredMembers().contains(premiumMember));
        assertTrue(yogaClass.getRegisteredMembers().contains(premiumMember));
    }

}