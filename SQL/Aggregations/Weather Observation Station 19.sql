SELECT ROUND(
        SQRT(
            POWER(A - B, 2) + POWER(C - D, 2)
        ),
        4
    )
FROM (
        SELECT MAX(LAT_N) AS A,
            MIN(LAT_N) AS B,
            MAX(LONG_W) AS C,
            MIN(LONG_W) AS D
        FROM STATION
    ) AS X;