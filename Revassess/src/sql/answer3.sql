SELECT * FROM APP_USER 
INNER JOIN STUDY_SET ON APP_USER.user_id = STUDY_SET.owner_id 
WHERE user_id = 5;
