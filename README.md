# zheshiygxm

### 一、配置

#### 	1.项目配置

见TODO注释

#### 2.swagger2

访问地址：[项目访问地址]/swagger-ui.html 
例如本地Tomcat运行swagger-demo,那么访问地址为：<http://localhost:8080/swagger-demo/swagger-ui.html>

#### 3.自动生成的example冲突问题
将pom文件中的mybatis-spring的版本由2.0.1改成2.0.0

#### 4.第一阶段的仍然存在的问题
##### 4.1用户管理编辑窗不能回显，数据库与医生排班相关联，添加医技医生排班时是否排班只能是“否”
##### 4.2挂号级别管理id框太宽，没有搜索栏（查），某个id删除后再自增时需要补缺
##### 4.3结算类别管理界面不够美观，没有设置id栏
##### 4.4医生排班管理搜索栏，数据库联系到user类，显示剩余号数（与挂号业务相关联），挂号级别查询数据库
##### 4.5总体：增删改查每个按钮执行之后应该要自动刷新一次表格，执行后提升执行成功/失败的弹窗不能闪退。
