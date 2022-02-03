SELECT TOP 3 CarBrand From MostBrandSales--Assuming there is a View called MostBrandSales that contains 
WHERE YearAndQuarterNum = 20151 OR YearAndQuarterNum = 20153 
Order by SalesQuantity desc
---	By ordering data in descending order it puts the higher values at the top of the query.

CREATE OR ALTER PROCEDURE SP_MostColorsSold(@YearAndQuarterNum INT, @MSJ OUT)
AS
BEGIN
	BEGIN TRY
		SELECT TOP 3 CarColor From MostBrandSales
		WHERE YearAndQuarterNum = @YearAndQuarterNum 
		Order by SalesQuantity desc
	END TRY
	BEGIN CATCH
		SET @MSJ = ERROR_MESSAGE
	END CATCH
END