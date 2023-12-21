Create Procedure update_Current_Ward @BID bigint, @WID BIGINT
AS
BEGIN
INSERT INTO Current_Ward (CW_B_id, CW_W_id, CW_arrivalDate)
Values (@BID, @WID, CURRENT_TIMESTAMP)
END