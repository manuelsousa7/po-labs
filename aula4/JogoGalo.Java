class JogoGalo {
  private int _dimention;
  Peca[][] tabuleiro;
  public JogoGalo(int dimensao){
    _dimensao = dimensao;
    tabuleiro = new Peca[_dimensao][_dimensaos];
    for(int i = 0; i < _dimensao; i++){
      for(int ii = 0; ii < _dimensao; ii++){
        tabuleiro[i][ii] = new PACKAGE.PecaLivre();

      }
    }
  }
  public Boolean JogoGalo(int linha,int coluna){
    if(tabuleiro[linha][coluna] == PACKAGE.PecaLivre()){
      tabuleiro[linha][coluna] = 
      return true;
    } else {
      return false;
    }
  }

  public Boolean freePositions(){
    for(int i = 0; i < _dimensao; i++){
      for(int ii = 0; ii < _dimensao; ii++){
        if(tabuleiro[i][ii] == PACKAGE.PecaLivre())
          return false;

      }
    }
    return true;
  }
  public void printGame(){
    for(int i = 0; i < _dimensao; i++){
      for(int ii = 0; ii < _dimensao; ii++){
          System.out.print(tabuleiro[i][ii].getSymbol() + "%s",(ii+1) != _dimensao ? "|" : "\n");
      }
      System.out.println("-+-+-");
    }
  }

  public static void main(String[] args) {
    
  }
}