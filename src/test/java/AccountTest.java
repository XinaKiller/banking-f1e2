import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account1;

    @BeforeEach
    void beforeEach() {
        account1 = new Account("Alberto", 23, 5000, 1);
    }

    @Test
    void testAccountGetters() {
        assertAll(
                () -> assertEquals("Alberto", account1.getClientName()),
                () -> assertEquals(23, account1.getClientAge()),
                () -> assertEquals(5000, account1.getClientBalance()),
                () -> assertEquals(1, account1.getClientNrChildren())
        );
    }

    @Test
    void testAccountSetters() {

        account1.setClientName("Patrick");
        account1.setClientAge(24);
        account1.setClientBalance(10);
        account1.setClientNrChildren(5);

        assertAll(
                () -> assertEquals("Patrick", account1.getClientName()),
                () -> assertEquals(24, account1.getClientAge()),
                () -> assertEquals(10, account1.getClientBalance()),
                () -> assertEquals(5, account1.getClientNrChildren())
        );
    }

    @RepeatedTest(10)
    void testAccountDeposit(RepetitionInfo repetitionInfo) {
        for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
            account1.deposit(50);
            assertEquals(5050 + (i * 50), account1.getClientBalance());
        }
    }

    @Test
    void testAccountWithdrawal() {
        account1.withdraw(500);
        assertEquals(4500, account1.getClientBalance());
    }
}