// CSS File
#btn{
    width:96px;
    height:48px;
    font-size:24px;
}

// JS File
document.addEventListener('DOMContentLoaded', () => {
    const button = document.getElementById('btn');
button.addEventListener('click', (e) => {
           const count = Number(e.currentTarget.innerText) + 1;
       e.currentTarget.innerText = count;  }); });

// HTML File
<!DOCTYPE html> 
<html>     
  <head>         
     <meta charset="utf-8">
     <title>Button</title>
     <link rel="stylesheet" href="css/button.css" type="text/css">   
  </head>       
   <body> 
     <button id="btn" type="button">0</button>
     <script src="js/button.js" type="text/javascript"></script> 
   </body> 
</html>
