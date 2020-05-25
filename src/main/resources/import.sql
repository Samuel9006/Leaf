create index ix_listas_dscodigo on listas (dscodigo);
create index ix_listas_dsvalor on listas (dsvalor);
create index ix_listas_snactivo on listas (snactivo);
create index ix_listas_cdlista_dependencia on listas (cdlista_dependencia);

INSERT INTO listas (dscodigo,dsvalor,snactivo,cdlista_dependencia) VALUES('JAVA','Curso de Java intermedio','S',0);
INSERT INTO listas (dscodigo,dsvalor,snactivo,cdlista_dependencia) VALUES('GUITARRA','Curso básico','S',0);
INSERT INTO listas (dscodigo,dsvalor,snactivo,cdlista_dependencia) VALUES('ELECTRONICA','Curso de electronica avanzada','S',0);
INSERT INTO listas (dscodigo,dsvalor,snactivo,cdlista_dependencia) VALUES('MODA','Curso de costura','S',0);
INSERT INTO listas (dscodigo,dsvalor,snactivo,cdlista_dependencia) VALUES('COCINA','Introducción a la pasta 1','S',0);
INSERT INTO listas (dscodigo,dsvalor,snactivo,cdlista_dependencia) VALUES('COCINA2','Introducción a la pasta 2','N',0);