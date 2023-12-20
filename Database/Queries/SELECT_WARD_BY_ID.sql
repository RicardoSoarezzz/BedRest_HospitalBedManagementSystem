GO
CREATE PROCEDURE get_wards_by_id @WARD_ID bigint
AS
BEGIN
    SELECT D_name, W_name, W_available, W_occupied, W_current, W_capacity
    FROM Ward INNER JOIN Department ON D_id=W_D_id
	WHERE W_id=@WARD_ID
END