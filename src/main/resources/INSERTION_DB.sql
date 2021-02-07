INSERT INTO "account"
(first_name, last_name, phone_number, user_name, password, "type")
VALUES
('Kamel', 'Zyadeh', '+375255422125', 'admin1', '12345', 'ADMIN'),
('Ziad', 'Al-Sarih', '+375444722956', 'client1', '12345', 'CLIENT'),
('Ali', 'Arkawazi', '+375298305587', 'taxi1', '12345', 'TAXI'),
('Raouf', 'Attar', '+375336775244', 'taxi2', '12345', 'TAXI');

INSERT INTO "location"
(lng, lat)
VALUES
(27.561523, 53.904541),
(27.561523, 53.904541);

INSERT INTO "transaction"
("date", "type")
VALUES
('2021-04-15', 'SUCCESSFUL'),
('2021-01-17', 'FAILED');

INSERT INTO "order"
(taxi_id, client_id, source_id, destination_id, transaction_id, price, "date")
VALUES
(1, 1, 1, 1, 1, 7.30, '2021-04-15'),
(2, 2, 2, 2, 2, 17.30, '2021-01-17');

