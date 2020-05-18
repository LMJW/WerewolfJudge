-- This file will be automatically picked up by the spring boot framework and it
-- will be executed when initialize the db.

insert into user(id, name, session) values(0, 'Demo user', 'this is a super secret token');
insert into room(id, name, addr) values(0, 'Demo room', 'first room');