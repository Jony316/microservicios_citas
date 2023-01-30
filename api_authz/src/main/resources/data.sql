INSERT INTO authorities (name, endpoint) values ('User_Write', 'POST:/api/user/');
INSERT INTO authorities (name, endpoint) values ('User_Read', 'GET:/api/user/');
INSERT INTO authorities (name, endpoint) values ('UserById_Read', 'GET:/api/user/{id}/');
INSERT INTO authorities (name, endpoint) values ('User_Delete', 'DELETE:/api/user/{id}/');
INSERT INTO authorities (name, endpoint) values ('User_Update', 'PUT:/api/user/{id}/');
INSERT INTO authorities (name, endpoint) values ('User_PartialUpdate', 'PATCH:/api/user/{id}/');

INSERT INTO authorities (name, endpoint) values ('Role_Write', 'POST:/api/role/');
INSERT INTO authorities (name, endpoint) values ('Role_Read', 'GET:/api/role/');
INSERT INTO authorities (name, endpoint) values ('RoleById_Read', 'GET:/api/role/{id}/');
INSERT INTO authorities (name, endpoint) values ('Role_Delete', 'DELETE:/api/role/{id}/');
INSERT INTO authorities (name, endpoint) values ('Role_Update', 'PUT:/api/role/{id}/');
INSERT INTO authorities (name, endpoint) values ('Role_PartialUpdate', 'PATCH:/api/role/');

INSERT INTO authorities (name, endpoint) values ('Authority_Write', 'POST:/api/authority/');
INSERT INTO authorities (name, endpoint) values ('Authority_Read', 'GET:/api/authority/');
INSERT INTO authorities (name, endpoint) values ('AuthorityById_Read', 'GET:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Delete', 'DELETE:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Update', 'PUT:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_PartialUpdate', 'PATCH:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('AuthorityByUser_Read', 'GET:/api/authority/byuser/{id}/');

INSERT INTO authorities (name, endpoint) values ('Estudiante_Write', 'POST:/api/estudiante/');
INSERT INTO authorities (name, endpoint) values ('Estudiante_Read', 'GET:/api/estudiante/');
INSERT INTO authorities (name, endpoint) values ('EstudianteById_Read', 'GET:/api/estudiante/{id}/');
INSERT INTO authorities (name, endpoint) values ('Estudiante_Delete', 'DELETE:/api/estudiante/{id}');
INSERT INTO authorities (name, endpoint) values ('Estudiante_Update', 'PUT:/api/estudiante/{id}');
INSERT INTO authorities (name, endpoint) values ('Estudiante_PartialUpdate', 'PATCH:/api/estudiante/{id}');

INSERT INTO authorities (name, endpoint) values ('Docente_Write', 'POST:/api/docente/');
INSERT INTO authorities (name, endpoint) values ('Docente_Read', 'GET:/api/docente/');
INSERT INTO authorities (name, endpoint) values ('DocenteById_Read', 'GET:/api/docente/{id}/');
INSERT INTO authorities (name, endpoint) values ('Docente_Delete', 'DELETE:/api/docente/{id}/');
INSERT INTO authorities (name, endpoint) values ('Docente_Update', 'PUT:/api/docente/{id}/');
INSERT INTO authorities (name, endpoint) values ('Docente_PartialUpdate', 'PATCH:/api/docente/{id}/');

INSERT INTO authorities (name, endpoint) values ('Invoice_Write', 'POST:/api/factura/');
INSERT INTO authorities (name, endpoint) values ('Invoice_Read', 'GET:/api/factura/');
INSERT INTO authorities (name, endpoint) values ('InvoiceById_Read', 'GET:/api/factura/{id}/');
INSERT INTO authorities (name, endpoint) values ('Invoice_Delete', 'DELETE:/api/factura/{id}/');
INSERT INTO authorities (name, endpoint) values ('Invoice_Update', 'PUT:/api/factura/{id}/');
INSERT INTO authorities (name, endpoint) values ('Invoice_PartialUpdate', 'PATCH:/api/factura/{id}/');
INSERT INTO authorities (name, endpoint) values ('InvoicePdf_Read', 'GET:/api/factura/pdf/{id}/');


INSERT INTO roles (name) values ('ROLE_ADMIN');
INSERT INTO roles (name) values ('ROLE_ESTUDIANTE');
INSERT INTO roles (name) values ('ROLE_DOCENTE');

INSERT INTO roles_authorities (role_id, authority_id) (select (SELECT id FROM roles where name = 'ROLE_ADMIN')  AS role_id, e.id from authorities e );

INSERT INTO users (name, username, password, looked, expired, enabled) VALUES ('Admin', 'admin', '$2a$10$TwROhi2MZsOTt8igkE7Yyec0WfjK7NlgdX9apOu0b6cY4SxzHLvCq', false, false, true);

INSERT INTO users_roles (user_id, role_id) VALUES ((SELECT id FROM users where username = 'admin'), (SELECT id FROM roles where name = 'ROLE_ADMIN'));