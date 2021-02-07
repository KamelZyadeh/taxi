CREATE TABLE "account" (
id bigserial primary key,
first_name varchar(20) NOT NULL,
last_name varchar(20) NOT NULL,
phone_number varchar(20) NOT NULL,
user_name varchar(255) NOT NULL,
password varchar(255) NOT NULL,
"type" varchar(20) NOT NULL
);

CREATE TABLE "location" (
id bigserial primary key,
lng DECIMAL(10, 7) NOT NULL,
lat DECIMAL(10, 7) NOT NULL
);

CREATE TABLE "transaction" (
id bigserial primary key,
"date" DATE,
"type" varchar(20) NOT NULL
);

CREATE TABLE "order" (
id bigserial primary key,
taxi_id bigint,
client_id bigint,
source_id bigint,
destination_id bigint,
transaction_id bigint,
price DECIMAL(5, 2),
date DATE,
foreign key(taxi_id) references "account"(id) ON DELETE CASCADE,
foreign key(client_id) references "account"(id) ON DELETE CASCADE,
foreign key(source_id) references "location"(id) ON DELETE CASCADE,
foreign key(destination_id) references "location"(id) ON DELETE CASCADE,
foreign key(transaction_id) references "transaction"(id) ON DELETE CASCADE
);