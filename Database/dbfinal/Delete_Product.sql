GO
CREATE PROCEDURE delete_product
AS
DECLARE @DAYS_TO_DELETE int = CAST((SELECT SI_code FROM Standard_Information WHERE SI_value = 'DAYS_TO_DELETE') AS int),
@DEACTIVATION_DATE datetime = (SELECT P_deactivate_date FROM Product WHERE P_active = 0)
BEGIN
	DELETE Product
	WHERE DATEADD(day, @DAYS_TO_DELETE, @DEACTIVATION_DATE) <= GETDATE()
END