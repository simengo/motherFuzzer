grammar Acola;

@parser::members
{
  @Override
  public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException ex)
  {
    throw new IllegalArgumentException(msg);
  }
}

@lexer::members
{
  @Override
  public void recover(RecognitionException ex)
  {
    throw new IllegalArgumentException(ex.getMessage());
  }
}

brain : 'brain' (COMMENTWITHNEWLINE|COMMENTS|SPACE|NEWLINE)* '"' IDENTIFIER '"' (COMMENTWITHNEWLINE|COMMENTS|SPACE|NEWLINE)* '{' ((COMMENTWITHNEWLINE|COMMENTS|SPACE|NEWLINE)* instruction ((COMMENTS|SPACE)* (COMMENTWITHNEWLINE|NEWLINE)+)*)+  '}' (COMMENTWITHNEWLINE|COMMENTS|NEWLINE)* EOF;
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

turn:        'turn'      (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ('left'|'right')               (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*);
mark:        'mark'      (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (MARKER|REGISTER)              (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*);
unmark:      'unmark'    (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (MARKER|REGISTER)               (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*);
set:         'set'       (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) REGISTER                        (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*);
unset:       'unset'     (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) REGISTER                        (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*);
jump:        'jump'      (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER)        (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*);
sensemarker: 'sense'     (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ('here'|'ahead'|'left'|'right') (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) 'marker' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) 'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;
sense:       'sense'     (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ('here'|'ahead'|'left'|'right') (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) TARGET   (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                          'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;
flip:        'flip'      (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER)        (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                                                                          'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;
test:        'test'      (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) REGISTER                        (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                                                                          'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;
direction:   'direction' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) DIRECTION                       (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                                                                          'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER)                   ;
pickup:      'pickup'    (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                                                                                                                                                 'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;
drop:        'drop'      (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                                                                                                                                                 'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;
move:        'move'      (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                                                                                                                                                 'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;
breed:       'breed'     (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*)                                                                                                                                                                                 'else' (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) (NUMBER|MARKER|REGISTER) (COMMENTWITHNEWLINE*|COMMENTS*|SPACE*) ;

TARGET : 'foe' | 'foehome' | 'friend' | 'food' | 'antlion' | 'rock' | 'foefood' | 'foemarker' | 'home' | 'friendfood';
DIRECTION :  'northwest' | 'west' | 'southwest' | 'southeast' | 'east' | 'northeast';
REGISTER : [0-5];
MARKER : [0-6];
NUMBER : [0-9]+;
KEYWORD : 'brain'|'mark'|'unmark'|'turn'|'move'|'sense'|'set'|'unset'|'pickup'|'drop'|'jump'|'flip'|'sensemarker'|'direction'|'test'|'breed';
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
COMMENTWITHNEWLINE : ('/*' ([.]*[\n]+)+ '*/' | '//' .*? ('\n'|'\r'|'\\n'|'\\r')) {setText(" \n");};
COMMENTS : ('/*' .*? '*/') {setText(" ");};
SPACE : ([ ]|[	]);
NEWLINE : ('\n'|'\r'|'\\n'|'\\r');
