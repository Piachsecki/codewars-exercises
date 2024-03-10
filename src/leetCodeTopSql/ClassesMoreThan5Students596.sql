-- SELECT c.class
-- FROM courses c
-- WHERE (SELECT COUNT(*) FROM courses WHERE class = c.class AND student IS NOT NULL) >= 5
-- GROUP BY c.class;

-- select c.class
-- from courses c
-- group by c.class
-- having count(c.student) >= 5;