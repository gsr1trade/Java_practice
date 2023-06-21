// Java課題（引数No4）
public class Sample03_04 {

  public static void main(String[] args) {

    // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/155

    // 「30」と出力されるように修正しよう。
    int a = 10;
    int b = 20;
    add(a, b);

    /*
     * 期待値：
     * 合計は、30です。
     */
  }

  public static void add(int a, int b) {
    int result = a + b;
    System.out.println(result);
  }
}
