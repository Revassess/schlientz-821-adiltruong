CREATE TABLE APP_USER(
    user_id ID_MAKER.nextval PRIMARY KEY,
    username VARCHAR2(30),
    password VARCHAR2(30),
    first_name VARCHAR2(30),
    last_name VARCHAR2(30),
    role_id NUMBER(1),
);