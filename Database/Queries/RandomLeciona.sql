Declare @L_P_COD int
Declare @L_UC_COD int
Declare @L_DESDE date
Declare @L_ATE date
Declare @random int

Declare @LowerLimitForL_UC_COD int
Declare @UpperLimitForL_UC_COD int

Set @LowerLimitForL_UC_COD = 0
Set @UpperLimitForL_UC_COD = 20


Declare @LowerLimitForL_P_COD int
Declare @UpperLimitForL_P_COD int

Set @LowerLimitForL_P_COD = 0
Set @UpperLimitForL_P_COD = 11 


Declare @count int
Set @count = 1

While @count <= 100
Begin 

   Select @L_UC_COD = Round(((@UpperLimitForL_UC_COD - @LowerLimitForL_UC_COD) * Rand()) + @LowerLimitForL_UC_COD, 0)
   Select @L_P_COD= Round(((@UpperLimitForL_P_COD - @LowerLimitForL_P_COD) * Rand()) + @LowerLimitForL_P_COD, 0)
   Select @random = CAST(RAND(CHECKSUM(NEWID()))*6 as int)+1
   Select @L_DESDE = 
   CASE
		when @random = 1 then
		'2021-09-01'
		when @random = 2 then
		'2022-03-01'
		when @random = 3 then
		'2022-09-01'
		when @random = 4 then
		'2023-03-01'
		when @random = 5 then
		'2023-09-01'
		when @random = 6 then
		'2024-03-01'
   END
   Select @L_ATE = 
   CASE
		when @random = 1 then
		'2022-06-30'
		when @random = 2 then
		'2022-06-30'
		when @random = 3 then
		'2022-06-30'
		when @random = 4 then
		'2022-06-30'
		when @random = 5 then
		'2024-06-30'
		when @random = 6 then
		'2024-06-30'
   END
   Insert Into LECIONA values ('UC'+CAST(@L_UC_COD as nvarchar), 'P'+CAST(@L_P_COD as nvarchar), @L_DESDE,@L_ATE)
   Print @count
   Set @count = @count + 1
End