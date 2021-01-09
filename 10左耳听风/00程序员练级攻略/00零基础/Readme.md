# 零基础

## 一、学习内容

### Python编程：

​		1、《Python编程快速上手》

​		2、《Python编程：从入门到实践》

### JvavScript编程：

​		1、MDN JavaScript教程：https://developer.mozilla.org/zh-CN/docs/Web/JavaScript  最权威的官方教程，从初级到高级；

​		2、JavaScript全栈教程（廖雪峰）：https://www.liaoxuefeng.com/wiki/1022910821149312  偏应用的教程；

### Linux系统：

​		1、Linux教程：https://www.w3cschool.cn/linux/

​		2、鸟哥的Linux私房菜：http://linux.vbird.org/new_linux.php

编译工具：Visual Studio Code

### Web编程：

​		1、前端基础：

​				CSS文档：https://developer.mozilla.org/zh-CN/docs/Web/CSS

​				HTML文档：https://developer.mozilla.org/zh-CN/docs/Web/HTML

​				JavaScript操纵HTML：

​		2、后端基础：

​				PHP教程：https://www.w3school.com.cn/php/index.asp

​				PHP官网文档：https://www.php.net/manual/zh/

## 二、学习要点

​		1、学习HTML基本语法；

​		2、学习CSS如何选中HTML元素并应用一些基本样式；

​		3、学会用Firefox+Firebug或者Chrome查看网页结构，并动态修改；

​		4、在Linux上配置LEMP —— Ubuntu/Nginx/PHP/MySQL这个环境；

​		5、后台PHP和前台PHP进行数据交互，初步认识服务器响应浏览器请求，实现一个表单提交和反显的功能；

​		6、把PHP连接本地挥着远程数据MySQL。

## 三、实践项目

基础功能：

​		1、用户登录和注册（不需要密码找回）；

​		2、用户发帖（不需要支持富文本，只需支持纯文本）；

​		3、用户评论（不需要支持富文本，只需支持纯文本）；

技术应用：

​		HTML/CSS/ + Python/PHP + MySQL

技术要点：

​		1、用户登录时的密码不应该保存未明文，应该用MD5+Salt来保存；

​		2、用户登录后，对于用户自己的帖子可以有“重新编辑”和“删除”的功能，但是无权编辑或者删除其他用户的帖子；

​		3、数据库的设计，需要三张表：用户表、文章表和评论表。（PHP建表教程：https://code.tutsplus.com/tutorials/how-to-create-a-phpmysql-powered-forum-from-scratch--net-10188）

项目拓展：

​		1、图片验证；

​		2、上传图片；

​		3、组织用户在发文章或者评论时输入带HTML或JavaScript的内容；

​		4、防范SQL注入（PHP官方文档：https://www.php.net/manual/zh/security.database.sql-injection.php或者微软官方文档：https://docs.microsoft.com/zh-cn/previous-versions/sql/sql-server-2008-r2/ms161953(v=sql.105)?redirectedfrom=MSDN）。