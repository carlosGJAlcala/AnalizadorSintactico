grammar LenguajeInventado;

prog: fila+ EOF ;

fila :campo(NEWLINE campo)*  ;

campo:asignacion
    |comentario
    |exprcond
    |mostrar
    ;
asignacion: VARIABLE '=' expr FINLINEA NEWLINE;


expr: expr('*'|'/')expr
    |expr('*'|'/')expr
    |expr('*'|'/')expr
    |NUMERO
    |'('expr')'
    | OPERACION '('(expr(','expr)*) ')'
    | VARIABLE
    ;
comentario: COMENTARIOABRIR (textos|INTRO)* COMENTARIOCERRAR
            | COMENTARIOLINEA textos* INTRO
            |COMENTARIOALMOHADILLA textos* INTRO
            ;
textos: COSAS+;
exprcond:condicion NEWLINE IF (asignacion FINLINEA NEWLINE)+(ELSE (asignacion FINLINEA NEWLINE))? FINCOND;
condicion:VARIABLE OPERADORESCOND VALORES FINCONDICION;
mostrar:MOSTRAR;

//MULTIUSOS


FLOAT:NUMERO'.'NUMERO;
NUMERO:[0-9]+;
VARIABLE:[a-zA-Z];
FINLINEA:';P';
STRING: '"' ('""'|~'"')* '"' ;
//COMENTARIOS
COMENTARIOABRIR: '/*';
COMENTARIOCERRAR: '*/';
COMENTARIOLINEA: '//';
COMENTARIOALMOHADILLA:'#';
//EXPRESIONES MATEMÁTICAS
SEPARADOR:',';
OPERACION:'cos'|'sen'|'tan';//mejora
INTRO:'\r\n';
NEWLINE:[\r\n];
//CONDICIONES
OPERADORESCOND:'<'|'>'|'==';
FINCONDICION:'???';

IF:'si->' NEWLINE;
ELSE:'no->'NEWLINE;
FINCOND:'terminar' NEWLINE;
//MOSTRARVALORES
MOSTRAR:'mostrar'VALORES FINLINEA NEWLINE;
COSAS:.+?;

VALORES:NUMERO|STRING|FLOAT|VARIABLE;