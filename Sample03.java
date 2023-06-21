
// Java課題（引数No1）
public class Sample03 {
  public static void main(String[] args) {

    // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/155
    // mainメソッドでopenメソッドを呼び出し「この方は山田さんです。」と出力する。
    String name = "山田";
    open(name);
    /*
     * 期待値：
     * この方は山田さんです。
     */
  }

  public static void open(String name) {
    System.out.println("この方は" + name + "さんです。");
  }
}
