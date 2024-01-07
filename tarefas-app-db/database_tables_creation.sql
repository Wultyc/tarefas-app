-- Clean database before starting
DROP TABLE IF EXISTS roles, users, tasks, task_schedule, user_task_exclude;
DROP TYPE IF EXISTS time_of_the_day, task_status;

------ Create Types ------

-- Create type time_of_the_day
CREATE TYPE time_of_the_day
    AS ENUM ('Almoço', 'Jantar', 'Dia todo');

-- Create type task_status
CREATE TYPE task_status
    AS ENUM ('Pendente', 'Concluida', 'Cancelada');


------ Create Tables ------

-- Create Roles table
CREATE TABLE roles (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(50) NOT NULL,
    "description" TEXT NOT NULL
);

-- Create Users table
CREATE TABLE users (
    "id" SERIAL PRIMARY KEY,
    "name" VARCHAR(50) NOT NULL,
    "profile_picture" TEXT,
    "role" INTEGER REFERENCES roles(id) NOT NULL
);

-- Create Tasks table
CREATE TABLE tasks (
    "id" SERIAL PRIMARY KEY,
    "description" TEXT NOT NULL,
    "auto_complete" BOOLEAN NOT NULL,
    "points" INTEGER NOT NULL CHECK (points > 0 AND points <= 5)
);

-- Create Task Schedule Status table
CREATE TABLE task_schedule (
    "id" SERIAL PRIMARY KEY,
    "task" INTEGER REFERENCES tasks(id) NOT NULL,
    "time_of_the_day" time_of_the_day NOT NULL,
    "assigned_user" INTEGER REFERENCES users(id) NOT NULL,
    "assigned_date" DATE NOT NULL,
    "task_status" task_status NOT NULL,
    "completing_user" INTEGER REFERENCES users(id),
    "completing_date" DATE,
    "comments" TEXT,
    "earned_point" INTEGER
);

-- Create Task User Exclude Status table
CREATE TABLE user_task_exclude (
    "id" SERIAL PRIMARY KEY,
    "task" INTEGER REFERENCES tasks(id) NOT NULL,
    "user" INTEGER REFERENCES users(id) NOT NULL
);