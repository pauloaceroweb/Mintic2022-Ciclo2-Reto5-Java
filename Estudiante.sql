BEGIN TRANSACTION;
DROP TABLE IF EXISTS "Estudiante";
CREATE TABLE IF NOT EXISTS "Estudiante" (
	"nombres"	TEXT(50) NOT NULL,
	"apellidos"	TEXT(50) NOT NULL,
	"nacimiento"	TEXT(50) NOT NULL,
	"correoInst"	TEXT(50) NOT NULL,
	"correoPers"	TEXT(50) NOT NULL,
	"celular"	NUMERIC NOT NULL,
	"fijo"	NUMERIC NOT NULL,
	"programa"	TEXT(50) NOT NULL,
	PRIMARY KEY("correoInst")
);
COMMIT;
