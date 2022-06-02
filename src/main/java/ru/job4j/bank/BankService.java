package ru.job4j.bank;

import java.util.*;

/**
 * Класс паказывает модель банковской системы
 * @author MIHAIL GORSHKOV
 * @version 1.0
 */
public class BankService {
    /**
     * Создаем карту для хранения всех пользователей системы
     * с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя
     * Пользователь добавляется после проверки,
     * что такого еще нет в системе
     * По умолчанию пользователю добавляется пустой список Account
     * для хранения счетов
     * @param user пользовател, который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет новый счет пользователю
     * Метод принимает на вход паспорные данные пользователь
     * и счет, который будет ему добавляться
     * Добавление происходит после поиска пользователься по паспорту и
     * проверки у него на отсутсвие добавляемого счета
     * @param passport номер паспорта пользователя
     * @param account номер счета пользователя
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод ищет пользователя по паспорту
     * Метод принимает на вход номер паспорта
     * в случае, если пользователь найден, метод возращает этого пользователя
     * если пользователь не найден метод возвращает null
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя или null
     */
    public Optional<User> findByPassport(String passport) {
        return  users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет пользователя по реквизитам счета
     * Метод принимает на вход номер паспорта пользователя и реквизиты его счета
     * в случае если пользователь найден формируется список его счетов, в котором
     * происходит поиск нужного
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета пользователя
     * @return возвращает счет пользователя или при отсутсвии пользователя или счета null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            return user.flatMap(t -> users.get(t)
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst());
        }
        return Optional.empty();
    }

    /**
     * Метод производит перевод денег с одного счета на другой
     * Метод принимает пять значений. Паспортные данные, реквизиты счета и сумму пользователя,
     * от которого происходит перевод. Паспортные данные и реквизиты счета пользователя,
     * которому совершается перевод
     * в случае, когда реквизиты счетов найдени и сумма на счете с которого совршается перевод
     * достаточна происходит списаниие суммы у переводящего и добавление указанной сумы получащему
     * @param srcPassport номер паспорта пользователя от которого совершается перевод
     * @param srcRequisite реквизиты счета пользователя от которого совершается перевод
     * @param destPassport номер паспорта пользователя, которому совершается перевод
     * @param destRequisite рекизиты счета пользователя, которому совершается перевод
     * @param amount сумма перевода
     * @return возвращает true если перевод совершон и false если счет не найден или
     * не достаточно средств
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
