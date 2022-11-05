grammar g;

csvFile: hdr row+ EOF ;

hdr : row ;

row : field (SEPARADOR field)* '\r'? '\n' ;

field
    :TEXTO
    |STRING
    ;
SEPARADOR:[|;,];
TEXTO: ~[|;,\n\r"]+ ;
STRING: '"' ('""'|~'"')* '"' ;

