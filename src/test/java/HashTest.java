import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.Main.nickname;


public class HashTest {
    @Test
    void testNickname() {
        Assertions.assertEquals("The nickname of matthew is matt", nickname("matt"));
    }
}
