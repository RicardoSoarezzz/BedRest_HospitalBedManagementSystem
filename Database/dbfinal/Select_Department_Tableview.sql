GO
CREATE PROCEDURE get_departments
AS
BEGIN
    SELECT D_name, D_available, D_occupied, D_capacity
    FROM Department
END