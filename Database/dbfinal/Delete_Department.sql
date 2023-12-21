GO
CREATE PROCEDURE delete_department
AS
DECLARE @DAYS_TO_DELETE int = CAST((SELECT SI_code FROM Standard_Information WHERE SI_value = 'DAYS_TO_DELETE') AS int),
@DEACTIVATION_DATE datetime = (SELECT D_deactivate_date FROM Department WHERE D_active = 0)
BEGIN
	DELETE Department
	WHERE DATEADD(day, @DAYS_TO_DELETE, @DEACTIVATION_DATE) <= GETDATE()
END