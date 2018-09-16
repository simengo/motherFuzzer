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

brain : 'brain' (COMMENTS|SPACE|NEWLINE)+ '"' IDENTIFIER '"' (COMMENTS|SPACE|NEWLINE)* '{' ((NEWLINE|COMMENTS|SPACE)* instruction ((COMMENTS|SPACE)* (NEWLINE)+)+)+  '}' (NEWLINE|COMMENTS|SPACE)* EOF;
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

turn:        'turn'      (COMMENTS|SPACE)* ('left'|'right')        ;
mark:        'mark'      (COMMENTS|SPACE)* (MARKER|REGISTER)       ;
unmark:      'unmark'    (COMMENTS|SPACE)* (MARKER|REGISTER)       ;
set:         'set'       (COMMENTS|SPACE)* REGISTER                ;
unset:       'unset'     (COMMENTS|SPACE)* REGISTER                ;
jump:        'jump'      (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER);
sensemarker: 'sense'     (COMMENTS|SPACE)* ('here'|'ahead'|'left'|'right') (COMMENTS|SPACE)* 'marker' (COMMENTS|SPACE)* (MARKER|REGISTER) (COMMENTS|SPACE)* 'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
sense:       'sense'     (COMMENTS|SPACE)* ('here'|'ahead'|'left'|'right') (COMMENTS|SPACE)* TARGET   (COMMENTS|SPACE)*                                             'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
flip:        'flip'      (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER)        (COMMENTS|SPACE)*                                                                                'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
test:        'test'      (COMMENTS|SPACE)* REGISTER                        (COMMENTS|SPACE)*                                                                                'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
direction:   'direction' (COMMENTS|SPACE)* DIRECTION                       (COMMENTS|SPACE)*                                                                                'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
pickup:      'pickup'    (COMMENTS|SPACE)*                                                                                                                                          'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
drop:        'drop'      (COMMENTS|SPACE)*                                                                                                                                          'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
move:        'move'      (COMMENTS|SPACE)*                                                                                                                                          'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
breed:       'breed'     (COMMENTS|SPACE)*                                                                                                                                          'else' (COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;

TARGET : 'foe' | 'foehome' | 'friend' | 'food' | 'antlion' | 'rock' | 'foefood' | 'foemarker' | 'home' | 'friendfood';
DIRECTION :  'northwest' | 'west' | 'southwest' | 'southeast' | 'east' | 'northeast';
REGISTER : [0-5];
MARKER : [0-6];
NUMBER : [0-9]+;
KEYWORD : 'brain'|'mark'|'unmark'|'turn'|'move'|'sense'|'set'|'unset'|'pickup'|'drop'|'jump'|'flip'|'sensemarker'|'direction'|'test'|'breed';
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
SPACE : (' '|'\\t'|'\t'|' ')+;
NEWLINE : ('\n'|'\r'| '/*' ((~[*]|[*]~[/])*? ('\n'|'\r')+ (~[*]|[*]~[/])*?)+ '*/' | '//' (~[\n\r])*? ('\n'|'\r'));
COMMENTS : ('/*' (~[\n\r])*? '*/');
