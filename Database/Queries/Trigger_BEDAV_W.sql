CREATE TRIGGER BEDS_AVAILABLE_W
ON WARD
AFTER UPDATE
AS 
BEGIN 
	DECLARE @WOC AS INT
	DECLARE @WAV AS BIGINT
	DECLARE @WID AS BIGINT

	SET @WID = (SELECT W_id FROM inserted)

	SET @WAV = (SELECT W_available FROM inserted WHERE W_id = @WID) 

	SET @WOC = (SELECT W_occupied FROM inserted WHERE W_id = @WID) 

	IF(@WAV	>= @WOC)
	BEGIN
	UPDATE WARD SET W_available = @WAV
	WHERE W_id = @WID 

	UPDATE WARD SET W_occupied = @WOC
	WHERE W_id = @WID
	END
END

ERRO1: 
		ERRO11:
		RAISERROR('#1 - OCCUPIED IS GREATER THAN AVAILABLE',16,1)
		RETURN