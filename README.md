# Jeecg综合漏洞利用工具

程序采用javafx开发,环境JDK 1.8 免责声明：仅用于授权测试，用户滥用造成的一切后果和作者无关 请遵守法律法规！
jeecg综合漏洞利用工具,漏洞收录如下：

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


 



 









