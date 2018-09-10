grammar Acola;
brain : 'brain' '"' IDENTIFIER '"' '{' '\\n' (instruction '\\n')+ '}' EOF;
instruction : mark
              |unmark
              |turn
              |move
              |sense
              |set
              |unset
              |pickup
              |drop
              |jump
              |flip
              |sensemarker
              |directions
              |test
              |COMMENT;

mark: 'mark' NUMBER;
unmark: 'unmark' NUMBER;
turn: 'turn' ('left' | 'right');
move: 'move' 'else' NUMBER;
sense: 'sense' FIELD TARGET 'else' NUMBER;
sensemarker: 'sense' FIELD 'marker' MARKER 'else' NUMBER;
set: 'set' NUMBER;
unset: 'unset' NUMBER;
pickup: 'pickup''else' NUMBER;
drop: 'drop''else' NUMBER;
jump: 'jump' (NUMBER|MARKER)+;
flip: 'flip' 'else' NUMBER;
test: 'test' 'else' NUMBER;
directions: 'directions' DIRECTION;
breed: 'breed' NUMBER;

FIELD : 'here' | 'ahead' | 'left' | 'right';
TARGET : 'foe' | 'foehome' | 'friend' | 'food' | 'antlion' | 'rock' | 'foefood' | 'foemarker';
DIRECTION :  'northwest' | 'west' | 'southwest' | 'southeast' | 'east' | 'northeast';
MARKER : [0-5];
NUMBER : [0-9]+;
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]*;
COMMENT : ('/*' .*? '*/' | '//' .*? '\\n') -> skip;
