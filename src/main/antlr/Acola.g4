grammar Acola;
brain : 'brain' '"' IDENTIFIER '"' '{' '\n' (instruction|jump)* jump '}' EOF;
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

mark: 'mark' NUMBER '\n';
unmark: 'unmark' NUMBER '\n';
turn: 'turn' ('left' | 'right') '\n';
move: 'move' 'else' NUMBER '\n';
sense: 'sense' FIELD TARGET 'else' NUMBER '\n';
sensemarker: 'sense' FIELD 'marker' MARKER 'else' NUMBER '\n';
set: 'set' NUMBER '\n';
unset: 'unset' NUMBER '\n';
pickup: 'pickup''else' NUMBER '\n';
drop: 'drop''else' NUMBER '\n';
jump: 'jump' NUMBER '\n';
flip: 'flip' 'else' NUMBER '\n';
test: 'test' 'else' NUMBER '\n';
directions: 'directions' DIRECTION '\n';

FIELD : 'here' | 'ahead' | 'left' | 'right';
TARGET : 'foe' | 'foehome' | 'friend' | 'food' | 'antlion' | 'rock' | 'foefood' | 'foemarker';
DIRECTION :  'northwest' | 'west' | 'southwest' | 'southeast' | 'east' | 'northeast';
MARKER : [0-5];
NUMBER : [0-9]+;
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
COMMENT : ('/*' .*? '*/' | '//' .*? '\n') -> skip;
