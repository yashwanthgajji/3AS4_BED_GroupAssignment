# 3AS4_BED_GroupAssignment
- Great Learning Backend Development Group Assignment.

# Group Details :
- Group Name: 3A-S4
- Group Members:
    1. Yashwanth Gajji
    2. Diksha Shubhangi
    3. Neha Mangulkar

# Steps to run the project :
1. Download the code zip file.
2. Run the application.
3. Go to localhost:8080/h2-console.
4. Add the below insert statements and run.
    - insert into roles values(1, 'ROLE_ADMIN');
    - insert into roles values(2, 'ROLE_USER');
    
    - insert into users values('siteadmin', 1, 'admin');
    - insert into users values('siteuser', 1, 'user');

    - insert into authorities values('siteadmin', 1);
    - insert into authorities values('siteadmin', 2);
    - insert into authorities values('siteuser', 2);
5. Now access the application(localhost:8080).
6. It will open a login page. Use below credentials for different access level.
    - User - 1 :
        - username: siteadmin
        - password: admin
        - access-level: ADMIN
    - User - 2 :
        - username: siteuser
        - password: user
        - access-level: USER
7. Now open Swagger UI (localhost:8080/swagger-ui.html) to access different api points(Employee, Role, User).
