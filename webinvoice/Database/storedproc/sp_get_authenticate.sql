DROP procedure IF EXISTS `webinvoice`.`get_authenticate`;

DELIMITER $$

CREATE PROCEDURE `webinvoice`.`get_authenticate` (
	IN in_login VARCHAR(64),
	IN in_password VARCHAR(45),
	OUT out_username VARCHAR(32),
	OUT out_authenticated BOOLEAN
)

MAIN: BEGIN
	DECLARE count INT DEFAULT 0;
    
	-- Authenticate using username
	SET @count = (SELECT count(*)
		FROM `webinvoice`.`user`
		WHERE username =  in_login
		AND password = in_password);

	IF (@count = 1) THEN 
		SET out_username = in_login;
		SET out_authenticated = 1;
		LEAVE MAIN;
	END IF;

	-- Authenticate using email
	SET @count = (SELECT count(*)
		FROM `webinvoice`.`user`
		WHERE username =  in_login
		AND password = in_password);

	IF (@count = 1) THEN 
		SET out_username = in_login;
		SET out_authenticated = 1;
		LEAVE MAIN;
	END IF;	    
END
$$
DELIMITER ;
