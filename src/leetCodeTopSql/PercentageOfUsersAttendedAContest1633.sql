-- SELECT contest_id,ROUND(COUNT(r.user_id) * 100.0/(SELECT COUNT(*) FROM Users), 2) AS percentage
-- FROM Users u
-- INNER JOIN Register r on  u.user_id = r.user_id
-- GROUP BY contest_id
-- ORDER BY percentage DESC, contest_id ASC;