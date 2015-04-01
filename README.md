基础web框架
========================================

---
### 基本结构
1. springmvc+mybatis+freemarker
2. maven项目

### 使用方式
1. 导入eclipse,在项目根目录下 mvn eclipse:eclipse,如果是导入idea,则执行mvn idea:idea
2. 项目配置中集成了jetty-run插件,执行 mvn clean package -Djetty.port=9426 jetty:run,
    就可以看到项目已经启动,访问 http://localhost:9426/demo/getUser .
3.如果部署到tomcat/resin等server,可以执行 mvn clean package, 然后将根目录下 target/web-demo-1.0-SNAPSHOT.war 放到resin的webroot.

### 注意
1. 建表语句在doc/test_user.sql里面.

