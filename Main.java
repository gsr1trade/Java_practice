public class Main {

}

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // ...
// System.out.println(addition03(1, 2));
// }

// // 以下のメソッドを実装し、mainメソッドで呼び出しましょう。
// // メソッド名 addition03
// // メソッド説明 引数「baseNum」と引数「addNum」の加算結果を返却するメソッド
// // return int
// // 引数1 int baseNum
// // 引数2 int addNum
// // ...
// public static int addition03(int baseNum, int addNum) {
// int result = baseNum + addNum;
// return result;
// }
// public static void main(String[] args) {

// // 現在の年齢からx年後の年齢を算出し、「x年後は？歳です。」と出力するプログラムを作成する。
// // ➀x年後の年齢を計算するメソッドを作る
// // ➁出力メソッドを作る
// int a = 10;
// int x = 3;
// int afterAge = x + a;
// add(a, x);
// System.out.println(x + "年後は" + afterAge + "です。");
// }

// // main以外のメソッドを２つ作ること。引数、戻り値を何にすべきかは、自分で考えましょう。
// public static int add(int a, int x) {
// int afterAge = a + x;
// return afterAge;
// }
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // 「太郎さん」と表示する。
// System.out.println(output());
// }

// // コンパイルエラーを解消しよう。

// /**
// * 名前に「さん」を付けて「◯◯さん」という文字列を返却する。
// *
// * @param name 名前
// */

// public static String output() {
// String result = "太郎";
// return result + "さん";
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // コンパイルエラーを解消し、「太郎さん」と表示するように修正しよう。
// System.out.println(output());
// }

// /**
// * 名前に「さん」を付けて「◯◯さん」という文字列を返却する。
// *
// * @param name 名前
// */
// public static String output() {
// String name = "太郎";
// return name + "さん";
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // // コンパイルエラーを解消しよう。
// String result = test();
// System.out.println(result);

// }

// public static String test() {
// return "テスト";
// }
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // コンパイルエラーを解消しよう。
// System.out.println(test());
// }

// public static String test() {
// return "テスト";
// }

// public static void main(String[] args) {
// // addメソッドの加算結果をmainメソッドで出力するように修正しよう。
// System.out.println(add(5, 2));
// }

// public static int add(int a, int b) {
// int result = a + b;
// return result;
// }
// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // 現在の年齢から10年後の年齢を算出し、「10年後は20歳です。」と出力するプログラムを作成する。
// // ...
// System.out.println(add(a + "年後は" + afterAge + "です。"));

// }

// // main以外のメソッドを１つ作ること。引数、戻り値を何にすべきかは、自分で考えましょう。
// // ...
// public static int add(int a, int b) {
// a = 10;
// b = 20;
// int afterAge = a + b;
// return afterAge;
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // ...
// System.out.print(addition03(9, 0));
// }

// // 以下のメソッドを実装し、mainメソッドで呼び出しましょう。
// // メソッド名 addition03
// // メソッド説明 引数「baseNum」と引数「addNum」の加算結果を返却するメソッド
// // return int
// // 引数1 int baseNum
// // 引数2 int addNum
// // ...
// public static int addition03(int baseNum, int addNum) {
// return baseNum + addNum;
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// int firstNum = 10;
// int secondNum = 20;
// int result = add(firstNum, secondNum);
// System.out.println(result);

// /*
// * 期待値：
// * 30
// */
// }

// // 2つの引数（数値）を受け取り、その合計を返却する。
// // ...
// public static int add(int firstNum, int secondNum) {
// return firstNum + secondNum;
// }
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // mainメソッドでgetResultメソッドを呼び出し、その結果が「true」の場合「当たり」、「false」の場合「ハズレ」と出力する。
// // ...
// if (getResult() == true) {
// System.out.println("当たり");
// } else {
// System.out.println("ハズレ");
// }

// }

// public static boolean getResult() {
// // 0～1の数字をランダムに生成
// Random r = new Random();
// int ret = r.nextInt(2);
// if (ret == 1) {
// // 1ならtrueを返す
// return true;
// } else {
// // そうでないならfalseを返す
// return false;
// }
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // mainメソッドでaddメソッドを呼び出し、「30」と出力する。
// // ...

// /*
// * 期待値：
// * 30
// */
// System.out.println(add() + "です。");

// }

// public static int add() {
// int sum = 10 + 20;
// return sum;
// }

// public static void main(String[] args) {
// // TODO Java入門015 - 戻り値
// // 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/157

// // mainメソッドでopenメソッドを呼び出し、「スタートします。」と出力する。
// // ...

// /*
// * 期待値：
// * スタートします。
// */

// System.out.println(open());
// }

// public static String open() {
// String msg = "スタートします。";
// return msg;
// }

// public static void main(String[] args) {
// TODO Java入門014 - コマンドライン引数
// 参考：https://gluenet-gset.appspot.com/course/1/unit/6/lesson/156

// コマンドライン引数の1番目、2番目、3番目の値を出力する。
// ...

/*
 * eclipseでのコマンドライン引数の渡し方：
 * メインクラスを右クリック
 * ⇒実行
 * ⇒実行の構成
 * ⇒Javaアプリケーション -> 新規構成
 * ⇒「引数」タブを開き、「プログラムの引数」に「a b c」などのコマンドライン引数の値を入力する
 * ⇒「適用」「実行」
 */

/*
 * 期待値：
 * java Main（クラス名）a b c（半角数字）
 * 
 */
// }

// public static void main(String[] args) {
// System.out.println("start");
// System.out.println("1の10倍は、" + multiply(1, 10) + "です。");
// System.out.println("2の3倍は、" + multiply(2, 3) + "です。");
// System.out.println("end");
// }

// public static int multiply(int firstValue, int secondValue) {
// return firstValue * secondValue;
// }
// }

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