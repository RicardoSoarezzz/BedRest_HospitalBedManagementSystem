Create Trigger update_record
ON dbo.Bed
AFTER UPDATE AS
	BEGIN
	DECLARE @BID AS BIGINT
	DECLARE @BSID AS BIGINT
	DECLARE @OLDBSID AS BIGINT
	DECLARE @CurrTIME AS datetime

	SET @CurrTIME= CURRENT_TIMESTAMP

	SET @BID = (SELECT B_id FROM inserted)

	SET @BSID = (SELECT B_S_id FROM inserted) 

	SET @OLDBSID = (SELECT B_S_id FROM Bed WHERE B_id=@BID)
	
	IF(@OLDBSID!=@BSID)
		BEGIN
		UPDATE Bed SET B_S_id = @BSID
		WHERE B_id = @BID
		/*update old record and new record*/
		Update Records SET R_actualEndDate=@CurrTIME
		WHERE R_B_id=@BID AND R_actualEndDate is null

		INSERT INTO Records
		Values (@BID, @BSID, @CurrTIME)
		END
			
END
	ERRO1: 
		ERRO1:
		RAISERROR('#1 - ERRO NA INTRODUÇAO',16,1)
		RETURN