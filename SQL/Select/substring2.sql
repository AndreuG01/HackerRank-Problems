/*
Andreu Garcies Ramon 2-10-2022

Query the list of CITY names from STATION that do not start with vowels and do not end with vowels.
Your result cannot contain duplicates
*/

SELECT DISTINCT CITY FROM STATION
WHERE SUBSTR(CITY, 1, 1) NOT IN ("A", "E", "I", "O", "U")
AND SUBSTR(CITY, -1, 1) NOT IN ("A", "E", "I", "O", "U")

--SUBTSTR(string, start, end) selects from string the substring that starts at position start and ends at position end