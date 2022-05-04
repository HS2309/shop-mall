TRUNCATE TABLE `items`;
TRUNCATE TABLE `customer`;
TRUNCATE TABLE `vender`;
TRUNCATE TABLE `staff`;

INSERT INTO `items` (`item_name`, `price`, `manufacturied_date`, `expiry_date`, `item_id`)
VALUES ('coca cola', '40', '2022-04-13', '2022-04-22', '1');
INSERT INTO `items` (`item_name`, `price`, `manufacturied_date`, `expiry_date`, `item_id`)
VALUES ('bag', '200', '2022-04-13', '2022-04-22', '2');
INSERT INTO `items` (`item_name`, `price`, `manufacturied_date`, `expiry_date`, `item_id`)
VALUES ('t-shirt', '400', '2022-04-13', '2022-04-22', '3');
INSERT INTO `items` (`item_name`, `price`, `manufacturied_date`, `expiry_date`, `item_id`)
VALUES ('mouse', '2000', '2022-04-13', '2022-04-22', '4');
INSERT INTO `items` (`item_name`, `price`, `manufacturied_date`, `expiry_date`, `item_id`)
VALUES ('greeen tea', '40', '2022-04-13', '2022-04-22', '5');