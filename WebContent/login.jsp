<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
  <form action="servlet/ServletLogin" method="post">
    <table>
      <tr>
      <td>用户名：</td>
      <td><input type="text" name="username" value="" /></td>
      </tr>
      <tr>
      <td>密码：</td>
      <td><input type="password" name="password" value=""/></td>
      </tr>
      <tr>
      <td><input type="submit" name="submit" value="登陆"/>&nbsp;&nbsp;
          <input type="reset" name="reset" value="重置"/>&nbsp;&nbsp;
      </td>
      </tr>
          
    </table>
  
  </form>

</body>
</html>