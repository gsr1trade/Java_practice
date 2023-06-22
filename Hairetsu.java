public class Hairetsu {
  public static void main(String[] args) {
    int[] vals = { 1, 2, 3 };
    test(vals);
    System.out.println(vals[1]);
  }

  static int[] test(int[] nums) {
    nums[1] = 9;
    return nums;
  }
}

// String[] array = new String[];
// String[] Hamaoka = new String[3];
// array[2] = "Tokyo";
// 濱岡という箱にTokyoを代入する。

// この代入方法は１回のみしか使用できない。
// String[] array = {"ハマ","りょ","おか"};

// String[] Hamaoka;
// Hamaoka = new String[0];
// Hamaoka[0] = "岡";
// // 型名 変数名;
// // 変数名 ＝ 値;
// //型名 変数名 ＝ 値;

// 変数名＝array
// 型名 変数名;
// 変数名 ＝ 値;
// 型名 変数名 ＝ 値;
