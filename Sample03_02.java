public class Sample03_02 {
  // Java課題（引数No2）
  public static void main(String[] args) {

    // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/155
    // mainメソッドでopenメソッドを呼び出し「この方は山田さん、20歳です。」と出力する。
    String name = "山田";
    int age = 20;
    main(name, age);

    // open...
    /*
     * 期待値：
     * この方は山田さん、20歳です。
     */
  }

  // public static open...
  public static void main(String name, int age) {
    System.out.print("この方は" + name + "さん、" + age + "歳です。");
  }
}