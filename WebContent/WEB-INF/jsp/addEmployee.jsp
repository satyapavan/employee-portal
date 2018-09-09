<%@taglib uri="http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   
   <body>
      <h2>Employee Information</h2>
      <form:form method = "POST" action = "/EmployeePortal/insertEmployee">
         <table>
            <tr>
               <td><form:label path = "name">Name</form:label></td>
               <td><form:input path = "name" /></td>
            </tr>
            <tr>
               <td><form:label path = "address">Address</form:label></td>
               <td><form:textarea path = "address" rows = "3" cols = "25"/></td>
            </tr>
            <tr>
               <td><form:label path = "department">Department</form:label></td>
               <td>
                  <form:select path = "department">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${departmentList}" />
                  </form:select>     	
               </td>
            </tr>   	
            
             <tr>
               <td><form:label path = "salary">Salary</form:label></td>
               <td><form:input path = "salary" /></td>
            </tr>
            <tr>
               <td><form:label path = "location">Location</form:label></td>
               <td>
                  <form:select path = "location">
                     <form:option value = "NONE" label = "Select"/>
                     <form:options items = "${locationList}" />
                  </form:select>     	
               </td>
            </tr>   
            
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>