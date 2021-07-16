<%@ Page Language="VB" AutoEventWireup="false" CodeFile="Default.aspx.vb" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Click Application</title>
    <style type="text/css">
        .auto-style1 {
            font-size: xx-large;
        }
    </style>
</head>
<body>
    <form id="form1" runat="server">
        <div style="font-size: medium; height: 1200px; width: 1920px; background-image: url('Imgfile/lunix.jpg'); color: #FFFFFF; margin-bottom: 0px; position: inherit; z-index: auto;">
            <strong><span class="auto-style1" style="width: 3839px; height: 2160px;">Eugene Henneberry Click Application<br />
            <br />
            <br />
            </span></strong>
            <br />
            <asp:Button ID="btnClick" runat="server" Text="Click Here" Width="90px" />
            <br />
            <asp:Label ID="lblMessage" runat="server"></asp:Label>
        </div>
    </form>
</body>
</html>
