package seedu.addressbook.commands;


import seedu.addressbook.common.Messages;

/**
 * Indicates which level the current AddressBook is in
 * printing the level out with a hello message.
 */
public class NameAddressBookCommand extends Command {
    public static final String COMMAND_WORD = "level";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Prints the level of the current AddressBook. \n "
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Address book level was printed";


    @Override
    public CommandResult execute() {

        return new CommandResult(Messages.MESSAGE_HELLO + "\n" + MESSAGE_SUCCESS);
    }

}
