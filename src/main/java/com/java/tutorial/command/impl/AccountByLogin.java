package com.java.tutorial.command.impl;

import com.java.tutorial.command.Command;
import com.java.tutorial.devObjs.Page;
import com.java.tutorial.entities.Account;
import com.java.tutorial.entities.UserType;
import com.java.tutorial.exceptions.DAOException;
import com.java.tutorial.exceptions.ServiceException;
import com.java.tutorial.service.impl.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

public class AccountByLogin implements Command {

    private AccountService accountService;

    public AccountByLogin(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public Page execute(HttpServletRequest request) throws ServiceException{
        Page page = new Page("/pages/admin_login.jsp", true);
        List<Account> accountList = new ArrayList<>();
        Account account = new Account();
        account.setUserName(request.getParameter("userName"));
        account.setPassword(request.getParameter("password"));
        account = accountService.login(account);
        accountList = accountService.accountSorting(account);
        HttpSession session = request.getSession();
        session.setAttribute("accountList", accountList);
        session.setAttribute("account", account);
        return page;
    }
}
