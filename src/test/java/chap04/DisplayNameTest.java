package chap04;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("@DisplayName 테스트")
public class DisplayNameTest {

    @DisplayName("값 같은지 비교")
    @Test
    void assertEqalsMethod() {
        System.out.println("같음");
    }

    @DisplayName("익셉션 발생 여부 테스트")
    @Test
    void assertThrowsTest() {
        System.out.println("익셉션 발생");
    }

    @Disabled
    @DisplayName("익셉션 발생 여부 테스트2")
    @Test
    void assertThrowsTest2() {
        System.out.println("익셉션 발생");
    }
}
