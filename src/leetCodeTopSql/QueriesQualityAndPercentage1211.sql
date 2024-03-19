-- Write your PostgreSQL query statement below
-- SELECT
--     query_name,
--     ROUND(SUM(rating/position)::numeric/count(*), 2)  AS quality,
--     ROUND(100  * avg(CASE WHEN rating < 3 THEN 1.0 ELSE 0.0 END), 2) AS poor_query_percentage
-- FROM Queries
-- GROUP BY query_name;
--
-- -- 1.0 * (SELECT query_name FROM Queries)