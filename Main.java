public class Main {

  public static void main(String[] args) {
    System.out.println("start");
    System.out.println("1の10倍は、" + multiply(1, 10) + "です。");
    System.out.println("2の3倍は、" + multiply(2, 3) + "です。");
    System.out.println("end");
  }

  public static int multiply(int firstValue, int secondValue) {
    return firstValue * secondValue;
  }
}

// void 何もリターンしない
// int intでリターンをする

// /**
// * 文字列をint型に変換します。
// *
// * @param num 変換する値
// * @return 変換後の数値
// * @throws NumberFormatException 引数numに数字でない文字列が渡った場合に発生。
// */
// static int convertInt(String num) throws NumberFormatException {
// return Integer.parseInt(num);
// }
// }

// public static void main(String[] args) {
// greet("はま");
// }

// コマンドライン引数：mainメソッドに渡す引数
// コマンドライン引数:mainメソッドに渡す引数

// public static void greet(String name) {
// System.out.print(name + "さんこんにちは");
// }

// public static void main(String[] args) {
// // なぜこれがいけちゃうの？
// // 別のメソッドブロックから参照しているから、違う名前でもOK
// String myn = "はま";
// greet(myn);
// }

// public static void greet(String name) {
// System.out.print(name + "さんこんにちは");
// }

// public class Main {

// public static void main(String[] args) {

// add(1, 3);
// }

// public static void add(int firstNumber, int secondNumber) {
// int Kekka = firstNumber + secondNumber;
// System.out.print(Kekka);
// }
// }

// public static void main(String[] args) {
// // String name = "はま";
// // int age = 25;
// // nenrei(name,age);
// nenrei("はま", 25);
// }

// public static void nenrei(String name, int age) {
// System.out.print(name + "さんの年齢は" + age + "です。");
// }

// コマンドライン引数は以下のように渡す
// java Main あ い う え お

// 戻り値：返却値
// public static void main(String[] args) {
// }

// public static String greet() {
// return "こんにちは";
// }

// public static void main(String[] args) {
// System.out.print(greet());
// }

// public static String greet() {
// String message = "こんにちは";
// return message;
// }
// // public static boolean test(){
// // return true;
// // }
// // public static int getAge() {
// // return 123;
// // }