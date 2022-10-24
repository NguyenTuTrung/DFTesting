# DFTesting
- Nguyễn Việt Hoàng
- MSSV: 20020196
## Bài toán
Trên một mảnh đất có một khu vực nguy hiểm nơi đặt bẫy mìn của quân đội. Có
một người bất kì đang đứng tại mảnh đất đó hãy xác định xem người này có đang ở
trong khu vực nguy hiểm không ? Biết khi chiếu toàn bộ hệ vật lên trục toạ độ đề
các ta có toàn bộ khu đất là hình chữ nhật được giới hạn bởi 4 đường thẳng
x = 1, x = 5, y = -2, y = 7 , trong đó khu vực nguy hiểm là hình được giới hạn bới 4
đường thẳng x = 2, x = 3.5, y = 0, y = 5 và người đang cần xác định là một điểm có
toạ độ (x,y)

## CFG
![](./src/main/resources/program.png)

## Mã nguồn
1.     public boolean isBelongRectangle(double x, double y) {
2.         if (x >= 2 && x <= 3.5) {
3.             if (y >= 0 && y <= 5) {
4.                 return true;
5.             } else {
6.                 return false;
               }
7.         } else {
8.             return false;
9.         }
10.     }

## Testcases all-c-uses/some-p-uses
- Biến x:
    - def(x): 1
    - p-use(x): 2
    - c-use(x): không có
- Biến y:
    - def(y): 1
    - p-use(y): 3
  - c-use(y): không có



| Variable | Du-pair   | Def-clear path | Complete path    |
|----------|-----------|----------------|------------------|
| x        | (1, 2(T)  | 1, 2(T)        | 1, 2(T), 3(T), 4 |
|          | (1, 2(F)  | 1, 2(F)        | 1, 2(F), 8       |
| y        | (1, 3(T)) | 1, 2(T), 3(T)  | 1, 2(T), 3(T), 4 |
|          | (1, 3(F)) | 1, 2(T), 3(F)  | 1, 2(T), 3(F), 6 |

## Kết quả
| ID | Input x | Input y | Expected Output | Actual Output | Result  |
|----|---------|---------|-----------------|---------------|---------|
| 1  | 3       | 5       | True            | True          | Passed  |
| 2  | 0       | -5      | False           | False         | Passed  |
| 3  | 3       | 2       | True            | True          | Passed  |
| 4  | 3       | 7       | False           | False         | Passed  |

 ![](src/main/resources/result.png)