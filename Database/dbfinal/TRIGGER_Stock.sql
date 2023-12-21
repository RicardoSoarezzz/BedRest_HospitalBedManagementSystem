Create Trigger check_stock
ON dbo.Stock 
AFTER UPDATE AS
	BEGIN
	DECLARE @STOCKQUANT AS BIGINT
	DECLARE @StID AS BIGINT

	SET @StID = (SELECT St_id FROM inserted)

	SET @STOCKQUANT = (SELECT St_Quant FROM inserted) 
	
	IF(@STOCKQUANT) >= 0
		BEGIN
		UPDATE Stock SET St_Quant = @STOCKQUANT
		WHERE St_id = @StID
		END
			
END 
		ERRO1:
		RAISERROR('#1 - NÂO HÁ STOCK SUFICIENTE PARA A AÇÃO',16,1)
		RETURN