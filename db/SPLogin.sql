USE `training_bd`

-- @elperez Descomentar para poder eliminar y volver a crear el SP.
-- DROP PROCEDURE `SPLogin`

DELIMITER $$
CREATE PROCEDURE `SPLogin`(
	`@email` VARCHAR(100),
    `@password` VARCHAR(100)
)
BEGIN
    select * from client
    where `client_email` = `@email` AND `client_password` = `@password`;
END $$
DELIMITER ;