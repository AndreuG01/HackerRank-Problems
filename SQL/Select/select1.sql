/*
Andreu Garcies Ramon 2-10-2022

Query all columns for all American cities in the CITY table with populations larger
than 100000. The CountryCode for America is USA.
*/

SELECT *
FROM CITY
WHERE POPULATION > 100000 and COUNTRYCODE="USA"