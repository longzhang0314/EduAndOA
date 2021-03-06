﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>用户信息</title>
	<link rel="Stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/Styles/bridging.css"/>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/Scripts/common.js"></script>
<script type="text/javascript">
	 function search() {
         // alert("chaxun1");

         /* $("#searchUserForm1").attr("action","");
          $("#searchUserForm1").submit();
          }*/
		 var username = $('#username').val();
         /*$(document).ready(function () {

             $("#birthday").datepicker({
                 dateFormat: 'yy-mm-dd',
             });
         });*/
		 alert("chaxun");
         //通过鼠标点击事件去查询
		 window.location.href = "${pageContext.request.contextPath}/user/find.do?username="+username;


     }
</script>
</head>
<body>
	<form id="searchUserForm1" action="${pageContext.request.contextPath}/user/find.do" method="post">
		<div class="condition_search">
			<div class="search_title">
				<h3 class="total_title">条件查询</h3>
				<span class="clickToReflesh" onclick="window.location.href = window.location.href;">点击刷新</span>
				<div>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span id="MainContent_labAllTotal"></span></div>
			</div>



				<div class="search_detail" style="height: 80px;">
					<div class="search_table">
						<table cellpadding="0" cellspacing="0" style="width: 900px">
							<tr>
								<td class="input_text tar">用户名：</td>
								<td>
									<p><input type="text" id="username" name="username" style="width: 120px;"></p>
								</td>
							</tr>
						</table>
					</div>
					<input type="button" onclick="search();" class="search_btn" />
				</div>

			<div class="edit">
				<h3 class="total_title">查询结果</h3>
				<ul>
					<li><input type="button" value="新增" class="addition"
						data-url="${pageContext.request.contextPath}/employee/edit.do"
						onclick="Common.showPage(this);" /></li>
				</ul>
			</div>
		</div>

		<!--这里是表格数据-->
		<div class="total_table rel">
			<table border="0" cellspacing="0" cellpadding="0"
				style="width: 100%;">
				<thead>
					<tr>
						<td style="width: 80px; text-align: center;"><p>用户名</p></td>
						<td style="width: 100px"><p>邮箱</p></td>
						<td style="width: 80px"><p>姓名</p></td>
						<td style="width: 80px"><p>总收入</p></td>

						<td class="total_table_contral" style="width: 210px"><p>操作</p></td>
					</tr>
				</thead>
			</table>
			<div style="height: 200px; overflow-y: auto; overflow-x: hidden;">
				<table cellpadding="0" cellspacing="0"
					style="width: 100%; background-color: #FFF;">

					<tbody>
							<c:forEach items="${userList}" var="user">

								<tr onclick="Common.switchLine(this,event);">
									<td style="width: 80px; text-align: center;"><p><span >${user.username}</span></p></td>
									<td style="width: 100px; text-align: center;"><p><span >${user.username}@itedu.com</span></p></td>
									<td style="width: 80px; text-align: center;"><p><span >AA</span></p></td>
									<td style="width: 80px; text-align: center;"><p><span >amount</span></p></td>

									<td class="delete" style="width: 210px; text-align: center;">
										<p><input type="button" onclick="Common.showPage(this);" value="编辑"
												  data-url="./UserUpdate.html" />
											<input type="button" onclick="Common.showPage(this);" value="禁用"
												   data-url="#" />
									</td>
								</tr>

							</c:forEach>


					</tbody>
				</table>
			</div>
		</div>

		<!-- 分页查询 -->
		<div class="page">
			<p class="page_number">
				<a href="javascript:void(0)" onclick="this.href='#'">[第一页]</a>
				<a href="javascript:void(0)" onclick="this.href='#'">[上一页]</a>
				<a href="javascript:void(0)" onclick="this.href='#'">[下一页]</a>
				<a href="javascript:void(0)" onclick="this.href='#'">[最后一页]</a>
				<span>1/2</span>
				<span>每页显示</span>8条记录 共20条记录
			</p>
		</div>

		<div class="specific_page tal dn" id="popupLayer">
        <!--这里删除了style属性-->
        <iframe id="childform" frameborder="0" border="0" class="iframe_layer" name="layer_iframe"></iframe>
    </div>
	</form>
</body>
</html>
