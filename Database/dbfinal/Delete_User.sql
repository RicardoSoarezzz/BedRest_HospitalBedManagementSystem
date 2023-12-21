GO
CREATE PROCEDURE delete_user
AS
DECLARE @DAYS_TO_DELETE int = CAST((SELECT SI_code FROM Standard_Information WHERE SI_value = 'DAYS_TO_DELETE') AS int),
@DEACTIVATION_DATE datetime = (SELECT U_deactivate_date FROM User_Info WHERE U_active = 0)
BEGIN
	DELETE User_Info
	WHERE DATEADD(day, @DAYS_TO_DELETE, @DEACTIVATION_DATE) <= GETDATE()
END