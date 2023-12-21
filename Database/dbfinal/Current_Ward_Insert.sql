declare @TDatetime datetime
set @TDatetime = GETDATE();
declare @i int
set @i=126;
declare @j int
set @j=1;


While @i <= 139
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j,@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+1;

While @i <= 145
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 154
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 162
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 168
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 174
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 180
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 187
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 193
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 200
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 205
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 210
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 216
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 223
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 225
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 230
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 235
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 240
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;
set @j=@j+2;

While @i <= 250
Begin
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate)
Values (@j+Round(RAND(),0),@i, @TDatetime)
Set @i = @i+1;
End;


Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate, CW_departureDate)
Values (19,126, '7/28/2021', '2/22/2023')
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate, CW_departureDate)
Values (10,126, '2/22/2023', @TDatetime)
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate, CW_departureDate)
Values (14,162, '10/18/2020', '3/19/2023')
Insert into Current_Ward (CW_W_id,CW_B_id, CW_arrivalDate, CW_departureDate)
Values (13,162, '3/19/2023', @TDatetime)