# ProxyPattern

📽️ Proxy Pattern là một mẫu thiết kế phần mềm thuộc nhóm cấu trúc (Structural Pattern) trong lập trình hướng đối tượng. Mục đích của nó là cung cấp một đối tượng thay thế cho một đối tượng khác, đóng vai trò như một người đại diện (proxy) để truy cập đối tượng gốc.

🥇 Trong Proxy Pattern, đối tượng proxy thường có cùng giao diện với đối tượng gốc, do đó, khi sử dụng đối tượng proxy, người dùng không cần phải biết về đối tượng gốc thực sự đang được sử dụng. Việc này có thể giúp giảm tải cho đối tượng gốc bằng cách giữ các tài nguyên và trì hoãn việc khởi tạo đối tượng gốc cho đến khi cần thiết.

🥈 Proxy Pattern có thể được sử dụng trong nhiều trường hợp khác nhau, chẳng hạn như:
- Tối ưu hoá tải cho các đối tượng có kích thước lớn, hoặc đối tượng cần phải được tạo mất nhiều thời gian.
- Giới hạn quyền truy cập cho các đối tượng (Kiểm tra quyên quyền user trước khi vào controller, khi sử dụng object,...)
- bXử lý các yêu cầu trước khi chuyển tiếp chúng đến đối tượng gốc (logging trước và sau request, response).
- Tạo các ghi chú hoặc ghi lại các hoạt động của đối tượng gốc.
- Tách biệt mã của đối tượng gốc và mã của đối tượng liên quan đến việc sử dụng đối tượng gốc.

😃 Khá giống với lập trình AOP, vì AOP dựa theo nguyên lý của Proxy Pattern để lập trình hướng khía cạnh các phần phụ trợ cho code chính. Ví dụ như catch Exception Global, Logging request response, kiểm tra quyền user trước khi vào controller,...
