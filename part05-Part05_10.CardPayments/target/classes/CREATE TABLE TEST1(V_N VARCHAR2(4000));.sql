CREATE TABLE TEST1(V_N VARCHAR2(4000));

DECLARE
    V_PRODUCT_NAME PRODUCT_INFORMATION.PRODUCT_NAME%TYPE;
    V_LIST_PRICE PRODUCT_INFORMATION.LIST_PRICE%TYPE;
BEGIN
  SELECT PRODUCT_NAME, LIST_PRICE INTO V_PRODUCT_NAME,V_LIST_PRICE FROM PRODUCT_INFORMATION
     WHERE PRODUCT_ID=1797;
  DBMS_OUTPUT.PUT_LINE(V_PRODUCT_NAME||' HAS A PRICE OF '||V_LIST_PRICE);
END;
/      

DECLARE
  TYPE V_PROD IS RECORD(
      PRODUCT_NAME PRODUCT_INFORMATION.PRODUCT_NAME%TYPE,
      LIST_PRICE PRODUCT_INFORMATION.LIST_PRICE%TYPE,
      CATEGORY_ID PRODUCT_INFORMATION.CATEGORY_ID%TYPE
  );
  P1 V_PROD;
BEGIN
 SELECT PRODUCT_NAME, LIST_PRICE,CATEGORY_ID INTO P1 FROM PRODUCT_INFORMATION
     WHERE PRODUCT_ID=1797;
  DBMS_OUTPUT.PUT_LINE(P1.PRODUCT_NAME||' HAS A PRICE OF '||P1.LIST_PRICE||' IS FROM CATEGORY '||P1.CATEGORY_ID);
END;
/

DECLARE  
  P1 PRODUCT_INFORMATION%ROWTYPE;
BEGIN
 SELECT * INTO P1 FROM PRODUCT_INFORMATION
     WHERE PRODUCT_ID=1797;
  DBMS_OUTPUT.PUT_LINE(P1.PRODUCT_NAME||' HAS A PRICE OF '||P1.LIST_PRICE||' IS FROM CATEGORY '||P1.CATEGORY_ID);
END;
/

DECLARE
  V_DIGITS VARCHAR2(50):='8925789A275B892343';
  V_ODD NUMBER:=0;
  V_EVEN NUMBER DEFAULT 0;
  V_OTHERS VARCHAR2(30);
  N CHAR;
BEGIN
  FOR I IN 1..LENGTH(V_DIGITS) LOOP
    N:= SUBSTR(V_DIGITS,I,1);
    DBMS_OUTPUT.PUT_LINE(I||'->'||N);
    IF N NOT BETWEEN '1' AND '9' THEN
      --CONTINUE; -- SKIPS TO THE NEXT I
      V_OTHERS:=V_OTHERS||N;
    ELSIF N MOD 2 = 0 THEN
      V_EVEN:=V_EVEN+N;
    ELSE
      V_ODD:=V_ODD+N;
    END IF;   
    
  END LOOP;
  DBMS_OUTPUT.PUT_LINE('EVEN SUM: '||V_EVEN) ;
  DBMS_OUTPUT.PUT_LINE('ODD SUM: '||V_ODD);
  DBMS_OUTPUT.PUT_LINE(V_OTHERS);
   EXCEPTION 
     WHEN OTHERS THEN
     DBMS_OUTPUT.PUT_LINE('AN EXCEPTION');
END;
/

DECLARE 

V_GRADE NUMBER(2) := 8 ;

BEGIN

IF V_GRADE<5 THEN
DBMS_OUTPUT.PUT_LINE('FAILED');
DBMS_OUTPUT.PUT_LINE('STUDY HARDER');
ELSE
DBMS_OUTPUT.PUT_LINE('PASSED');
DBMS_OUTPUT.PUT_LINE('CONGRATS');
END IF;
END;
/