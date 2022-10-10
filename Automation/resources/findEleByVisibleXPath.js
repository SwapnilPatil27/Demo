function findEleByXpath(xpath) {
	objList = xpath.split("/");
	isLast = objList.length;
	var i = 3;
	processedPath='';
	debugger;
	var ele = document.getElementsByTagName('body')[0];
	while (i < isLast) {
		if (objList[i] != null) {
			var eletag = objList[i].replace(']', '').split('[');

			var innerIndex = eletag[1] == null ? 0 : eletag[1];
			innerIndex = innerIndex == 0 ? innerIndex : (innerIndex - 1);
			var childrendivs = [];
			children = ele.children;
			for (var j = 0; j < children.length; j++) {
				if (children[j].tagName == eletag[0] && !(window.getComputedStyle(children[j]).visibility === 'hidden' || window.getComputedStyle(children[j]).display === 'none' || children[j].classList.contains("x-mask"))) {
					childrendivs.push(children[j]);
				}
			}
			try {

				ele = childrendivs[innerIndex]
				if (ele == null) {
					return processedPath;
				}
			} catch (err) {
				console.log('Error ' + objList[i] + '[' + innerIndex + ']');
				return 'Error: Proccessed Path:' +processedPath+' Error Message '+err;
			}
		}
		processedPath = processedPath+ "/"+objList[i];
		i++;
	}
	return ele;
}

return findEleByXpath(arguments[0]);