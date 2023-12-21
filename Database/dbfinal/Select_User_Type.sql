GO
CREATE PROCEDURE get_users_by_type @TYPE_ID bigint
AS
BEGIN
    SELECT D_name, UT_name, U_name, U_badge, U_mail
        FROM User_Type INNER JOIN(
        	SELECT D_name, U_name, U_badge, U_mail, U_UT_id
        	FROM dbo.User_Info INNER JOIN Department
        	ON U_D_id = D_id) as info
        ON UT_id = U_UT_id
        WHERE UT_id = @TYPE_ID
END