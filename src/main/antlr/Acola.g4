grammar Acola;

@lexer::members
{
  @Override
  public void recover(RecognitionException ex)
  {
    throw new RuntimeException(ex.getMessage());
  }
}

brain : 'brain' (COMMENT|SPACE|NEWLINE)* '"' IDENTIFIER '"' (COMMENT|SPACE|NEWLINE)* '{' ((COMMENT|SPACE|NEWLINE)* instruction (COMMENT|SPACE)* NEWLINE)+  '}' NEWLINE* EOF;
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
              |direction
              |test
              |breed;

turn:        'turn'      (COMMENT*|SPACE*) ('left'|'right')                (COMMENT*|SPACE*);
mark:        'mark'      (COMMENT*|SPACE*) (MARKER|REGISTER)               (COMMENT*|SPACE*);
unmark:      'unmark'    (COMMENT*|SPACE*) (MARKER|REGISTER)               (COMMENT*|SPACE*);
set:         'set'       (COMMENT*|SPACE*) REGISTER                        (COMMENT*|SPACE*);
unset:       'unset'     (COMMENT*|SPACE*) REGISTER                        (COMMENT*|SPACE*);
jump:        'jump'      (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER)        (COMMENT*|SPACE*);
sensemarker: 'sense'     (COMMENT*|SPACE*) ('here'|'ahead'|'left'|'right') (COMMENT*|SPACE*) 'marker' (COMMENT*|SPACE*) (MARKER|REGISTER) (COMMENT*|SPACE*) 'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;
sense:       'sense'     (COMMENT*|SPACE*) ('here'|'ahead'|'left'|'right') (COMMENT*|SPACE*) TARGET   (COMMENT*|SPACE*)                                     'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;
flip:        'flip'      (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER)        (COMMENT*|SPACE*)                                                                'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;
test:        'test'      (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER)        (COMMENT*|SPACE*)                                                                'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;
direction:   'direction' (COMMENT*|SPACE*) DIRECTION                       (COMMENT*|SPACE*)                                                                'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER)                   ;
pickup:      'pickup'    (COMMENT*|SPACE*)                                                                                                                  'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;
drop:        'drop'      (COMMENT*|SPACE*)                                                                                                                  'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;
move:        'move'      (COMMENT*|SPACE*)                                                                                                                  'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;
breed:       'breed'     (COMMENT*|SPACE*)                                                                                                                  'else' (COMMENT*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENT*|SPACE*) ;

TARGET : 'foe' | 'foehome' | 'friend' | 'food' | 'antlion' | 'rock' | 'foefood' | 'foemarker' | 'home' | 'friendfood';
DIRECTION :  'northwest' | 'west' | 'southwest' | 'southeast' | 'east' | 'northeast';
REGISTER : [0-5];
MARKER : [0-6];
NUMBER : [0-9]+;
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
COMMENT : ('/*' .*? '*/' | '//' .*? ('\n'|'\r'|'\\n'|'\\r')) {setText(" ");};
SPACE : ([ ]|[	]);
NEWLINE : ('\n'|'\r'|'\\n'|'\\r'|'\\u'[0-9][0-9][0-9][0-9]);
