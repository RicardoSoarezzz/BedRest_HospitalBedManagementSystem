declare @TDatetime datetime
set @TDatetime = GETDATE();
declare @i int
set @i=126;
declare @j int
set @j=1;

While @i<=250
Begin
Insert into Records (R_B_id,R_S_id,R_startDate)
Values (@i,(Select B_S_id from Bed Where B_id=@i),@TDatetime)
set @i = @i+1;
End;

Insert into Records (R_B_id, R_S_id, R_startDate, R_actualEndDate, R_expectedEndDate)
values (246, 2, dateadd(dd, - 3, @TDatetime), dateadd(mi, - 60, @TDatetime),dateadd(mi, - 60, @TDatetime))
Insert into Records (R_B_id,R_S_id,R_startDate, R_actualEndDate, R_expectedEndDate)
values (246, 3, dateadd(mi, - 60, @TDatetime), dateadd(mi, - 15, @TDatetime),dateadd(mi, - 15, @TDatetime))
Insert into Records (R_B_id,R_S_id,R_startDate, R_actualEndDate, R_expectedEndDate)
values (246, 4, dateadd(mi, - 15, @TDatetime), @TDatetime, @TDatetime)

Insert into Records (R_B_id,R_S_id,R_startDate, R_actualEndDate, R_expectedEndDate)
values (248, 2, dateadd(dd, - 5, @TDatetime), dateadd(mi, - 1500, @TDatetime),dateadd(mi, - 1500, @TDatetime))
Insert into Records (R_B_id,R_S_id,R_startDate, R_actualEndDate, R_expectedEndDate)
values (248, 3, dateadd(mi, - 1500, @TDatetime), dateadd(mi, - 1385, @TDatetime),dateadd(mi, - 1385, @TDatetime))
Insert into Records (R_B_id,R_S_id,R_startDate, R_actualEndDate, R_expectedEndDate)
values (248, 4, dateadd(mi, - 1385, @TDatetime), dateadd(mi, - 1370, @TDatetime),dateadd(mi, - 1370, @TDatetime))

Update Records
Set R_startDate=dateadd(mi, - 1370, @TDatetime)
Where R_B_id=248 and R_S_id=5


