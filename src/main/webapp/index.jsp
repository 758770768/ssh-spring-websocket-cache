<!DOCTYPE html>
<html>
<head>
<title>WebSocket/SockJS Echo Sample (Adapted from Tomcat's echo
	sample)</title>

<script src="http://cdn.sockjs.org/sockjs-0.3.min.js"></script>

<script type="text/javascript">
	var ws = null;
	url = "ws://localhost:8080/app/websocket";
	ws = new WebSocket(url);

	ws.onopen = function() {
		alert("connection ok");
	};

	//发送消息
	function sendMessage(mess) {
		if (ws != null) {
			ws.send(mess);
		}
	}

	ws.onmessage = function(event) {
		alert(event);
	};
	ws.onclose = function(event) {

	};
</script>
</head>
<body>
	<button onclick="sendMessage('hello')">hello</button>
</body>
</html>
