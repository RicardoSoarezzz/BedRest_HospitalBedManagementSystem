GO
ALTER PROCEDURE get_beds_by_id @BED_ID bigint
AS
BEGIN
    SELECT cw.D_name, cw.W_name, B_id, B_processNum, S_designation, cw.CW_arrivalDate, cw.CW_departureDate
    FROM State INNER JOIN Bed
    ON S_id = B_S_id INNER JOIN (
            SELECT CW_B_id, CW_arrivalDate, CW_departureDate, W_name, D_name
            FROM Current_Ward INNER JOIN Ward
            ON CW_W_id = W_id INNER JOIN Department
            ON D_id = W_D_id) AS cw
            ON B_id = cw.CW_B_id
	WHERE B_id=165
END