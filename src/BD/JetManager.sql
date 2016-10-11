--SQLite Maestro 15.1.0.6
------------------------------------------
--Host     : localhost
--Database : JetManager


CREATE TABLE TCandidato (
  CanRif        text NOT NULL,
  CanNombres    text NOT NULL,
  CanApellidos  text NOT NULL,
  CanFechaNac   date NOT NULL,
  CanEdoCivil   text NOT NULL,
  CanDireccion  text NOT NULL,
  CanCiudad     text NOT NULL,
  CanPais       text NOT NULL,
  CanEmail      text NOT NULL,
  CanTelefono   text NOT NULL,
  CanEstatus    char(2) NOT NULL DEFAULT A,
  /* Llaves */
  PRIMARY KEY (CanRif)
);

CREATE TABLE TCargo (
  CarID           integer NOT NULL PRIMARY KEY AUTOINCREMENT,
  CarDescripcion  varchar(50) NOT NULL,
  CarEstatus      char(2) NOT NULL DEFAULT A
);

CREATE TABLE TCargoPorProyecto (
  CPIdProy         text NOT NULL,
  CPIdCargo        integer NOT NULL,
  CPNroCandidatos  integer NOT NULL,
  CPEstatus        char(2) NOT NULL DEFAULT A,
  /* Llaves */
  PRIMARY KEY (CPIdProy, CPIdCargo),
  /* Clave Foránea */
  CONSTRAINT CPIdCargo
    FOREIGN KEY (CPIdCargo)
    REFERENCES TCargo(CarID)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT, 
  CONSTRAINT CPIdProy
    FOREIGN KEY (CPIdProy)
    REFERENCES TProyecto(ProyId)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT
);

CREATE TABLE TCliente (
  CliRif          text NOT NULL,
  CliRazonSocial  text,
  CliEmail        text,
  CliTelefono     text,
  CliDireccion    text,
  CliCiudad       text,
  CliPais         text,
  CliEstatus      char(2) NOT NULL DEFAULT A,
  /* Llaves */
  PRIMARY KEY (CliRif)
);

CREATE TABLE TCobroMensual (
  CobIdProyecto  text NOT NULL,
  CobFecha       date NOT NULL,
  CobMonto       real NOT NULL,
  CobEstatus     integer NOT NULL DEFAULT A,
  /* Llaves */
  PRIMARY KEY (CobIdProyecto, CobFecha),
  /* Clave Foránea */
  CONSTRAINT CobIdProyecto
    FOREIGN KEY (CobIdProyecto)
    REFERENCES TProyecto(ProyId)
);

CREATE TABLE TEmpleado (
  EmpId          integer NOT NULL PRIMARY KEY AUTOINCREMENT,
  EmpRif         integer,
  EmpTipoMoneda  char(5) NOT NULL DEFAULT Bs,
  EmpTipoPago    text NOT NULL,
  EmpSalario     float(80,10) NOT NULL,
  EmpEstatus     char(2) NOT NULL DEFAULT A,
  /* Clave Foránea */
  CONSTRAINT EmpRif
    FOREIGN KEY (EmpRif)
    REFERENCES TCandidato(CanRif)
);

CREATE TABLE TEntrevista (
  EntRifCandidato   text NOT NULL,
  EntTipo           integer NOT NULL,
  EntIdProyecto     text NOT NULL,
  EntFecha          date NOT NULL,
  EntCargoAsp       text NOT NULL,
  EntSalOfer        integer NOT NULL,
  EntSalPret        integer NOT NULL,
  EntObservaciones  integer NOT NULL,
  EntEstatus        char(2) NOT NULL DEFAULT A,
  EntEntrevistador  varchar(50),
  EntResultado      char(1) NOT NULL DEFAULT E,
  /* Llaves */
  PRIMARY KEY (EntRifCandidato, EntTipo, EntIdProyecto),
  /* Clave Foránea */
  CONSTRAINT EntIdProyecto
    FOREIGN KEY (EntIdProyecto)
    REFERENCES TProyecto(ProyId), 
  CONSTRAINT EntRifCandidato
    FOREIGN KEY (EntRifCandidato)
    REFERENCES TCandidato(CanRif), 
  CONSTRAINT EntTipo
    FOREIGN KEY (EntTipo)
    REFERENCES TTipoEntrevista(TipEId)
);

CREATE TABLE TFalta (
  FalIdEmpleado     integer,
  FalFecha          date NOT NULL,
  FalJustificada    char(2) NOT NULL,
  FalObservaciones  text,
  FalHorasPerdidas  integer NOT NULL,
  FalEstatus        char(2) DEFAULT A,
  /* Llaves */
  PRIMARY KEY (FalFecha),
  /* Clave Foránea */
  CONSTRAINT FalIdEmpleado
    FOREIGN KEY (FalIdEmpleado)
    REFERENCES TEmpleado(EmpId)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE TPagoMensual (
  PagIdEmpleado       integer,
  PagFecha            date NOT NULL,
  PagHorasTrabajadas  real,
  PagMonto            real,
  PagEstatus          char(2) NOT NULL DEFAULT A,
  /* Llaves */
  PRIMARY KEY (PagFecha),
  /* Clave Foránea */
  CONSTRAINT Foreign_key01
    FOREIGN KEY (PagIdEmpleado)
    REFERENCES TEmpleado(EmpId)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE TPalabraClave (
  PalId       integer NOT NULL PRIMARY KEY AUTOINCREMENT,
  PalPalabra  text NOT NULL,
  PalEstatus  char(2) DEFAULT A
);

CREATE TABLE TPalabraPorCandidato (
  PCIdPalabra     integer NOT NULL,
  PCRifCandidato  text NOT NULL,
  PCEstatus       char(2) DEFAULT A,
  /* Llaves */
  PRIMARY KEY (PCIdPalabra, PCRifCandidato),
  /* Clave Foránea */
  CONSTRAINT PCIdPalabra
    FOREIGN KEY (PCIdPalabra)
    REFERENCES TPalabraClave(PalId), 
  CONSTRAINT PCRifCandidato
    FOREIGN KEY (PCRifCandidato)
    REFERENCES TCandidato(CanRif)
);

CREATE TABLE TProyecto (
  ProyId             text NOT NULL,
  ProyTitulo         text NOT NULL,
  ProyFechaInicio    date NOT NULL,
  ProyFechaFinEst    date NOT NULL,
  ProyFinFechaReal   date NOT NULL,
  ProyIdCliente      text NOT NULL,
  ProyDescripcion    text NOT NULL,
  ProyNroCandidatos  integer NOT NULL,
  ProyIdiomas        text,
  ProyEstatus        char(2) DEFAULT A,
  /* Llaves */
  PRIMARY KEY (ProyId),
  /* Clave Foránea */
  CONSTRAINT ProyIdCliente
    FOREIGN KEY (ProyIdCliente)
    REFERENCES TCliente(CliRif)
);

CREATE TABLE TTipoEntrevista (
  TipEId           integer NOT NULL PRIMARY KEY AUTOINCREMENT,
  TipEDescripcion  text NOT NULL,
  TipEEstatus      char(2) NOT NULL DEFAULT A
);

/* Data for table TCandidato */




/* Data for table TCargo */




/* Data for table TCargoPorProyecto */




/* Data for table TCliente */
INSERT INTO TCliente (CliRif, CliRazonSocial, CliEmail, CliTelefono, CliDireccion, CliCiudad, CliPais, CliEstatus) VALUES ('1', 'Ana', 'anadepalma', '0231322', 'av los leones', 'barqto', 'Venezuela', 'A');



/* Data for table TCobroMensual */




/* Data for table TEmpleado */




/* Data for table TEntrevista */




/* Data for table TFalta */




/* Data for table TPagoMensual */




/* Data for table TPalabraClave */




/* Data for table TPalabraPorCandidato */




/* Data for table TProyecto */




/* Data for table TTipoEntrevista */


