grammar Acola;
brain : 'brain' '""' IDENTIFIER '""' '{' instruction '}' EOF;
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
              test;

mark: 'mark' NUMBER;
unmark: 'unmark'NUMBER;
turn: 'turn' TURNDIRECTION;
move: 'move' 'else' NUMBER;
sense: 'sense' FIELD TARGET 'else' NUMBER;
set: 'set' NUMBER;
unset: 'unset' NUMBER;
pickup: 'pickup''else' NUMBER;
drop: 'drop''else' NUMBER;
jump: 'jump' NUMBER;
flip: 'flip' 'else' NUMBER;
test: 'test' 'else' NUMBER;
directions: 'directions' direction;

direction :  'northwest' //TODO so oder wie unten ?
              'west'
              'southwest'
              'southeast'
              'east'
              'northeast';

TURNDIRECTION : 'left' | 'right';


IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
NUMBER : [0-9]+;
FIELD : 'here' | 'ahead' | 'left' | 'right';
TARGET : 'foe' | 'foehome' | 'friend' | 'marker' | 'food' | 'antlion' | 'rock' | 'foefood';
COMMENT : ('/*' .*? '*/' | '//' .*? '\n') -> skip;
