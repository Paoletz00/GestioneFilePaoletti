public class Vigenere implements Runnable {

  private int initialRow;
  private int finalRow;
  private int initialColumn;
  private int finalColumn;
  private Matrix matrix;


  public Vigenere(int initialRow, int finalRow, int initialColumn, int finalColumn, Matrix matrix) {
    this.initialRow = initialRow;
    this.finalRow = finalRow;
    this.initialColumn = initialColumn;
    this.finalColumn = finalColumn;
    this.matrix = matrix;
  }

  @Override
  public void run() {
    populate();
  }

 
  private void populate() {
    int c, r, character;
    for (r = initialRow; r < finalRow; r++) {
      for (c = initialColumn; c < finalColumn; c++) {
        character = r + c + 65;
        if (character > 90) {
          character = character - 26;
        }
        this.matrix.setElement(r, c, character);
      }
    }
  }
}
