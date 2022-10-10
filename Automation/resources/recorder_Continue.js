console.log('Adding script');
function getElementXPath(elt)
{
     var path = '';
     for (; elt && elt.nodeType == 1; elt = elt.parentNode)
     {
   	idx = getElementIdx(elt);
	xname = elt.tagName;
	if (idx > 1) xname += '[' + idx + ']';
	path = '/' + xname + path;
     }
 
     return path;	
}

function copyToClipboard(text) {
    var dummyChild = document.createElement("textarea");
    // to avoid breaking orgain page when copying more words
    // cant copy when adding below this code
    // dummyChild.style.display = 'none'
    document.body.appendChild(dummyChild);
    dummyChild.value = text;
    dummyChild.select();
    document.execCommand("copy");
    document.body.removeChild(dummyChild);
}
function getElementIdx(elt)
{
    var count = 1;
    for (var sib = elt.previousSibling; sib ; sib = sib.previousSibling)
    {
    	if (sib.nodeType == 1
				&& sib.tagName == elt.tagName && !(window.getComputedStyle(sib).visibility === 'hidden' || window.getComputedStyle(sib).display === 'none' || sib.classList.contains("x-mask")))	count++;
    }
    
    return count;
}

function buildMessage(ele, location){
	var message = 'ENTER STEP NAME:  ';
	message  += '   [___XPATH___]  ' +location;
	if (ele.innerText) {
		message  += '    [___TEXT___]  ' +ele.innerText.replace(/\n/g,' ');
	}
	if(ele.hasAttribute("data-qtip")){
		message  += '    [___TOOLTIP___]  ' +ele.getAttribute("data-qtip");
	}
	if(ele.hasAttribute("title")){
		message  += '    [___TOOLTIP___]  ' +ele.getAttribute("title");
	}
	return message;
		
}

document.oncontextmenu = function(e) {
	e.preventDefault();
	var location = getElementXPath(e.target);
	copyToClipboard(location);
	var messageString  = buildMessage(e.target, location);
	
	var locName = prompt(JSON.stringify(messageString), '');
	var value = " ";
	
	if(locName != null && locName != '' && locName.includes('|')){
	   var arr = locName.split('|');
	   locName = arr[0];
	   value = arr[1];
	}
		
	if (locName != null ) {
		var dummy= JSON.parse(window.sessionStorage["autorobo.elementlist"]);
		dummy.push(locName + '|' + value +  '|' + location);
		window.sessionStorage["autorobo.elementlist"] = JSON.stringify(dummy);
		console.log(locName+'||'+location);
	}
};

document.onmouseover = document.onmouseout = handler;

function handler(event) {
	var element =event.target;
  if (event.type == 'mouseover') {
	if(element.hasAttribute("data-qtip") || element.hasAttribute("title")){
		element.style.outline = '#f00 solid 2px';
	 }else if ( element.innerText ) {
		 element.style.outline = '#0f0 solid 2px';
	 }else{
		 element.style.outline = '#00f solid 2px';
	 }
  }
  if (event.type == 'mouseout') {
	  element.style.outline = '';
  }
}

var iframeList = document.getElementsByTagName('iframe');
var zenDesk = [];
for (i = 0; i<iframeList.length;i++) {
frame = iframeList[i];
if(frame.id == 'launcher' || frame.id == 'webWidget'){
  zenDesk.push(frame);
}
}
if(zenDesk.length == 0){

}else if(zenDesk[0].parentNode.childElementCount == 2 || zenDesk[0].parentNode.childElementCount == 1){
referenceNode = zenDesk[0].parentNode;
var newNode = document.createElement('div');
referenceNode.parentNode.insertBefore(newNode, referenceNode);
}

