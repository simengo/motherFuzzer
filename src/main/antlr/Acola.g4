grammar Acola;
start_rule:brain;
brain : 'brain' '""' IDENTIFIER '""' '{' instruction+ '}' EOF;
instruction : mark
              unmark
              turn
              move
              sense
              set
              unset
              pickup
              drop
              jump
              flip
              sensemarker
              directions
              test
              COMMENT;

mark: 'mark' NUMBER;
unmark: 'unmark'NUMBER;
turn: 'turn' TURNDIRECTION;
move: 'move' 'else' NUMBER;
sense: 'sense' FIELD TARGET 'else' NUMBER;
sensemarker: 'sense' FIELD 'marker' MARKER 'else' NUMBER;
set: 'set' NUMBER;
unset: 'unset' NUMBER;
pickup: 'pickup''else' NUMBER;
drop: 'drop''else' NUMBER;
jump: 'jump' NUMBER;
flip: 'flip' 'else' NUMBER;
test: 'test' 'else' NUMBER;
directions: 'directions' DIRECTION;

FIELD : 'here' | 'ahead' | 'left' | 'right';
TARGET : 'foe' | 'foehome' | 'friend' | 'food' | 'antlion' | 'rock' | 'foefood' | 'antlion' | 'foefood' | 'friendfood' | 'foemarker';
DIRECTION :  'northwest' | 'west' | 'southwest' | 'southeast' | 'east' | 'northeast';
TURNDIRECTION : 'left' | 'right';
MARKER : [0-5];
NUMBER : [0-9]+;
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
COMMENT : ('/*' .*? '*/' | '//' .*? '\n') -> skip;
