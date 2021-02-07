package com.java.tutorial.command;

import com.java.tutorial.command.impl.AccountByLogin;
import com.java.tutorial.command.impl.account.CreateAccount;
import com.java.tutorial.service.impl.AccountService;

public class CommandFactory {

    public static Command getCommand(String commandType) {
        switch (commandType) {
            case "command_register":
                return new CreateAccount(new AccountService());
            case "command_login":
                return new AccountByLogin(new AccountService());
            default:return null;
        }
    }
}
