package seedu.addressbook.commands;

import org.junit.Test;
import seedu.addressbook.common.Messages;

import static org.junit.Assert.assertEquals;

public class NameAddressBookCommandTest {

    /**
     * Tests if the NameAddressBookCommand class works
     */
    @Test
    public void testNameAddressBookCommand() {
        NameAddressBookCommand command = new NameAddressBookCommand();
        CommandResult result = command.execute();

        assertEquals(Messages.MESSAGE_HELLO + "\n" + NameAddressBookCommand.MESSAGE_SUCCESS, result.feedbackToUser);
    }
}
