GO
CREATE PROCEDURE deactivate_bed @BED_ID bigint
AS
BEGIN
    UPDATE Bed
    SET B_active = 0
    WHERE B_id = @BED_ID
END