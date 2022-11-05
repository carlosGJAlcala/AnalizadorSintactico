grammar LenguajeInventado;

prog: fila+ EOF ;

fila :campo(NEWLINE campo)* ;

campo:asignacion
    |comentario
    |exprcond
    |mostrar
    ;
asignacion: 'asignar' VARIABLE '=' expr FINLINEA NEWLINE;


expr: expr('*'|'/')expr
    |expr('+'|'/')expr
    |expr('-'|'/')expr
    |NUMERO
    |'('expr')'
    | OPERACION '('(expr(','expr)*) ')'
    | VARIABLE
    ;
comentario: COMENTARIOABRIR (textos|NEWLINE)* COMENTARIOCERRAR
            | COMENTARIOLINEA textos* NEWLINE
            |COMENTARIOALMOHADILLA textos* NEWLINE
            ;
textos: TEXTO+
        |'-'
        ;
exprcond:condicion NEWLINE 'si ->' NEWLINE (VARIABLE '=' expr FINLINEA NEWLINE)+('no ->' NEWLINE(asignacion FINLINEA NEWLINE))? FINCOND;
condicion:VARIABLE OPERADORESCOND (NUMERO|STRING|FLOAT|VARIABLE FINLINEA) FINCONDICION;
mostrar:'mostrar' (NUMERO|STRING|FLOAT|VARIABLE FINLINEA) NEWLINE?;


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
VALORES:NUMERO|STRING|FLOAT|VARIABLE;
ESPACIO:' '+->skip;
TEXTO: [a-zA-Z]+;