function getElementByAutomationId(automationIdWithType){
	id_type_arr = automationIdWithType.split("||")
	automationId = id_type_arr[0];
	type = id_type_arr[1];
	
	switch(type) {
		case "btn":
			var rootElement = document.querySelector('a[automation-id="'+automationId+'"]')
			if(rootElement == null){
				rootElement = document.querySelector('div[automation-id="'+automationId+'"]')
			}
			return rootElement;
		case "option":
			var rootElement = document.querySelector('li[automation-id="'+automationId+'"]')
			return rootElement;
		case "combo":
			var rootElement = document.querySelector('div[automation-id="'+automationId+'"]')
			return document.getElementById(rootElement.id+"-trigger-picker");
		
		case "txt":
			var rootElement = document.querySelector('div[automation-id="'+automationId+'"]')
			return document.getElementById(rootElement.id+"-inputEl");
		
		default:
			return document.querySelector('div[automation-id="'+automationId+'"]')
	}
	
}

return getElementByAutomationId(arguments[0]);