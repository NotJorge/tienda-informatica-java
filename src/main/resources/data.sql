INSERT INTO categories (uuid, name, created_at, updated_at)
VALUES ('d69cf3db-b77d-4181-b3cd-5ca8107fb6a9', 'SOBREMESA', current_timestamp, current_timestamp),
       ('6dbcbf5e-8e1c-47cc-8578-7b0a33ebc154', 'PORTATILES', current_timestamp, current_timestamp),
       ('9def16db-362b-44c4-9fc9-77117758b5b0', 'RATONES', current_timestamp, current_timestamp),
       ('8c5c06ba-49d6-46b6-85cc-8246c0f362bc', 'PLACAS BASE', current_timestamp, current_timestamp),
       ('bb51d00d-13fb-4b09-acc9-948185636f79', 'OTROS', current_timestamp, current_timestamp);

INSERT INTO proveedores(id_Proveedor, name, contact, address, date_Of_Hire, category_id)
VALUES ('f47a2544-5b87-49c7-8931-1b9d5cfbdf01', 'Proveedor 1', 1, 'Direccion 1', current_timestamp,
        'd69cf3db-b77d-4181-b3cd-5ca8107fb6a9'),
       ('f47a2544-5b87-49c7-8931-1b9d5cfbdf02', 'Proveedor 2', 2, 'Direccion 2', current_timestamp,
        '8c5c06ba-49d6-46b6-85cc-8246c0f362bc');

INSERT INTO PRODUCTS (id, NAME, WEIGHT, PRICE, IMG, STOCK, DESCRIPTION, CATEGORY_ID, created_at, updated_at)
VALUES ('d69cf3db-b77d-4181-b3cd-5ca8107fb6a0', 'Producto A', 1, 100, 'productA.jpg', 10, 'Descripción del producto A',
        'd69cf3db-b77d-4181-b3cd-5ca8107fb6a9', current_timestamp, current_timestamp),
       ('76549b87-23a2-4065-8a86-914207290329', 'Producto B', 2, 150, 'productB.jpg', 15, 'Descripción del producto B',
        '6dbcbf5e-8e1c-47cc-8578-7b0a33ebc154', current_timestamp, current_timestamp),
       ('3512e012-7028-405c-8397-b39886006212', 'Producto C', 3, 200, 'productC.jpg', 20, 'Descripción del producto C',
        '9def16db-362b-44c4-9fc9-77117758b5b0', current_timestamp, current_timestamp),
       ('98765432-1234-5678-90ab-cdef01234567', 'Producto D', 4, 250, 'productD.jpg', 25, 'Descripción del producto D',
        '8c5c06ba-49d6-46b6-85cc-8246c0f362bc', current_timestamp, current_timestamp);


