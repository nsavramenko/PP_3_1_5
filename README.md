# PP_3_1_4 DESCRIPTION #


### 1. DB URL: ###

spring.datasource.url=jdbc:mysql://localhost:3306/spring_security_project

------------------------------------------------------

### 2. Added users: ###

a) (ROLE_ADMIN) login: admin@mail.com password: admin
   
b) (ROLE_USER) login: user@mail.com password: user

c) (ROLE_USER) login: user2@mail.com password: user

------------------------------------------------------

### 3. Edit's from task 3.1.3: ###

***Исправь в следующей задаче:***

> • Не надо указывать JoinTable с двух сторон связи 

++

> • Нужно ли явно указывать LAZY для ManyToMany? 

++ Нет, так как @ManyToMany  default-type -> Lazy loading

> • У ролей аннотация Table не нужна 

++

------------------------------------------------------
