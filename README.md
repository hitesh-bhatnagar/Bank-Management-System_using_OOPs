# 💳 Bank Management System (Java OOP)

A simple and modular **Bank Management System** implemented in Java using Object-Oriented Programming (OOP) principles. The system demonstrates the use of inheritance, polymorphism, encapsulation, and abstraction.

---

## 📌 Features

- Create and manage multiple types of bank accounts
- Deposit and withdraw funds with account-specific rules
- Add interest to savings accounts
- Allow overdraft in current accounts
- Transfer funds between accounts
- Display account balances
- Demonstrates use of collections and polymorphism

---

## 🧱 Class Structure

### 🔹 `Account` *(Base Class)*
Represents a generic bank account and includes:

- `accountNumber` – Unique account identifier  
- `accountHolder` – Name of the account holder  
- `balance` – Current balance  

**Key Methods:**
- `deposit(double amount)`
- `withdraw(double amount)`
- `checkBalance()`

---

### 🔹 `SavingsAccount` *(Subclass of Account)*
Adds an **interest rate** and ability to accrue interest.

**Additional Property:**
- `interestRate`

**New Method:**
- `addInterest()` – Calculates and adds interest to the balance

---

### 🔹 `CurrentAccount` *(Subclass of Account)*
Supports **overdraft** functionality.

**Additional Property:**
- `overdraftLimit`

**Overridden Method:**
- `withdraw(double amount)` – Allows balance to go negative within overdraft limit

---

### 🔹 `Bank` *(Manager Class)*
Manages a **collection of Account objects** (both savings and current). Demonstrates **polymorphism** by treating all account types as `Account` objects.

**Key Methods:**
- `addAccount(Account account)`
- `findAccount(String accountNumber)`
- `transferFunds(String fromAccountNumber, String toAccountNumber, double amount)`

---

## 🚀 How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/bank-management-system.git
   cd bank-management-system
2. Compile the files
   ```bash
   javac *.java
3. Run the program
   ```bash
   java main

## 🧪 Sample Usage (from Main.java)
```bash
  public class Main {
      public static void main(String[] args) {
          Bank bank = new Bank();
  
          savingsAccount savings = new savingsAccount("SA123","Bokachan",5000,2.5);
  
          currentAccount current = new currentAccount("CA453","Shiro",100000,2000);
  
          bank.addAccounts(savings);
          bank.addAccounts(current);
  
          savings.deposit(1000);
          current.withdraw(1500);
  
          savings.addInterest();
  
          bank.transferFunds("SA123", "CA453", 300);
          savings.checkBalance();
          current.checkBalance();
      }
  }
```

## 📚 OOP Concepts Used

* Encapsulation: Private fields with public getters/setters and methods
* Inheritance: SavingsAccount and CurrentAccount extend Account
* Polymorphism: Bank manages accounts using the Account reference type
* Abstraction: Generalized behaviors in base class, specialized in subclasses

## 📂 Project Structure
├── Account.java
├── SavingsAccount.java
├── CurrentAccount.java
├── Bank.java
└── Main.java
