# Jeecg综合漏洞利用工具

jeecg综合漏洞利用工具,程序采用javafx开发,环境JDK 1.8 免责声明：仅用于授权测试，用户滥用造成的一切后果和作者无关 请遵守法律法规！
漏洞收录如下：

jeecg-boot queryFieldBySql远程命令执行漏洞

jeecg-boot testConnection远程命令执行漏洞

JeecgBoot jmreport/loadTableData SSTI模板注入漏洞

jeecg-boot-queryTableData-sqli注入漏洞

jeecg-boot-getDictItemsByTable-sqli注入漏洞

Jeecg-Boot qurestSql-SQL注入漏洞

jeecg-boot commonController 任意文件上传漏洞

jeecg-boot jmreport任意文件上传漏洞

jeecg-boot-querySysUser信息泄露漏洞

jeecg-boot-checkOnlyUser信息泄露漏洞

jeecg-boot-httptrace信息泄露漏洞

# 功能介绍

Jeecg综合漏洞利用工具集成了多模块漏洞利用，包括一键漏洞检测，单独选择模块检测,cmdshell模块，文件上传模块，批量检测模块等
v3.0版本内置的标准库外，在检测模块加入了okhttp的三方库，支持https网站检测，以及优化了基于jeecg queryUser漏洞的接口测试

一键检测模块，选择模块

jeecg-boot queryFieldBySql远程命令执行漏洞

jeecg-boot testConnection远程命令执行漏洞

JeecgBoot jmreport/loadTableData SSTI模板注入漏洞

jeecg-boot-queryTableData-sqli注入漏洞

jeecg-boot-getDictItemsByTable-sqli注入漏洞

Jeecg-Boot qurestSql-SQL注入漏洞

jeecg-boot commonController 任意文件上传漏洞

jeecg-boot jmreport任意文件上传漏洞

jeecg-boot-querySysUser信息泄露漏洞

jeecg-boot-checkOnlyUser信息泄露漏洞

jeecg-boot-httptrace信息泄露漏洞

接口测试模块：

jeecg-boot-querySysUser信息泄露漏洞

jeecg-boot-checkOnlyUser信息泄露漏洞

cmdshell模块:

jeecg-boot queryFieldBySql远程命令执行漏洞

jeecg-boot testConnection远程命令执行漏洞

JeecgBoot jmreport/loadTableData SSTI模板注入漏洞

文件上传模块:

jeecg-boot commonController 任意文件上传漏洞

jeecg-boot jmreport任意文件上传漏洞

批量检测模块：

jeecg-boot queryFieldBySql远程命令执行漏洞

jeecg-boot testConnection远程命令执行漏洞

JeecgBoot jmreport/loadTableData SSTI模板注入漏洞

jeecg-boot-queryTableData-sqli注入漏洞

jeecg-boot-getDictItemsByTable-sqli注入漏洞

Jeecg-Boot qurestSql-SQL注入漏洞

# 功能使用

默认模块可一键扫描所有漏洞

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/sdfdsaa.png)

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/ewrwrw.png)

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/4rwerwr.png)

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/erertert.JPG)

 选择模块可单独选择你要检测的漏洞

cmdshel模块

如存在jeecg-boot queryFieldBySql远程命令执行漏洞
选择cmd模块的jeecg-boot queryFieldBySql远程命令执行漏洞
输入你要执行的命令即可

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/rggdsgs.png)


文件上传模块：

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/erwwrw.JPG)

如存在jeecg-boot jmreport任意文件上传漏洞

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/erewr.png)

shell不再内置，支持用户自定义上传，输入你的shell代码，文件名，点击上传即可

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/dfdsfdsf.png)

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/dsfsdfdsf.png)

批量检测模块：

下载jeecgExploitss jar程序，本地新建文本urls.txt
 选择你要检测的模块，点击检测，即可开始批量检测
 批量检测，默认只输出存在漏洞的网站

 后续根据版本优化再添加其他的批量检测模块

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/saddad.png)

# 编写小记

使用了IWannaGetAll-v1.2.1工具的jeecgboot模块之后
发现了2处，相对明显的bug,所以在两个bug基础上进行优化

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/asdsadads.JPG)

第一处bug如下：

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/adadad.PNG)

Jeecg-Boot qurestSql-SQL注入漏洞
漏洞显示是存在，实际上经过验证，发现漏洞是不存在的！

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/dsfsf.jpg)

第二处bug如下：

发现IWannaGetAll-v1.2.1编写作者，在针对jeecg-boot-querySysUser信息泄露漏洞这个漏洞上
默认只写了接口jeecg-boot的漏洞检测，然而这种检测，实际上会存在误判几率

原因如下：
很多jeecg的网站默认接口不一定都是jeecg-boot
那么一旦有其他接口，则可能出现误判

比如

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/saddasd.jpg)

在IWannaGetAll-v1.2.1工具中的模块，检测显示漏洞不存在，那是因为他只进行了jeecg-boot的漏洞检测

然而这个网站，接口并不是jeecg-boot，所以造成了误判

那么如何解决这个问题呢？
我们先来到jeecg网站
发现这里

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/gfds.png)

发现这里就是接口的位置
那么一般接口都会写到这里
接口位置： window._CONFIG['domianURL'] 
这个地方
我们可以采取正则的方式来抓取这个接口，再进行判断，这样就精准了
"window._CONFIG\\['domianURL'\\] = \\'(.*?);");
找到这个接口，再判断他就相对精准了
两种实现方式
1，抓取到的接口传递给文本，通过文本叠加到payload,发送请求进行判断
2、通过抓取到的接口，进行二次判断

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/fghfh.jpg)

通过发现这个漏洞是存在的

![image](https://github.com/MInggongK/jeecg-/blob/main/jeecgExploitss/fghfhg.png)

指纹识别小技巧：
抓取：
window._CONFIG\\['onlinePreviewDomainURL'\\] = \\'(.*?);")
查找value.contains("jeecg")) 
这样也可以进行识别

jeecg-boot queryFieldBySql远程命令执行漏洞优化

输出的是fieldName位置

如果直接response.toString影响美观

采用了解析json数据遍历查找方式，来进行优化

 for (Object field : fieldList) {
  if (field instanceof JSONObject) {
 JSONObject fieldObject = (JSONObject) field;
 String fieldName = (String) fieldObject.get("fieldName");

 当用户输入cmdshell命令时，将只输出fieldName结果















 



 









