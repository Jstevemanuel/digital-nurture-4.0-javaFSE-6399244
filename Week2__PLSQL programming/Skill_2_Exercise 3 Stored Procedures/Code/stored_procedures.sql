-- Scenario 1: Process Monthly Interest for Savings Accounts
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01)
  WHERE AccountType = 'Savings';
  COMMIT;
END;
/

-- Scenario 2: Update Employee Bonus by Department
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  dept_name IN VARCHAR2,
  bonus_pct IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonus_pct / 100)
  WHERE Department = dept_name;
  COMMIT;
END;
/

-- Scenario 3: Transfer Funds Between Accounts
CREATE OR REPLACE PROCEDURE TransferFunds(
  from_account IN NUMBER,
  to_account   IN NUMBER,
  amount       IN NUMBER
) IS
  insufficient_balance EXCEPTION;
BEGIN
  DECLARE
    src_balance NUMBER;
  BEGIN
    SELECT Balance INTO src_balance FROM Accounts WHERE AccountID = from_account;
    
    IF src_balance < amount THEN
      RAISE insufficient_balance;
    END IF;

    UPDATE Accounts SET Balance = Balance - amount WHERE AccountID = from_account;
    UPDATE Accounts SET Balance = Balance + amount WHERE AccountID = to_account;

    COMMIT;
  END;
EXCEPTION
  WHEN insufficient_balance THEN
    DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in source account.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/

-- Example calls (comment these in LiveSQL to run manually)
-- BEGIN
--   ProcessMonthlyInterest;
--   UpdateEmployeeBonus('IT', 10);
--   TransferFunds(101, 102, 2000);
-- END;
-- /

-- Check updated data
SELECT * FROM Accounts;
SELECT * FROM Employees;
