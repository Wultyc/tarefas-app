SELECT 
    u.name AS "NAME",
    STRING_AGG(CASE WHEN ute.task IS NULL THEN t.description END, ', ') AS "Included Tasks",
    COUNT(CASE WHEN ute.task IS NULL THEN 1 END) AS "No of Included Tasks",
    STRING_AGG(CASE WHEN ute.task IS NOT NULL THEN t.description END, ', ') AS "Excluded Tasks",
    COUNT(CASE WHEN ute.task IS NOT NULL THEN 1 END) AS "No of Excluded Tasks"
FROM users u
CROSS JOIN tasks t
LEFT JOIN user_task_exclude ute ON u.id = ute.user AND t.id = ute.task
GROUP BY u.id