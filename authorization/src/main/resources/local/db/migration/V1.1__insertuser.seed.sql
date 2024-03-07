insert into "users".users (username, password, active, roles)
values ('sailesh', crypt('password', gen_salt('bf')),true,'ROLE:ADMIN,ROLE:USER');