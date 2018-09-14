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

brain : 'brain' (NEWLINE|COMMENTS|SPACE|NEWLINE)+ '"' IDENTIFIER '"' (NEWLINE|COMMENTS|SPACE|NEWLINE)* '{' ((NEWLINE|COMMENTS|SPACE|NEWLINE)* instruction ((COMMENTS|SPACE)* (NEWLINE)+ (COMMENTS|SPACE)*)+)+  '}' (NEWLINE|COMMENTS|NEWLINE)* EOF;
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

turn:        'turn'      (NEWLINE|COMMENTS|SPACE)* ('left'|'right')        ;
mark:        'mark'      (NEWLINE|COMMENTS|SPACE)* (MARKER|REGISTER)       ;
unmark:      'unmark'    (NEWLINE|COMMENTS|SPACE)* (MARKER|REGISTER)       ;
set:         'set'       (NEWLINE|COMMENTS|SPACE)* REGISTER                ;
unset:       'unset'     (NEWLINE|COMMENTS|SPACE)* REGISTER                ;
jump:        'jump'      (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER);
sensemarker: 'sense'     (NEWLINE|COMMENTS|SPACE)* ('here'|'ahead'|'left'|'right') (NEWLINE|COMMENTS|SPACE)* 'marker' (NEWLINE|COMMENTS|SPACE)* (MARKER|REGISTER) (NEWLINE|COMMENTS|SPACE)* 'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
sense:       'sense'     (NEWLINE|COMMENTS|SPACE)* ('here'|'ahead'|'left'|'right') (NEWLINE|COMMENTS|SPACE)* TARGET   (NEWLINE|COMMENTS|SPACE)*                                             'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
flip:        'flip'      (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER)        (NEWLINE|COMMENTS|SPACE)*                                                                                'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
test:        'test'      (NEWLINE|COMMENTS|SPACE)* REGISTER                        (NEWLINE|COMMENTS|SPACE)*                                                                                'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
direction:   'direction' (NEWLINE|COMMENTS|SPACE)* DIRECTION                       (NEWLINE|COMMENTS|SPACE)*                                                                                'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
pickup:      'pickup'    (NEWLINE|COMMENTS|SPACE)*                                                                                                                                          'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
drop:        'drop'      (NEWLINE|COMMENTS|SPACE)*                                                                                                                                          'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
move:        'move'      (NEWLINE|COMMENTS|SPACE)*                                                                                                                                          'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;
breed:       'breed'     (NEWLINE|COMMENTS|SPACE)*                                                                                                                                          'else' (NEWLINE|COMMENTS|SPACE)* (NUMBER|MARKER|REGISTER) ;

TARGET : 'foe' | 'foehome' | 'friend' | 'food' | 'antlion' | 'rock' | 'foefood' | 'foemarker' | 'home' | 'friendfood';
DIRECTION :  'northwest' | 'west' | 'southwest' | 'southeast' | 'east' | 'northeast';
REGISTER : [0-5];
MARKER : [0-6];
NUMBER : [0-9]+;
KEYWORD : 'brain'|'mark'|'unmark'|'turn'|'move'|'sense'|'set'|'unset'|'pickup'|'drop'|'jump'|'flip'|'sensemarker'|'direction'|'test'|'breed';
IDENTIFIER : [a-zA-Z_.-][a-zA-Z0-9_.-]+;
SPACE : (' '|'\\t'|' ')+;
NEWLINE : ('\n'|'\r'|'\\n'|'\\r'|'/*' ([.]*[\n][.]*) '*/' | '//' .*? ('\n'|'\r'|'\\n'|'\\r'));
COMMENTS : ('/*' .*? '*/');
