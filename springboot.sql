/* データベース作成 （作成済みの場合はスキップ） */
CREATE DATABASE spring_db;

/* spring_dbに接続して以下のSQLを実行 */

/* テーブル作成 */
CREATE TABLE products (
  id   SERIAL PRIMARY KEY, --自動採番
  name VARCHAR(50),
  price        INT
);

/* データ登録 */
INSERT INTO products (name, price)
VALUES ('鉛筆',50), ('消しゴム',100), ('地球儀',5000);
