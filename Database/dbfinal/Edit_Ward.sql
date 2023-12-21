GO
CREATE PROCEDURE edit_ward @WARD_ID bigint, @NAME nvarchar(50), @CAPACITY int
AS
BEGIN
	UPDATE Ward
	SET W_capacity = @CAPACITY, W_name = @NAME
	WHERE W_id = @WARD_ID
END