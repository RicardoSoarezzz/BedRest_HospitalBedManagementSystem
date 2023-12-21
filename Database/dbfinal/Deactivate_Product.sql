GO
CREATE PROCEDURE deactivate_product @PRODUCT_ID bigint
BEGIN
    UPDATE Product
    SET P_active = 0
    WHERE P_id = @PRODUCT_ID
END