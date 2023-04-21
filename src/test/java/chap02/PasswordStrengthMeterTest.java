package chap02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthMeterTest {

    private PasswordStrengthMeter meter = new PasswordStrengthMeter();
    private void assertStrength(String password, PasswordStrength strength) {
        PasswordStrength result = meter.meter(password);
        assertEquals(strength, result);
    }
    @Test
    void meetsAllCriteria_Then_Strong() {
        assertStrength("asda122!AB", PasswordStrength.STRONG);
        assertStrength("abc1!Add", PasswordStrength.STRONG);
    }

    @Test
    void meetsOtherCriteria_except_for_Length_Then_Nomal() {
        assertStrength("ab!aaa11@", PasswordStrength.NORMAL);
    }

    @Test
    void meetsOtherCriteria_except_for_Number_Then_Normal() {
       assertStrength("ab!@ABaaaaaa", PasswordStrength.NORMAL);
    }

    @Test
    void nullInput_Then_Invalid() {
        assertStrength(null, PasswordStrength.INVALID);
    }

    @Test
    void meetsOtherCriteria_except_for_Uppercase_Then_Normal() {
        assertStrength("ab12!@df", PasswordStrength.NORMAL);
    }

    @Test
    void meetsOnlyLengthCriteria_Then_Weak() {
        assertStrength("abcdefghi", PasswordStrength.WEAK);
    }

    @Test
    void meetsOnlyNumCriteria_Then_Weak() {
        assertStrength("12345", PasswordStrength.WEAK);
    }

    @Test
    void meetsOnlyUpperCriteia_Then_Weak() {
        assertStrength("ABCDEF", PasswordStrength.WEAK);
    }
}
