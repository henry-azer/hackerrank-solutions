SELECT CONCAT(Name, '(', LEFT(Occupation, 1), ')')
FROM OCCUPATIONS
ORDER BY Name;
SELECT CONCAT(
        'There are a total of ',
        COUNT(Occupation),
        ' ',
        LOWER(OCCUPATION),
        's.'
    )
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(Occupation),
    Occupation ASC;