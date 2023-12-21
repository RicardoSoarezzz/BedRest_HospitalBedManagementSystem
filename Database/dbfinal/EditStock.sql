Create Procedure edit_Stock @SDep bigint, @SProd BIGINT, @SQuant BIGINT
AS
BEGIN
DECLARE @SExpectedStock as bigint
SET @SExpectedStock = (SELECT St_ExpectedStock FROM Stock WHERE St_P_id =@SProd and St_D_id= @SDep)
INSERT INTO Stock (St_D_id, St_P_id, St_date,St_Quant, St_ExpectedStock)
Values (@SDep, @SProd, CURRENT_TIMESTAMP, @SQuant, @SExpectedStock)
END