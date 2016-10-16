<%@ page language="java" import="java.util.*,information.*,search.*" pageEncoding="GBK"%> 
<%  String path = request.getContextPath();  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> <html>    
<br>    
<table width="706" border="0" align="center" height="75">     
<tr>        
<td colspan="6" align="center" ><strong>图书查询系统</strong></td>     
</tr>      
<tr>        
<td colspan="6" align="center" >&nbsp;</td>    
 </tr> 
 <tr>        
<td colspan="6" align="center" ><strong>已有作者：韩寒、莫言、贾平凹、余华</strong></td>     
</tr>     
 <tr>       
  <td align="right" width="500"> 
  <form  name="form" method="post" action="querybook"> 作者名：      
    <input type="text" name="name">         
    <input type="submit"  value="查询" ></form></td>            
  </tr>  
</table>   
</body>
 </html> 
