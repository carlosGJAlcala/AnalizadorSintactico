grammar formitas;

formitasFile: fila EOF ;

fila : IMGDIM','SHPDIM APERTURA row('|'row)* CERRADURA;

row : campo (SEPARADOR campo)* ;

campo
    :FIGURA
    ;

ESPACIO : (' ' | '\t')+  -> skip;
NEWLINE: ('\r'? '\n' | '\r')+ -> skip;

FIGURA:'circulo'|'triangulo'|'trapecio'|'trapezoide'|'cuadrado'|'Pentagono'|'Hexagono'|'heptagono'|'octogono'|'eneagono'|'decagono';
APERTURA:'>>>';
CERRADURA:'<<<';
IMGDIM:'imgdim:'NUMERO;
SHPDIM:'shpdim:'NUMERO;
SEPARADOR:',';
NUMERO:[0-9]+;

