grammar recetas;

prog: fila+ conclusion EOF ;

fila :receta( NEWLINE receta)*;


receta:ACCIONES  DETERMINANTES? (CANTIDAD UNIDADES PREPOSICIONES)? (ingredientes=INGREDIENTES) PREPOSICIONES DETERMINANTES (utensilios=UTENSILIOS) (PREPOSICIONES (cubiertos=CUBIERTOS))? (PREPOSICIONES TIEMPO)?;
conclusion: CONCLUSION;


UNIDADES:'mg'|'ml'|'g'|'Kg'|'L';
CONCLUSION:'Listo para comer';

//COCINA
INGREDIENTES:'agua'|'huevo'|'pollo'|'macarrones'|'arroz'|'aceite'|'sal'|'tomate'|'pan rallado';
UTENSILIOS:'sarten'|'olla'|'paellera'|'plato';
CUBIERTOS:'tenedor'|'cuchara'|'cuchillo'|'cucharon';
ACCIONES:'Freir'|'Calentar'|'Cocer'|'Remover'|'Voltear'|'Echar'|'Mezclar'|'Añadir'|'Rebozar';
CANTIDAD:[0-9]+(','[0-9]+)? ;

//NEXO:DETERMINANTES?PREPOSICIONES;
DETERMINANTES:'la'|'el'|'un'|'dos';
PREPOSICIONES:'a'|'ante'|'bajo'|'cabe'|'con'|'contra'|'de'|'desde'|'en'|'entre'|'hasta'|'hacia'|'para'|'por'|'segun'|'sin'|'so'|'sobre'|'tras'|'durante'|'mediante';

TIEMPO:[0-9][0-9]':'[0-9][0-9];
//COMENTARIOS
COMENTARIOABRIR: '/';
COMENTARIOCERRAR: '/';
COMENTARIOLINEA: '//';
COMENTARIOALMOHADILLA:'#';
SEPARADOR:',';
ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+-> skip;