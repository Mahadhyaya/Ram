DELIMITER //

create procedure abr (IN vid varchar(20), 
IN vname varchar(20), 
IN age int(10), 
IN city varchar(20))

begin
declare msg varchar(20);
if age >= 18 then
insert into Voter (vid, vname, age, city) values (vid, vname, age, city);
set msg="Row Inserted";
else
set msg="Voter not Eligible";
end if;
select msg;
end //
DELIMITER ;
