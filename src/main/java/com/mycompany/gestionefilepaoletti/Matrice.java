public class Matrice {

  char mv[][];
  String verme;

  public Matrice(String verme) {
    this.mv = new char[26][26];
    this.verme = verme;
  }

  public void setElemento(int r, int c, int el) {
    this.mv[r][c] = (char) el;
  }

  public char getElemento(int r, int c) {
    return mv[r][c];
  }

  public void stampa() {
    int r = 0;
    int c = 0;

    for (r = 0; r < 26; r++) {
      for (c = 0; c < 26; c++) {

        System.out.print(this.getElemento(r, c));
      }
      System.out.print("\n");
    }
  }

  public String cifra(String fch) {
    String fcf;
    int k, j, col, row;
    fcf = "";
    k = 0;

    for (j = 0; j < fch.length(); j++) {

      if (k == verme.length()) {
        k = 0;
      }
      col = (int) fch.charAt(j) - 65;
      row = (int) verme.charAt(k) - 65;
      if ((int) fch.charAt(j) == 32) {
        fcf = fcf + " ";
      } else {
        fcf = fcf + mv[row][col];
      }
      k++;
    }

    return (fcf);
  }

  public String deCifra(String fcf) {
    String fch = "";

    int k, j, col, row;

    k = 0;

    for (j = 0; j < fcf.length(); j++) {

      if (k == verme.length()) {
        k = 0;
      }
      row = (int) verme.charAt(k) - 65;
      if ((int) fcf.charAt(j) == 32) {
        fch = fch + " ";
      }
      for (col = 0; col < 26; col++) {
        if (mv[row][col] == fcf.charAt(j)) {
          char car = (char) (col + 65);
          fch += car;
        }
      }

      k++;
    }

    return (fch);
  }
}
