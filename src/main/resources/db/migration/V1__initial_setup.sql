-- Create the "users" table
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,           -- Auto-incrementing ID
    username VARCHAR(255) NOT NULL   -- Username of the user
);

-- Create the "notifications" table
CREATE TABLE IF NOT EXISTS notifications (
    id SERIAL PRIMARY KEY,           -- Auto-incrementing ID
    user_id BIGINT NOT NULL,         -- Foreign key to the users table
    title VARCHAR(255) NOT NULL,     -- Title of the notification
    message TEXT NOT NULL,           -- Message content of the notification
    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
        REFERENCES users (id)
        ON DELETE CASCADE            -- Deletes notifications if the user is deleted
);