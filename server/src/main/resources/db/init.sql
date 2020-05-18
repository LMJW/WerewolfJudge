--- store the user information
create table if not exists user (
  id integer primary key,
  name text not null,
  session text not null
);

--- store the game room information
create table if not exists room (
  id integer primary key auto increment,
  name text not null,
  addr text not null
);