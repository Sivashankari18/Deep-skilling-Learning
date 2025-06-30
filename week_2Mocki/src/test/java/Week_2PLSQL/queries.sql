
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Customers';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
/

CREATE TABLE Customers (
  CustomerID NUMBER,
  Name VARCHAR2(50),
  Age NUMBER,
  LoanInterestRate NUMBER(5,2)
);

INSERT INTO Customers VALUES (1, 'John', 65, 7.5);
INSERT INTO Customers VALUES (2, 'Alice', 45, 8.0);
INSERT INTO Customers VALUES (3, 'Bob', 70, 6.5);


BEGIN
  FOR customer_rec IN (SELECT * FROM Customers) LOOP
    IF customer_rec.Age > 60 THEN
      UPDATE Customers
      SET LoanInterestRate = LoanInterestRate - 1
      WHERE CustomerID = customer_rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/


SELECT * FROM Customers;