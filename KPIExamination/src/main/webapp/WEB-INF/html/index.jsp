<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>绩效考核系统登录</title>
<link href="./Wopop_files/style_log.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/style.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css" href="./Wopop_files/jquery.ui.all.css">

</head>
<script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
<body class="login" mycollectionplug="bind">
<div class="login_m">
<div class="login_logo"><img src="./Wopop_files/logo.png" width="196" height="46"></div>
<div class="login_boder">

<div class="login_padding" id="login_model">

  <h2>USERNAME</h2>
  <label>
    <input type="text" id="username" class="txt_input txt_input2"  placeholder="输入账户" value="">
  </label>
  <h2>PASSWORD</h2>
  <label>
    <input type="password" name="textfield2" id="userpwd" class="txt_input"  placeholder="输入密码 " value="">
  </label>
 
 

 
  <p class="forgot"><a id="iforget" href="javascript:void(0);">Forgot your password?</a></p>
  <div class="rem_sub">
    <label>
      <input type="submit" class="sub_button" name="button" id="button" value="SIGN-IN" style="opacity: 0.7;" onclick="Login()">
    </label>
  </div>
</div>


<div id="forget_model" class="login_padding" style="display:none">
<br>

   <h1>Forgot password</h1>
   <br>
    <label>
    <input type="text" id="usrmail" class="txt_input txt_input2">
   </label>


</div>






<!--login_padding  Sign up end-->
</div><!--login_boder end-->
</div><!--login_m end-->
 <br> <br>
 <script type="text/javascript">
function Login(){
	var id=document.getElementById("username").value;
	var password=document.getElementById("userpwd").value;
	$.ajax({
		url:"${pageContext.request.contextPath }/Login.action",
		type:'post',
	contentType:'application/json;charset=UTF-8',
		dataType:'json',
		data:JSON.stringify({id:id,password:password}),
		success:return_alert
	});
	function return_alert(mes){
	}
	}
</script>
</body></html>