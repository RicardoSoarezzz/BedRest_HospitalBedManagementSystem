GO
CREATE PROCEDURE get_stocks_by_ward @WARD_ID bigint
AS
BEGIN
    SELECT P_name, St_Quant, St_ExpectedStock
    FROM Product INNER JOIN(
    		SELECT St_P_id, St_Quant, St_ExpectedStock
    		FROM Stock INNER JOIN Department
    		ON St_D_id = D_id INNER JOIN Ward
    		ON W_D_id = D_id
    		WHERE W_id = @WARD_ID) AS stocks
    ON P_id = St_P_id
END