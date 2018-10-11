#spring boot thymeleaf

### 初始化spring boot thymeleaf工程

1.pom.xml 中引入相关依赖
```
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
		</dependency>
```

2.application.yml中配置
```
spring:
  thymeleaf:
    prefix: classpath:/templates/
    suffix: .html
    mode: HTML5
    cache: false
    encoding: UTF-8
  messages: //国际化
    encoding: UTF-8
    basename: messages #默认
```

spring boot 会为我们自动创建viewResolver等相关对象，所以只需要在配置文件中加入相关配置即可。

3.项目结构

demo项目目录结果如下
```
web_app
    src
        main
            java //java代码
            resources //存放静态资源，如网页、css、image以及相关配置文件
                static
                  css
                  js
                  img
                templates //模板文件，也就是html文件
                Resource Bundle 'messages' //国际化文件
    .......
    其他文件
```

4.创建index.html文件
在文件中引入thymeleaf，否则thymeleaf命令无法执行。
```
    <!DOCTYPE html>
    <html lang="en" xmlns:th="http://www.w3.org/1999/xhtml"> //引入thymeleaf配置
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <div th:text="#{title}">
        </div>
    </body>
    </html>
```

5. IndexController

```
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.put("title","thymeleaf learning");
        return "index";
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.ENGLISH);
        return sessionLocaleResolver;
    }
}
```

以上，启动springboot工程，在浏览器中输入相关测试地址，即可看到title对应的内容。

### thymeleaf



### springboot thymeleaf国际化配置
   
