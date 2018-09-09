<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Employee Portal</title>
   </head>
   <body>

      <h2>Created Employee Information Successfully</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Address</td>
            <td>${address}</td>
         </tr>
         <tr>
            <td>Department</td>
            <td>${department}</td>
         </tr>
         <tr>
            <td>Salary</td>
            <td>${salary}</td>
         </tr>
         <tr>
            <td>Location</td>
            <td>${location}</td>
         </tr>
      </table>  
   </body>
</html>