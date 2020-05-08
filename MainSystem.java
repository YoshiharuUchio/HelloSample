package jp.co.sss.crud.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import jp.co.sss.crud.db.DBController;

/**
 * 社員管理システム実行用クラス
 */
public class MainSystem {
	/**
	 * メイン処理
	 *
	 * @param args
	 *            コマンドライン引数
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int menuNo = 0;
		try {
			do {
				// メニューの表示
				System.out.println("=== 社員管理システム ===");
				System.out.println("1. 全件表示");
				System.out.println("2. 登録");
				System.out.println("3. 更新");
				System.out.println("4. 削除");
				System.out.println("5. 終了");
				System.out.print("メニュー番号を入力してください:");

				// メニュー番号の入力
				String menuNoStr = br.readLine();
				menuNo = Integer.parseInt(menuNoStr);

				// 機能の呼出
				switch (menuNo) {
				case 1:
					// 全件表示機能の呼出
					DBController.findAll();
					break;
				case 2:
					// 登録する値を入力
					System.out.print("社員名:");
					String empName = br.readLine();
					System.out.print("性別(1:男性, 2:女性):");
					String gender = br.readLine();
					System.out.print("生年月日(西暦年/月/日):");
					String birthday = br.readLine();
					System.out.print("部署ID(1:営業部、2:経理部、3:総務部):");
					String deptId = br.readLine();

					// 登録機能の呼出
					DBController.insert(empName, gender, birthday, deptId);
					break;
				case 3:
					// 更新
					break;
				case 4:
					// 削除
					break;
				}
			} while (menuNo != 5);
		} catch (Exception e) {
			System.out.println("システムエラーが発生しました");
			e.printStackTrace();
		}
		System.out.println("システムを終了します。");
	}

}
