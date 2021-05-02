SELECT ROUND(LAT_N, 4)
FROM (
        SELECT LAT_N,
            ROW_NUMBER() OVER (
                ORDER BY LAT_N
            ) AS ROW_NUM
        FROM STATION
    ) AS X
WHERE ROW_NUM = (
        SELECT ROUND((COUNT(LAT_N) + 1) / 2, 0)
        FROM STATION
    );