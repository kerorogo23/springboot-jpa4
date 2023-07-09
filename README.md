## 簡介

使用Spring Boot 開發的簡易後台網站。

## 環境

1. Java JDK 11
2. Spring Boot: 2.3.7
3. MySQL: 8.0.31
4. IntelliJ IDEA


## 技術

* 前端：React
* 後端：Java

* 框架：Spring Boot
* 資料庫：MySQL
* ORM映射：Spring Date JPA/Hibernate
* 雜湊(Hash)：MD5 Hash
* 請求：axios

* 版控：Git、GitHub
* 測試：Postman

## API

* 帳號功能
    - 註冊新帳號
    - 登入

* 商品功能
    - 新增／查詢／修改／刪除商品 (CRUD)
    - 查詢商品列表


### 帳號功能

1. 註冊新帳號<br>
   `POST:   localhost:8080/users/register`

2. 登入<br>
   `POST:   localhost:8080/users/login`<br>
   request body
    ```
    {
      "email" : "Test100@gmail.com",
      "password" : "123456"
    }
    ```
![user request](https://github.com/kerorogo23/springboot-jpa4/assets/86586247/ad77df5c-ce0c-4d59-8695-933d0272559e)


### 商品功能：
1. 新增／查詢／修改／刪除商品(CRUD)

   |*method*|*url*|*description*|
      |--|--|--|
   |POST|`localhost:8080/products`|新增|
   |GET|`localhost:8080/products/{productId}`|查詢|
   |PUT|`localhost:8080/products/{productId}`|修改|
   |DELETE|`localhost:8080/products/{productId}`|刪除|

   POST & PUT request body
     ```
      {
          "productName" : "碼頭上的陌生人",
          "category" : "CHINESE",
          "imageUrl" : "[https://im2.book.com.tw/image/getImage?i=https://www.books.com.tw/img/001/068/87/0010688757.jpg&v=55e42cd7k&w=280&h=280](https://im2.book.com.tw/image/getImage?i=https://www.books.com.tw/img/001/095/05/0010950531.jpg&v=63ee05fck&w=348&h=348)",
          "price" : 300,
          "stock" : 50,
          "description" : "※特別收錄-歐大旭新撰〈自序〉獻給中文版讀者。學者熊婷惠〈那張臉、陌生人與倖存者〉專文評析"
      }
      ```

 ### 新增(creatd)
 ![create](https://github.com/kerorogo23/springboot-jpa4/assets/86586247/4d17aef8-4187-4b7b-9da4-bdfc8e80948e)

 ### 查詢(read)
 ![read](https://github.com/kerorogo23/springboot-jpa4/assets/86586247/af41199a-bdfc-47ba-bbd8-1195ff57906f)

 ### 修改(update)
 ![update](https://github.com/kerorogo23/springboot-jpa4/assets/86586247/1314734a-0818-4bed-8462-6ab6946133be)

 ### 刪除(delete)
 ![delete](https://github.com/kerorogo23/springboot-jpa4/assets/86586247/44d3349f-1e66-4bbd-8e7f-bed7021ace90)

 ### 商品列表(get products)
 ![products](https://github.com/kerorogo23/springboot-jpa4/assets/86586247/21375b36-eff2-4eca-97b9-7ae808a11437)

```
→ Thanks for watching！！
→ 謝謝觀看！！
```
