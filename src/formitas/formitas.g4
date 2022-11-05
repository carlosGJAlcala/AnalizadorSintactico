grammar formitas;

formitasFile: fila EOF ;

fila : IMGDIM','SHPDIM APERTURA row('|'row)* CERRADURA;

row : campo (SEPARADOR campo)* ;

campo
    :CUADRADO
    |CIRCULO
    |TRIANGULO
    ;


APERTURA:'>>>';
CERRADURA:'<<<';
CUADRADO:'cuadrado';
CIRCULO: 'circulo';
TRIANGULO:'triangulo';
IMGDIM:'imgdim:'NUMERO;
SHPDIM:'shpdim:'NUMERO;
SEPARADOR:',';
NUMERO:[0-9]+;

