-- Clear all tables
TRUNCATE user_task_exclude, task_schedule, tasks, users, roles RESTART IDENTITY CASCADE;

-- Insert Roles
INSERT INTO roles ("name", "description") VALUES
    ('user', 'Utilizador da Aplicação'),
    ('admin', 'Administrador da Aplicação');

-- Insert Users
INSERT INTO users ("name", "role") VALUES
    ('Jorge', 2),
    ('Pai', 1),
    ('Mãe', 1),
    ('Bruno', 1),
    ('Rosinha', 1);

-- Insert Tasks
INSERT INTO tasks ("description", "auto_complete", "points") VALUES
    ('Arrumar a loiça da máquina', FALSE, 2),
    ('Passar a ferro', FALSE, 4),
    ('Mudar as areias', FALSE, 5),
    ('Limpar os WC', FALSE, 5),
    ('Aspirar a Sala', FALSE, 2),
    ('Limpar o pó à sala', FALSE, 2),
    ('Limpar a cozinha', FALSE, 3),
    ('Arrumar o quarto', FALSE, 2),
    ('Levar o lixo', FALSE, 1),
    ('Tirar Café', FALSE, 1);

-- Insert Task Status
INSERT INTO user_task_exclude ("user", "task") VALUES
    (1,1),
    (1,2),
    (1,3),
    (1,10),
    (2,2),
    (2,3),
    (2,4),
    (2,5),
    (2,6),
    (2,7),
    (2,8),
    (2,9),
    (2,10),
    (3,1),
    (3,9),
    (3,10),
    (4,1),
    (4,2),
    (5,1);