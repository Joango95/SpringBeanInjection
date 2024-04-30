CREATE TABLE IF NOT EXISTS user_entity (
  id SERIAL PRIMARY KEY,
  name VARCHAR (50) NOT NULL,
  email VARCHAR (50) UNIQUE,
  phone_number INTEGER NOT NULL
);


with new_users(name, email, phone_number)  as (
VALUES ('george', 'george123@gmail.com', 134234),
    ('Sam', 'sam123@gmail.com', 2345134),
    ('John', 'john123@gmail.com', 6734213),
    ('Becky', 'becky123@gmail.com', 99548454),
    ('Bob', 'bob123@gmail.com', 839087324),
    ('Susan', 'susan123@gmail.com', 38408123)
)
insert into user_entity (name, email, phone_number)
select new_users.name, new_users.email, new_users.phone_number
from new_users
where not exists (select 1
                  from user_entity
                  where user_entity.email = new_users.email
              );