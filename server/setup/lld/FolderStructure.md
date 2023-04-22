## Folder Structure

`pom.xml`  
*Maven configuration file*  
`src`  
*Source files folder*  
└──`main`  
----*Src Main folder*  
----└──`java`  
----*Main java folder*  
--------└──`ph`  
--------*Package ph*  
------------└──`com`  
------------*Package ph.com*  
----------------└──`alliance`  
----------------*Package ph.com.alliance*  
--------------------└──`jpa`  
--------------------*Package ph.com.alliance.jpa* 
-----------------------└──`common`  
-----------------------*Package ph.com.alliance.jpa.common; classes common for all functions*  
--------------------------├─`ApiResult.java`  
--------------------------*Response model class for all controllers*  
--------------------------├─`ControllerErrorHandler.java`  
------------------------*Error handler for controllers*  
-----------------------└──`config`  
-----------------------*Package ph.com.alliance.jpa.config; Spring configuration classes*  
--------------------------├─`CorsConfig.java`  
--------------------------*CORS filter configuration*  
--------------------------├─`DatabaseConfig.java`  
--------------------------*Database configuration*  
--------------------------├─`MailConfig.java`  
--------------------------*Mail configuration*  
--------------------------├─`OAuth2Config.java`  
--------------------------*Authorization server configuration*  
--------------------------├─`ResourceServerConfig.java`  
--------------------------*Resource server configuration*  
--------------------------├─`RootConfig.java`  
--------------------------*Root configuration file*  
--------------------------├─`ServerSecurityConfig.java`  
--------------------------*Web security configuration*  
--------------------------├─`SwaggerConfig.java`  
--------------------------*Swagger configuration*  
--------------------------├─`UploadConfig.java`  
--------------------------*File Upload configuration*  
--------------------------└─`WebAppInitializer.java`  
--------------------------*Spring context configuration*  
-----------------------└──`functions`  
-----------------------*Package ph.com.alliance.jpa.functions; Modules folder*  
--------------------------└─`UserShop`  
--------------------------*Folder for sample module*  
----------------------------└─`controller`  
----------------------------*Module controller folder*  
----------------------------└─`UserShopController.java`  
----------------------------*Module controller*  
----------------------------└─`dao`  
----------------------------*Module DAO folder*  
--------------------------------├─`UserShopDao.java`  
--------------------------------*DAO interface*  
--------------------------------└─`UserShopDaoImp.java`  
--------------------------------*DAO implementation*
----------------------------└─`model`  
----------------------------*Module models folder**  
--------------------------------└─`UserShop.java`  
--------------------------------*Sample module model class*  
----------------------------└─`service`  
----------------------------*Module services folder*  
--------------------------------├─`UserShopService.java`  
--------------------------------*Service interface*  
--------------------------------└─`UserShopServiceImp.java`  
--------------------------------*Service implementation*  
------------------------└─`util`  
------------------------*Commmon utils folder*  
----------------------------├─`Common.java`  
----------------------------*Common functions*   
----------------------------└─`Constant.java`   
----------------------------*Common constants*  
--------------------└─`interceptor`  
--------------------*Interceptors folder*  
----------------------------└─`HttpInterceptor.java`  
----------------------------*Sample interceptor*  
--------------------└─`listener`   
--------------------*Listeners folder*  
---------------------------└─`CustomHttpListener.java`  
---------------------------*Sample Listener*  
--------------------└─`entity`  
--------------------*JPA generated entities*  
------------------------└─`entity`  
------------------------*MyBatis generated POJO entities*  
----------------------------├─`UserShop.java`  
----------------------------*Sample entity class*  
--------└──`META-INF`  
--------*META-INF folder*  
------------└──`persistence.xml`  
------------*persistence unit configuration*  
----└──`resources`  
----*Resources folder*  
--------├─`log4j.properties`  
--------*Logging properties file*  
--------└─`app.properties`  
--------*Server details file*  
----└──`webapp`  
----*WebApp folder*  
--------└─`WEB-INF`  
------------└─`web.xml`  
------------*Web XML config file*