GO
CREATE PROCEDURE get_stocks_by_department @DEPARTMENT_ID bigint
AS
BEGIN
    SELECT P_name, St_Quant, St_ExpectedStock
    FROM Product INNER JOIN(
            SELECT St_P_id, St_Quant, St_ExpectedStock
            FROM Stock INNER JOIN Department
            ON St_D_id = D_id
            WHERE D_id = @DEPARTMENT_ID) AS stocks
    ON P_id = St_P_id
END