
CREATE TABLE IF NOT EXISTS Taco_Order (
    id INT AUTO_INCREMENT PRIMARY KEY,
    delivery_Name VARCHAR(50) NOT NULL,
    delivery_Street VARCHAR(50) NOT NULL,
    delivery_City VARCHAR(50) NOT NULL,
    delivery_State VARCHAR(50) NOT NULL,
    delivery_Zip VARCHAR(10) NOT NULL,
    cc_number VARCHAR(16) NOT NULL,
    cc_expiration VARCHAR(5) NOT NULL,
    cc_cvv VARCHAR(3) NOT NULL,
    placed_at TIMESTAMP NOT NULL,
    FOREIGN KEY (taco_id) REFERENCES Taco(id)
);

CREATE TABLE IF NOT EXISTS Taco (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    taco_order_id INT NOT NULL,
    taco_order_key INT NOT NULL,
    created_at TIMESTAMP NOT NULL,
    FOREIGN KEY (taco_order_id) REFERENCES Taco_Order(id)
);

CREATE TABLE IF NOT EXISTS Ingredient_Ref (
    ingredient_id VARCHAR(4) NOT NULL,
    taco_id INT NOT NULL,
    taco_key INT NOT NULL,
    FOREIGN KEY (taco_id) REFERENCES Taco(id),
    PRIMARY KEY (ingredient_id, taco_id, taco_key)
);

CREATE TABLE IF NOT EXISTS Ingredient (
    id VARCHAR(4) NOT NULL,
    name VARCHAR(25) NOT NULL,
    type VARCHAR(10) NOT NULL
);

ALTER TABLE Taco ADD FOREIGN KEY (taco_order_id) REFERENCES Taco_Order(id);
ALTER TABLE Ingredient_Ref ADD FOREIGN KEY (ingredient_id) REFERENCES Ingredient(id);
