# PP_3_1_5 DESCRIPTION #


### 1. DB URL: ###

spring.datasource.url=jdbc:mysql://localhost:3306/spring_security_project

------------------------------------------------------

### 2. Added users: ###

a) (ROLE_ADMIN) login: admin@mail.com password: admin
   
b) (ROLE_USER) login: user@mail.com password: user

c) (ROLE_USER) login: user2@mail.com password: user

------------------------------------------------------

### 3. Edit's from task 3.1.4: ###

***Учти в следующей задаче:***

> • • Транзакции - только на изменение в БД. На чтение не используются (в крайнем случае установи параметр readonly).

++

> • Почитай про @PatchMapping, DeleteMapping и т.д., лучше использовать их

++

> • Для ролей вместо Collection уместней был бы Set

++

------------------------------------------------------
