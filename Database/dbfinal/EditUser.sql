GO
CREATE PROCEDURE edit_user @USER_ID bigint,@DEPARTMENT_ID bigint, @TYPE_ID bigint, @PASSWORD nvarchar(50), @NAME nvarchar(50),@MD5 nvarchar(50), @badge nvarchar(20), @MAIL nvarchar(50)
AS
BEGIN
	UPDATE User_info
	SET U_D_id=@DEPARTMENT_ID, U_UT_id=@TYPE_ID, U_password=@PASSWORD, U_name=@NAME, U_MD5=@MD5, U_badge=@badge, U_mail=@MAIL
	WHERE @USER_ID=U_id
END