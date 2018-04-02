<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>services</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
<link rel="stylesheet"  type="text/css" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
</head>
<body>
<ul>
	<li><a href="/res/documents">other resources</a></li>
</ul>

  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script type="text/javascript">
  $( function() {
    'use strict';
    $.getJSON("resources/js/states.json", function(result){
    	$( "#state" ).autocomplete({
    	      source: result
    	    });
    });
    
  } );
  </script>
 
<div class="ui-widget">
  <form method="post" enctype="application/x-www-form-urlencoded" action="">
  <p><label for="addressline">Address Line 1:</label><input id="addressline" required placeholder="Street"/></p>
  <p><label for="country">Country:</label><input id="country" required placeholder="Country"/></p>
  <p><label for="state">State / Province / Region:</label><input id="state" placeholder="Not Available"/></p>
  <p><label for="city">City:</label><input id="city" placeholder="Not Available" /></p>
  <p><label for="postalcode">Postal Code:</label><input id="postalcode" required placeholder="Postal Code" /></p>
  <p><button>Submit order</button></p>
  </form>
</div>

</body>
</html>