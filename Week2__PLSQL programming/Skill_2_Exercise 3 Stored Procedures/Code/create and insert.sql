-- Drop tables if they exist
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Accounts';
  EXECUTE IMMEDIATE 'DROP TABLE Employees';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
/

-- Create Accounts table
CREATE TABLE Accounts (
  AccountID      NUMBER PRIMARY KEY,
  CustomerName   VARCHAR2(100),
  AccountType    VARCHAR2(20),
  Balance        NUMBER(10,2)
);

-- Create Employees table
CREATE TABLE Employees (
  EmpID          NUMBER PRIMARY KEY,
  EmpName        VARCHAR2(100),
  Department     VARCHAR2(50),
  Salary         NUMBER(10,2)
);

-- Insert sample data into Accounts
INSERT INTO Accounts VALUES (101, 'Alice', 'Savings', 10000);
INSERT INTO Accounts VALUES (102, 'Bob', 'Savings', 15000);
INSERT INTO Accounts VALUES (103, 'Charlie', 'Current', 8000);
INSERT INTO Accounts VALUES (104, 'Daisy', 'Savings', 20000);

-- Insert sample data into Employees
INSERT INTO Employees VALUES (1, 'John Doe', 'Finance', 50000);
INSERT INTO Employees VALUES (2, 'Jane Smith', 'Finance', 52000);
INSERT INTO Employees VALUES (3, 'Emma Watson', 'IT', 60000);
INSERT INTO Employees VALUES (4, 'Robert Brown', 'IT', 58000);

COMMIT;
