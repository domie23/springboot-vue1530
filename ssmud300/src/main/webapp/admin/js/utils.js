/**
 * 按钮权限判断
 * @param {Object} value
 */
function isAuth(value) {
	if (value == 5) {
		return true;
	} else {
		return false;
	}
}
/**
 * 获取传递参数值(修改支持中文)
 * @param {Object} name 参数名称
 */
function getParam(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return decodeURI(r[2]); //对参数进行decodeURI解码
	return null;
}
/**
 * 生成订单编号
 */
function genId() {
	var date = new Date();
	var id = date.getFullYear().toString() + (date.getMonth() + 1).toString() +
		date.getDate().toString() + date.getHours().toString() + date.getMinutes().toString() +
		date.getSeconds().toString() + date.getMilliseconds().toString();
	return id;
}
