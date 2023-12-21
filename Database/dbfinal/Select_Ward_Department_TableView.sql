GO
CREATE PROCEDURE get_wards_by_department @DEPARTMENT_ID bigint
AS
BEGIN
    SELECT W_name, W_available, W_occupied, W_capacity
    FROM Ward
    WHERE W_D_id = @DEPARTMENT_ID
END