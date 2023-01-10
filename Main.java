class Main {
  public static void main(String[] args) {
    final int lines = 6;

    for (int i = 1; i <= lines; i++) {
      for(int j = 1; j <= i; j++){
        System.out.print(Integer.toString(i));
      }
      System.out.println();
    }
  }
}