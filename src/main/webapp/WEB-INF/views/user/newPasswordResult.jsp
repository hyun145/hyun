<%@ page import="kopo.poly.util.CmmUtil" %>
<%@ page import="kopo.poly.dto.UserInfoDTO" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%

    String msg = CmmUtil.nvl((String) request.getAttribute("msg"));

%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title><%=msg%></title>
    <link rel="stylesheet" href="/css/table.css"/>
    <script type="text/javascript" src="/js/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">

        $(document).ready(function () {

            $("#btnLogin").on("click", function () {
                location.href = "/user/login";
            })


        })

    </script>
</head>
<body>
<h2>비밀번호 재설정 결과</h2>
<hr/>
<br/>
<form id="f">
<div class="divTable minimalistBlack">
    <div class="divTableBody">
        <div class="divTableRow">
            <div class="divTableCell">
                <%=msg%>
            </div>
        </div>
    </div>
    </div>
    <div>
        <button id="btnLogin" type="button"> 로그인 </button>
    </div>
</form>
</body>

</html>