public class Sample03_05 {
  public static void main(String[] args) {

    // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/155

    // mainメソッドの変数「a」「b」を、addメソッドで使えるように修正しよう。
    int a = 10;
    int b = 20;
    add(a, b);
  }

  public static void add(int a, int b) {
    int result = a + b;
    System.out.println(result);
  }
}

//// 全選択「ctrl + A」⇒コメントアウト解除「ctrl + shift + C」を行ってから対応してください。
