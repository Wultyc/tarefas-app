-- Create tarefas_app database
CREATE DATABASE tarefas_app;

-- Create tarefas_app_user user
-- The string oPnAwt6G is placeholder for a real password. Please update the value before executing the script
CREATE USER tarefas_app_user WITH ENCRYPTED PASSWORD 'oPnAwt6G';

-- Grant permissions to tarefas_app_user user
GRANT ALL PRIVILEGES ON DATABASE tarefas_app TO tarefas_app_user;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA public TO tarefas_app_user;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA public TO tarefas_app_user;
