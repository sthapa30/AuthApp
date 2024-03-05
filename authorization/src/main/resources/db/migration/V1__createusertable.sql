
CREATE TABLE "users".users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL,
    active BOOLEAN NOT NULL,
    roles VARCHAR(200)
);