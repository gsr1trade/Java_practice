
// Java課題（引数No3）
public class Sample03_03 {
  public static void main(String[] args) {

    // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/155
    // mainメソッドでaddメソッドを呼び出し「合計は、30です。」と出力する。
    int firstNum = 10;
    int secondNum = 20;
    add(firstNum, secondNum);
    // ...
    /*
     * 期待値：
     * 合計は、30です。
     */

  }

  // ...
  public static void add(int firstNum, int secondNum) {
    int Number = firstNum + secondNum;
    System.out.print("合計は" + Number + "です");
  }
}
