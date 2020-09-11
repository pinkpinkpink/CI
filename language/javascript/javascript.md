JavaScript常用语法 
1. 基本语法
1.1 引入
·	内联试
<a href="javascript:void(0)" onclick="alert('ok')">点击</a>
·	内嵌式
<script> alert('ok'); </script>
·	外链式
<script src="demo.js"></script>
1.2 调试输出
1.	alert(*):将内容通过对话框弹出到浏览器 
2.	document.write(*):将内容直接输出到浏览器
3.	console.log(*):将内容输出到浏览器的控制台console.log('hello');console.info('信息');console.error('错误'); console.warn('警告')
4.	console.table(arr or obj):将数组和obj对象内容输出到浏览器的控制台
5.	console.dir(obj)可以显示一个对象所有的属性和方法。
6.	console.trace()用来追踪函数的调用轨迹。
7.	console.time()和console.timeEnd()，用来显示代码的运行时间。
8.	console.profile()的性能分析
9.	console.assert(a==b)用来判断一个表达式或变量是否为真。如果结果为否，则在控制台输出一条相应信息，并且抛出一个异常
10.	console.dirxml(node)用来显示网页的某个节点（node）所包含的html/xml代码。
11.	console上述的集中度支持printf的占位符格式，支持的占位符有：字符（%s）、整数（%d或%i）、浮点数（%f）和对象（%o）如：console.log("%d年%d月%d日",2011,3,26);
1.3 语句
1.	javascript严格区分大小写
2.	javascript会忽略多余的空格
3.	javascript是脚本语言，浏览器在读取代码时，逐行的执行脚本代码。而对于传统的编程来说，会在执行前对所有代码进行编译（解释型语言）
4.	程序都是从0开始计数
5.	javascript代码的末尾不必须添加分号，但是推荐加上 
4.	注释
1.	单行注释：(双斜杠)// 
2.	多行注释：/**/
1.5 变量：
·	存储信息的“容器”
·	变量的命名规则：变量名由字母，数字，下划线和$组成，且不能以数字开头
// 申明变量 var username = 'zhangsan'; 
// 同时申明多个变量 var username = 'zhangsan', age = 30, sex = '男'; 
// 申明变量但是不赋值 var username; // 不使用var申明变量 username = 'zhangsan';
一个好的编程习惯是，在代码开始处，统一对需要的变量进行声明。
1.6 数据类型
字符串（String）、数字（Number）、布尔（Boolean）、数组（Array）、对象（Object）、空（Null）、未定义（Undefined）
使用typeof检测数据类型
1.6.1 字符串（String）
·	使用单引号和双引号定义字符串
·	单双引号需要注意的内容 
·	单双引号没有区别，都不解析变量
·	单双引号可以相互嵌套
·	不可以嵌套自身，除非使用转义字符转义
1.6.2 数字（Number）
·	整型
·	浮点型（计算的时候有计算损耗，不建议进行精确计算）
·	NaN(Not a number) 
·	NaN与任何值运算都为NaN
·	NaN与任何值都不想等，包括自身
·	isNaN():判断一个值是否时NaN
1.6.3 布尔（Boolean）
·	true
·	false
1.6.4 数组
// 1. 创建数组的方式 
var cars = new Array(); cars[0] = 'BMW'; cars[1] = 'BYD'; cars[2] = 'BenZ'; 
// 2.直接定义数组 
var cars = new Array('BMW', 'BYD', 'Benz'); 
// 3.简单定义 
var cars = ['BMW', 'BYD', 'Benz']; 
// 4.数组元素的值可以是任何值 
var shoplist = ['zhangsan',20,true,null,undefined,[1,2,3],{}]; 
// 5.常用的一种复合数据(瀑布流，AngularJS中$scope.shoplist) 
var shoplist = [ {id:1,username:"zhangsan",age:20,sex:"男"}, 
{id:2,username:"lisi",age:18,sex:"女"}, 
{id:3,username:"wangwu",age:32,sex:"男"} 
];
1.6.5 对象
// 1.｛｝定义对象(jquery中animate,$.ajax({})) var obj = { username:"zhangsan", age:20, sex:"男", say:function(){}, eat:function(){} } /
/ 2.使用new Object()定义 var obj = new Object(); obj['username'] = 'zhangsan'; obj.age = 20; obj.say = function(){} 
// 3.使用构造函数定义 function Ball(){ this.x = 100; this.y = 100; this.radius = 50; this.draw = function(){} } 
// 通过new关键字生成对象 var b = new Ball();
对象属性两种调用格式obj.属性名 和 obj[“属性名”]，例如this[“x”]=100 或 this.x=100;
1.6.6 Undefined
·	未定义的变量 alert(typeof age)
·	定义但是未赋值的变量 var sex; alert(typeof age)
1.6.7 Null
·	将值设置为null清空变量
1.7 数据类型的相互转化
1.7.1 转化为字符串
·	String()
1.7.2 转化为布尔
·	Boolean() 
·	“” 0 0.0 NaN false null undefined->false
·	其余都为真（’false’,’0’,’null’）
1.7.3 转化为数值 不包含进制之间的转化
·	Number() 
1.	普通字符串->NaN
2.	纯数字字符串,数值->原型输出
3.	空字符串”,空格字符串’ ‘,null->0
4.	true->1 false->0
5.	undefined->NaN
·	parseInt() 
·	从第一个字符开始查找，直到找到非法字符(非数字)截止，返回找到的数字
parseFloat() 
·	从第一个字符开始查找，直到找到非法字符(除数字和第一个小数点之外的字符)截止，返回找到的数字
1.8 运算符
1.8.1 算术运算符 +  -  *  /  %  ++  --
1.8.2 赋值运算符 =  +=  -=  *=  /=  %=
1.8.3 连接运算符 +
·	＋号两边是纯数字：＋代表加法运算
·	除此之外，＋都是连接运算
1.8.4 比较运算符 = =  = = =   !=   ! = =  >  <  <=  >  >=
1.8.5 逻辑运算符
·	&&（两真为真，其余都为假）
·	||（两假为假，其余都为真）
·	! （取反）
1.8.6 条件运算符（三元运算符）
3==3 ? value1 : value2;
1.9 流程控制：条件语句
1.9.1 if条件语句(范围判断)
// 定义变量 var age = 24; // 只有if判断 if (age){}
1.9.2 switch语句（具体值判断）
var month = 1; 
switch (month) { 
case 1: case 3: case 5: case 7: case 8: case 10: case 12: console.log('31天'); break; 
case 4: case 6: case 9: case 11: console.log('30天'); break; case 2: console.log('28天'); break; 
default: console.log('输入的月份有问题'); 
}
2.0 流程控制－循环语句
2.0.1 for循环
for (var i = 0; i<=10;i++){console.log(i)}
2.0.2 while循环
var i = 0; while (i>0){}
2.0.3 do…while循环
var i = 0; do { console.log(i); i++; } while (i=100)
2.0.4 for…in…(key或 index)循环
var data = {username:'张三',age:20,sex:'男'}; 
for (var i in data) { console.log(i+'===>'+data[i]); }
2.0.5 for…of…（值）循环
var data = {username:'张三',age:20,sex:'男'}; 
for (var i of data) { console.log(i); }
2.0.6 break和continue语句
for (var i = 0; I < 10; i++){if( i = 5) continue
//break是结束整个循环体，continue是结束单次循环
}
2.1 正则表达式
2.1.1 元字符
·	[0-9]:任意一个数字
·	[a-z]:任意一个小写字母
·	[x|y]:匹配x或者y（匹配其中的一个）
·	[^0-9]:匹配一个任意非数字
·	[\d]:任意一个数字
·	[\s]:任意一个空白字符(\r\n\t)
·	[\w]:约等于A-Za-z0-9_
·	^[a-z]{6,12}$:必须是6-12位的小写字母
2.1.2 量词
·	相当于{0,} 任意数量
·	相当于{1,} 至少一个
·	? 相当于{0,1} 至多一个
·	{6,18}
2.1.3 模式修正符
·	i:不区分大小写
·	g:执行全局匹配
·	m:执行多行匹配
2.2 JSON：只有属性的对象
2.2.1 JSON功能
存储和传输数据的格式
2.2.2 实例
// JS对象 // 与普通对象区别：只有属性，键用引号 {"username":"zhangsan", "age":20, "sex":"男"}
2.2.3 JSON方法
·	将JSON字符串转化为JSON对象：JSON.parse()
·	将Javascript对象转换为JSON字符串:JSON.stringify()
2.3 函数
2.3.1 函数定义
// 1.普通函数 function demo(){ console.log('第一种定义函数方式'); } 
// 2.匿名函数 (function(){ console.log('第二种定义函数方式'); })() 
// 3.使用Function定义函数 new Function('x','y','return x+y;');
2.3.2 函数的特点
·	普通函数在同一个script标签之内，可以先调用后定义，但是跨script标签则不支持
·	定义函数而不调用等于没写
·	同名函数会覆盖，不会报错
·	变量的作用域 
·	在函数外申明的变量为全局变量，函数内可以直接调用
·	在函数内使用var申明的变量为局部变量，只能在函数内调用
·	在函数内直接定义变量为全局变量
·	参数个数 
·	形参 > 实参：多余的形参的值为undefined
·	实参 > 形参：多余的实参被忽略
·	argument函数内置对象 
·	函数中内置的的所有参数组成的对象
2.3.3 函数分类
1.功能函数 执行一个功能，而不需要返回值 
1.创建表格函数：createTable() 
2.$.get('1.php',function(msg){ // 此处回调函数功能：判断用户名是否被注册，没有返回值 if (msg == 'yes') { spanObj.innerHTML = '该用名可用'; } else { spanObj.innerHTML = '该用户名已经被注册'; } }) 
3.返回值函数 1.AngularJS中getShopIndex(id),getCartIndex(id)都是具有返回值的函数，返回对应的索引值 
4.获取结果 function demo(){ return 'ok'; } var d = demo(); alert(d);  function test(){ alert('ok'); } var t = test(); alert(t); 
2.4 内置对象
2.4.1 Array数组对象
arr.length:数组arr长度 
- arr.join(*):把数组中的所有元素以*连接为一个字符串。
- arr.push(*):向数组的末尾添加一个或多个元素，并返回新的长度。
- arr.pop():用于删除并返回数组的最后一个元素。
- arr.shift():用于把数组的第一个元素从其中删除，并返回第一个元素的值。
- arr.unshift():可向数组的开头添加一个或更多元素，并返回新的长度。
- arr.sort([函数:排序规则]):arr.sort(function(a,b){return a-b;})用于对数组的元素进行排序。
- arr.reverse():用于颠倒数组中元素的顺序。
以上操作皆会改变原数组；
- arr.indexOf(*):可返回某个指定的字符串值在字符串中首次出现的位置。
- arr.lastIndexOf(*):可返回一个指定的字符串值最后出现的位置，在一个字符串中的指定位置从后向前搜索。
- arr.slice(起始位置,结束位置):获取数组中指定的片段(不包含结束位置):可提取字符串的某个部分，并以新的字符串返回被提取的部分。
- arr.splice(起始位置,长度):从数组中添加或删除元素。
- arr.map(function(currentValue,index,arr){ return newvalue about currentValue or other option }, thisValue):通过指定函数处理数组的每个元素，并返回处理后的数组。
- arr.filter(function(currentValue,index,arr){ return newvalue about currentValue or other option }, thisValue):检测过滤数值元素，并返回符合条件所有元素的数组。
- arr.some(function(currentValue,index,arr){ return bool }, thisValue):为数组中的每一个元素执行一次 callback 函数，直到找到一个使得 callback 返回一个“真值”（即可转换为布尔值 true 的值，如果找到了这样一个值，some 将会立即返回 true。否则，some 返回false。
- arr.every(function(currentValue,index,arr){return bool}, thisValue):同上检测数值元素的每个元素是否都符合条件。 
- arr.reduce (): [x1, x2, x3, x4].reduce(function f(x,y){return newvalue about xANDy}))相当于f(f(f(x1, x2), x3), x4)，Array的reduce()把一个函数作用在这个Array的[x1, x2, x3...]上，这个函数必须接收两个参数，reduce()把结果继续和序列的下一个元素做累积计算。
·	2.4.2 Boolean布尔对象
·	new Boolean(value);	//构造函数 返回布尔值true or false和布尔值对象。
·	Boolean(value);		//转换函数 返回布尔值true or false
说明：
当作为一个构造函数（带有运算符 new）调用时，Boolean() 将把它的参数转换成一个布尔值，并且返回一个包含该值的 Boolean 对象。
如果作为一个函数（不带有运算符 new）调用时，Boolean() 只将把它的参数转换成一个原始的布尔值，并且返回这个值。
注释：如果省略 value 参数，或者设置为 0、-0、null、""、false、undefined 或 NaN，则该对象设置为 false。否则设置为 true（即使 value 参数是字符串 "false"）。
2.4.3 Date对象
·	var d = new Date()
·	new Date() new Date(时间戳) new Date('2019/1/10 0:28:30'):注意这种格式的兼容性 new Date(2019,1,10,0,28,19,178)
·	d.getFullYear():年
·	d.getMonth():月
·	d.getDate():日
·	d.getHours():小时
·	d.getMinutes():秒
·	d.getSeconds():毫秒
·	d.getTime():时间戳
2.4.4 Math对象
属性
·	PI:圆周率π，即圆的周长和它的直径之比。这个值近似为 3.141592653589793
方法
·	abs():可返回数的绝对值
·	ceil():执行的是向上取整计算，它返回的是大于或等于函数参数，并且与之最接近的整数
·	floor():执行的是向下取整计算，它返回的是小于或等于函数参数，并且与之最接近的整数
·	round():把一个数字舍入为最接近的整数
·	max():两个指定的数中带有较大的值的那个数
·	min():两个指定的数中带有较小的值的那个数
·	random():介于 0 ～ 1 之间的一个随机数
·	sin(*)，cos(*),tan(*):三角函数，*为弧度, 1度转弧度写法为1*Math.PI/180。
·	asin(x)，acos(x)反三角函数，x是-1.0 ~ 1.0 之间的数，返回的值是 0 到 PI 之间的弧度值，除此以外返回NAN。
·	atan（x）表示求的是x的反正切，其返回值为[-pi/2,+pi/2]之间的一个数。
·	atan2（y，x）求的是y/x的反正切，其返回值为[-pi,+pi]之间的一个数。
2.4.5 Number对象
·	MAX_VALUE:最大的数
·	MIN_VALUE:最小的数
·	toFixed():把 Number 四舍五入为指定小数位数的数字
2.4.6 String对象
·	length:长度
·	split():把一个字符串分割成字符串数组 例如split(" ")返回单词数组；
·	search():检索字符串中指定的子字符串，或检索与正则表达式相匹配的子字符串
·	match():在字符串内检索指定的值，或找到一个或多个正则表达式的匹配
·	replace():用于在字符串中用一些字符替换另一些字符，或替换一个与正则表达式匹配的子串
·	slice(start,end):可提取字符串的某个部分，并以新的字符串返回被提取的部分
·	indexOf():某个指定的字符串值在字符串中首次出现的位置
·	lastIndexOf():一个指定的字符串值最后出现的位置，在一个字符串中的指定位置从后向前搜索
·	charAt():返回指定位置的字符
·	charCodeAt():指定位置的字母对应的Unicode编码
·	String.formCharCode():将Unicode编码转为字符
2.4.7 RegExp对象
·	reg.test(str):使用正则表达式检验str是否符合要求
2.5改变this指针的 apply(),call(),bind()的使用及区别
·	JavaScript 有一套完全不同于其它语言的对 this 的处理机制。 在以下五种不同的情况下 ，this 指向的各不相同。
·	a全局范围内this;它将会指向全局对象。浏览器中运行的 JavaScript 脚本，这个全局对象是 window。
·	b函数调用 func*()这里 this 也会指向全局对象。ES5 注意: 在严格模式下（strict mode），不存在全局变量。 这种情况下 this 将会是 undefined。
·	c方法调用 some.func* () ,this 指向 test 对象。
·	d调用构造函数new func* ();如果函数倾向于和 new 关键词一块使用，则我们称这个函数是 构造函数。 在函数内部，this 指向新创建的对象。
·	e形如以下显式的设置this
·	apply 、 call 、bind 三者都是用来改变函数的this对象的指向的；
·	apply 、 call 、bind 三者第一个参数都是this要指向的对象，也就是想指定的上下文；
·	apply 、 call 、bind 三者都可以利用后续参数传参；
bind 是返回对应函数，便于稍后调用；apply 、call 则是立即调用 。
  var obj = {
    x: 81,
};
var foo = {
    getX: function() {
        return this.x;
    }
}
console.log(foo.getX.bind(obj)());  //81
console.log(foo.getX.call(obj));    //81
console.log(foo.getX.apply(obj));   //81
·	当你希望改变上下文环境之后并非立即执行，而是回调执行的时候，使用 bind() 方法，后面加上括号。而 apply/call 则会立即执行函数。
2.5.1 apply()
    somefunc.call(this作用域所指代的目标对象，[arg1, ...,argn])
2.5.2 call ()
   somefunc.call(this作用域所指代的目标对象，arg1, ...,argn)
2.5.3 bind ()
   somefunc.call(this作用域所指代的目标对象，arg1, ...,argn)
2.BOM（Window对象）
2.1 全局属性和函数
·	所有的全局变量是window对象的属性
·	所有的全局函数是window对象的方法
·	系统方法 
·	alert()
·	confirm()用于显示一个带有指定消息和 OK 及取消按钮的对话框
·	prompt()提示用户输入的对话框
·	moveBy():可相对窗口的当前坐标把它移动指定的像素、
·	moveTo()把窗口的左上角移动到一个指定的坐标、
·	resizeBy()按照指定的像素调整窗口的大小、
·	resizeTo()、把窗口的大小调整到指定的宽度和高度
·	scrollBy()按照指定的像素值来滚动内容、
·	scrollTo()把内容滚动到指定的坐标
·	open(‘1.html’,”,’width=200,height=”200’):打开一个新窗口
·	close():关闭窗口
·	setInterval()按照指定的周期（以毫秒计）来调用函数或计算表达式、
·	setTimeout()在指定的毫秒数后调用函数或计算表达式、
·	clearInterval(timeout)取消由 setInterval() 设置的 timeout、
·	clearTimeout(timeout):取消由 setTimeout() 方法设置的 timeout
2.2 Navigator对象（浏览器相关的信息）
·	appCodeName 返回浏览器的代码名。
·	appName 返回浏览器的名称。
·	appVersion 返回浏览器的平台和版本信息。
·	cookieEnabled 返回指明浏览器中是否启用 cookie 的布尔值。
·	platform 返回运行浏览器的操作系统平台。
·	userAgent 返回由客户机发送服务器的 user-agent 头部的值。
·	userLanguage 返回 OS 的自然语言设置。
2.3 Screen对象（屏幕相关的信息）
·	width
·	height
·	availHeight:返回显示屏幕的高度 (除 Windows 任务栏之外)。
·	availWidth:返回显示屏幕的宽度 (除 Windows 任务栏之外)。
2.4 Frames对象:返回窗口中所有命名的框架
2.5 History对象（当前那浏览器的历史记录）
·	length:返回浏览器历史列表中URL数目
·	back():加载 history 列表中的前一个 URL。
·	forward():加载 history 列表中的下一个 URL。
·	go():加载 history 列表中的某个具体的页面
·	history.pushState(data,”,下标) 与window.onpopstate()结合使用
2.6 Location对象（当前浏览器的url地址信息）
·	hash:锚点 历史回退 
location.hash = 下标;
data[下标] = 值;
window.onhashchange()
·	href
·	reload()
3.HTML DOM对象
3.1 DOM Document对象
3.1.1 Form表单对象
- document.forms[0]
- document.forms['formName']
- document.formName
- 表单元素对象:formObj.inputName
3.1.2 Select对象
- 属性：
    - disabled
    - length
    - selectedIndex
- 方法：
    add()
    remove()
3.1.2 table表格对象
- table.rows：获取表格行
- talbe.insertRow(index)：添加行
- table.deleteRow(index)：删除行
- row.cells:获取单元格对象
- row.insertCell(index)：添加单元格
3.1.3 Cookie对象
document.cookie = 'username=zhangsan;expires=date;path=/;
domain=qq.com;secure'
cookie.get()/set()
3.1.4 localStorage与sessionStorage
localStorage的优势
1、localStorage拓展了cookie的4K限制
2、localStorage会可以将第一次请求的数据直接存储到本地，这个相当于一个5M大小的针对于前端页面的数据库，相比于cookie可以节约带宽，但是这个却是只有在高版本的浏览器中才支持的
localStorage的局限
1、浏览器的大小不统一，并且在IE8以上的IE版本才支持localStorage这个属性
2、目前所有的浏览器中都会把localStorage的值类型限定为string类型，这个在对我们日常比较常见的JSON对象类型需要一些转换
3、localStorage在浏览器的隐私模式下面是不可读取的
4、localStorage本质上是对字符串的读取，如果存储内容多的话会消耗内存空间，会导致页面变卡
5、localStorage不能被爬虫抓取到
localStorage与sessionStorage的唯一一点区别就是localStorage属于永久性存储，而sessionStorage属于当会话结束的时候，sessionStorage中的键值对会被清空。
localStorage[“somekey”]= JSON.stringify(value) //存
JSON.parse(localStorage[“somekey”]);//取
localStorage.getItem(“somekey”);//获取值
localStorage.setItem(“somekey”,value);//设置值
localStorage.removeItem(“somekey”,);//删除某条缓存
localStorage.clear();//清除所有缓存
var storage=window.localStorage;
    storage.a=1;
    storage.setItem("c",3);
    for(var i=0;i<storage.length;i++){
        var key=storage.key(i);
        console.log(key);
}
//sessionStorage用法形如localStorage
3.2 DOM 功能（通过功能确定DOM是做什么的）
3.2.1 获取并改变HTML标签
- document.getElementById()
- document.getElementsByTagName()
- document.getElementsByName()
- document.querySelector('css选择器#box .a div'):匹配复合条件的第一个元素
- document.querySelectorAll()：匹配所有的复合条件的元素
- ID名直接获取（用于测试，不推荐用于正式环境）
3.2.2 获取并改变HTML属性
- obj.src
- obj.getAttribute():通过名称获取属性的值
- obj.setAttribute():创建或改变某个新属性
- obj.removeAttribute():删除指定的属性
3.2.3 获取并改变CSS样式
- obj.style.width:只能获取行内的样式，获取不到style标签和link标签之内的样式
- 获取最终的样式（兼容）
    function getStyle(obj, attr){
        return obj.currentStyle ? obj.currentStyle[attr] :               document.defaultView.getComputedStyle(obj, null)[attr];
    }
3.2.4 事件处理
3.2.4.1 鼠标事件
·	onclick:单机
·	ondblclick:双击
·	oncontextmenu:右击
·	onmouseover:移入
·	onmouseout:移出
·	onmousedown:按下
·	onmouseup:抬起
·	onmousemove:移动
3.2.4.2 键盘事件
·	onkeydown:按下
·	onkeyup:抬起
·	onkeypress:在键盘按键被按下并释放一个键时发生
3.2.4.3 表单事件
·	onfocus:聚焦
·	onblur:失焦
·	onsubmit:提交
·	onchange:表单元素改变事件
·	onreset:重置按钮被点击时
·	onselect:文本被选定
3.2.4.4 框架对象事件
·	onload:当页面加载完成的时候
·	onunload:用户退出页面
·	onresize:当页面大小发生改变的时候
·	onerror:当图片加载失败的时候
·	onabort:图像加载被中断
·	onscroll:当页面发生滚动的时候
·	延迟加载：onscroll
3.2.4.5 鼠标键盘属性值
·	altKey:Alt 键是否被按下并保持住了
·	shiftKey:
·	ctrlKey:
·	clientX:鼠标指针向对于浏览器页面（或客户区）的水平坐标
·	clientY:鼠标指针向对于浏览器页面（或客户区）的垂直坐标
3.2.4.6 事件冒泡
·	stopPropagation()
·	JS中e.cancelBubble = true
·	jquery中 e.stopPropagation()/return false;
return false;代表终止函数，之后的代码将不执行 e.stopPropagation():阻止事件冒泡，之后的代码继续执行
3.2.4.7 千万要注意的事件默认行为（preventDefault自己查阅资料解决）
·	点击a链接默认跳转页面
·	点击提交按钮默认提交表单
·	点击鼠标右键出现右键菜单
// 阻止a链接跳转（如果要用a链接做点击事件，务必将这里禁止） <a href="javascript:;">百度</a> <a href="javascript:void(0);">百度</a> // 表单 formObj.onsubmit = function(){ // 如果要做表单验证或者Ajax提交 // 表单验证不通过，return false // 如果是ajax提交，return false; } 
3.2.4.8 js默认事件绑定与解绑
var btn = document.getElementById("btn2");
//第一种
//绑定
btn.事件名= function(){
   alert("btn1事件绑定成功！");
}
//解绑
btn1.onclick =null;
     alert("btn1所绑定的事件已经被移除！");
}
//第二种
//attachEvent 绑定
    btn.attachEvent ('onclick',function(){alert('1');});
//attachEvent 绑定
btn.attachEvent ('onclick',function(){alert('1');});
detachEvent 解绑
      btn.detachEvent ('onclick',function(){alert('1');});
//第三种
addEventListener解绑
     btn.addEventListener('click', function(){alert('1');},false);
removeEventListener解绑
    btn.removeEventListener('click', function(){alert('1');},false);
    说明：同一事件多次注册会导致事件累加和冒泡，注册前请解除该事件后再重新注册；
3.2.4.9 针对node(所选择的dom)节点（select，input，textarea）值改变的实时监听，
  var node = document.getElementById("inputele");
  node.addEventListener('input', function(e) { 
console.log(e.target.value);
  })
3.3 DOM 节点操作
3.2.1 标签元素的属性
·	attributes:属性返回包含被选节点属性的 NamedNodeMap
·	className:属性可设置或返回元素的 class 属性
·	childNodes/children:所有子节点的集合/子节点
·	firstChild/firstElementChild:第一个子节点/第一个元素子节点
·	lastChild/lastElementChild:最后一个子节点/最后一个元素子节点
·	nextSibling/nextElementSibling:下一个节点/下一个元素节点
·	previousSibling/previousElementSibling:前一个兄弟节点/前一个元素节点
·	parentNode:定位到一个节点，找到他的父节点
·	nodeName:节点的名称
·	nodeType:节点的类型。
·	nodeValue:节点的值。
·	innerHTML:获取或设置的是元素中的所有内容，包含标签
·	clientWidth:获取浏览器的宽度
·	clientHeight:获取浏览器的高度
·	offsetHeight:获取div对象的高度(宽度 = 自身宽度+边框厚度+padding值)
·	offsetWidth:获取div对象的宽度
·	offsetLeft:获取div距离页面(父级元素有定位，则相对于父级元素)的左边距
·	offsetTop:获取div距离页面(父级元素有定位，则相对于父级元素)的上边距
·	scrollWidth:获取页面的总宽度
·	scrollHeight:获取页面的总高度
·	scrollTop:获取浏览器滚动的高度
·	scrollLeft:获取浏览器滚动的宽度
3.2.2 标签元素的方法
·	appendChild():向节点的子节点列表的末尾添加新的子节点
·	insertBefore():在已有的子节点之前插入一个新的子节点
·	replaceChild():用其他节点替换某个子节点
·	removeChild():删除指定节点
·	cloneNode():创建指定的节点的精确拷贝

4.原型和继承对于有基于类的语言经验 (如 Java 或 C++) 的开发人员来说，JavaScript 有点令人困惑，因为它是动态的，并且本身不提供一个class实现。（在 ES2015/ES6 中引入了class关键字，但只是语法糖，JavaScript 仍然是基于原型的）。
·	当谈到继承时，JavaScript 只有一种结构：对象。每个实例对象（object ）都有一个私有属性（称之为__proto__）指向它的原型对象（prototype）。该原型对象也有一个自己的原型对象(__proto__) ，层层向上直到一个对象的原型对象为 null。根据定义，null 没有原型，并作为这个原型链中的最后一个环节。
·	几乎所有 JavaScript 中的对象都是位于原型链顶端的Object的实例。
·	尽管这种原型继承通常被认为是JavaScript的弱点之一，但是原型继承模型本身实际上比经典模型更强大。例如，在原型模型的基础上构建经典模型相当简单。
4.1基于原型链的继承
4.1.1继承属性
·	JavaScript 对象是动态的属性“包”（指其自己的属性）。JavaScript 对象有一个指向一个原型对象的链。当试图访问一个对象的属性时，它不仅仅在该对象上搜寻，还会搜寻该对象的原型，以及该对象的原型的原型，依次层层向上搜索，直到找到一个名字匹配的属性或到达原型链的末尾。
·	遵循ECMAScript标准，someObject.[[Prototype]] 符号是用于指向 someObject的原型。从 ECMAScript 6 开始，[[Prototype]] 可以通过Object.getPrototypeOf()和Object.setPrototypeOf()访问器来访问。这个等同于 JavaScript 的非标准但许多浏览器实现的属性 __proto__。
·	但它不应该与构造函数 func 的 prototype 属性相混淆。被构造函数创建的实例对象的 [[prototype]] 指向 func 的 prototype 属性。Object.prototype 属性表示Object的原型对象。
这里演示当尝试访问属性时会发生什么：
// 让我们从一个自身拥有属性a和b的函数里创建一个对象o：
let f = function () {
   this.a = 1;
   this.b = 2;
}
/* 你要这么写也没区别
function f(){
  this.a = 1;
  this.b = 2;
}
*/
let o = new f(); // {a: 1, b: 2}
// 在f函数的原型上定义属性
f.prototype.b = 3;
f.prototype.c = 4;

//不要在f函数的原型上直接定义 f.prototype = {b:3,c:4};这样会直接打破原型链
// o.[[Prototype]] 有属性 b 和 c   (其实就是o.__proto__或者o.constructor.prototype)

// o.[[Prototype]].[[Prototype]] 是 Object.prototye.
// 最后o.[[Prototype]].[[Prototype]].[[Prototype]]是null
// 这就是原型链的末尾，即 null，
// 根据定义，null 没有[[Prototype]].
// 综上，整个原型链如下: 
// {a:1, b:2} ---> {b:3, c:4} ---> Object.prototye---> null

console.log(o.a); // 1
// a是o的自身属性吗？是的，该属性的值为1

console.log(o.b); // 2
// b是o的自身属性吗？是的，该属性的值为2
// 原型上也有一个'b'属性,但是它不会被访问到.这种情况称为"属性遮蔽 (property shadowing)"

console.log(o.c); // 4
// c是o的自身属性吗？不是，那看看原型上有没有
// c是o.[[Prototype]]的属性吗？是的，该属性的值为4

console.log(o.d); // undefined
// d是o的自身属性吗？不是,那看看原型上有没有
// d是o.[[Prototype]]的属性吗？不是，那看看它的原型上有没有
// o.[[Prototype]].[[Prototype]] 为 null，停止搜索
// 没有d属性，返回undefined
·	给对象设置属性会创建自有属性。获取和设置属性的唯一限制是内置 getter 或 setter 的属性。
4.1.2继承方法
·	JavaScript 并没有其他基于类的语言所定义的“方法”。在 JavaScript 里，任何函数都可以添加到对象上作为对象的属性。函数的继承与其他的属性继承没有差别，包括上面的“属性遮蔽”（这种情况相当于其他语言的方法重写）。
·	当继承的函数被调用时，this 指向的是当前继承的对象，而不是继承的函数所在的原型对象。

var o = {
  a: 2,
  m: function(){
    return this.a + 1;
  }
};

console.log(o.m()); // 3
// 当调用 o.m 时,'this'指向了o.

var p = Object.create(o);
// p是一个继承自 o 的对象

p.a = 4; // 创建 p 的自身属性 a
console.log(p.m()); // 5
// 调用 p.m 时, 'this'指向 p. 
// 又因为 p 继承 o 的 m 函数
// 此时的'this.a' 即 p.a，即 p 的自身属性 'a' 
使用不同的方法来创建对象和生成原型链节
语法结构创建的对象节

var o = {a: 1};

// o 这个对象继承了Object.prototype上面的所有属性
// o 自身没有名为 hasOwnProperty 的属性
// hasOwnProperty 是 Object.prototype 的属性
// 因此 o 继承了 Object.prototype 的 hasOwnProperty
// Object.prototype 的原型为 null
// 原型链如下:
// o ---> Object.prototype ---> null

var a = ["yo", "whadup", "?"];

// 数组都继承于 Array.prototype 
// (Array.prototype 中包含 indexOf, forEach等方法)
// 原型链如下:
// a ---> Array.prototype ---> Object.prototype ---> null

function f(){
  return 2;
}

// 函数都继承于Function.prototype
// (Function.prototype 中包含 call, bind等方法)
// 原型链如下:
// f ---> Function.prototype ---> Object.prototype ---> null
4.2构造器创建的对象
·	在 JavaScript 中，构造器其实就是一个普通的函数。当使用 new 操作符 来作用这个函数时，它就可以被称为构造方法（构造函数）。

function Graph() {
  this.vertices = [];
  this.edges = [];
}

Graph.prototype = {
  addVertex: function(v){
    this.vertices.push(v);
  }
};

var g = new Graph();
// g是生成的对象,他的自身属性有'vertices'和'edges'.
// 在g被实例化时,g.[[Prototype]]指向了Graph.prototype.
4.3 Object.create 创建的对象
·	ECMAScript 5 中引入了一个新方法：Object.create()。可以调用这个方法来创建一个新对象。新对象的原型就是调用 create 方法时传入的第一个参数：
var a = {a: 1}; 
// a ---> Object.prototype ---> null

var b = Object.create(a);
// b ---> a ---> Object.prototype ---> null
console.log(b.a); // 1 (继承而来)

var c = Object.create(b);
// c ---> b ---> a ---> Object.prototype ---> null

var d = Object.create(null);
// d ---> null
console.log(d.hasOwnProperty); // undefined, 因为d没有继承Object.prototype
4.4 class 关键字创建的对象
·	ECMAScript6 引入了一套新的关键字用来实现 class。使用基于类语言的开发人员会对这些结构感到熟悉，但它们是不同的。JavaScript 仍然基于原型。这些新的关键字包括 class, constructor，static，extends 和 super。

"use strict";

class Polygon {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
}

class Square extends Polygon {
  constructor(sideLength) {
    super(sideLength, sideLength);
  }
  get area() {
    return this.height * this.width;
  }
  set sideLength(newLength) {
    this.height = newLength;
    this.width = newLength;
  }
}

var square = new Square(2);
4.5性能
·	在原型链上查找属性比较耗时，对性能有副作用，这在性能要求苛刻的情况下很重要。另外，试图访问不存在的属性时会遍历整个原型链。
·	遍历对象的属性时，原型链上的每个可枚举属性都会被枚举出来。要检查对象是否具有自己定义的属性，而不是其原型链上的某个属性，则必须使用所有对象从Object.prototype继承的 hasOwnProperty 方法。下面给出一个具体的例子来说明它：

console.log(g.hasOwnProperty('vertices'));
// true
console.log(g.hasOwnProperty('nope'));
// false
console.log(g.hasOwnProperty('addVertex'));
// false
console.log(g.__proto__.hasOwnProperty('addVertex'));
// true
·	hasOwnProperty 是 JavaScript 中处理属性并且不会遍历原型链的方法之一。(另一种方法: Object.keys())
·	注意：检查属性是否undefined还不够。该属性可能存在，但其值恰好设置为undefined。
错误实践：扩展原生对象的原型
·	经常使用的一个错误实践是扩展 Object.prototype 或其他内置原型。
·	这种技术被称为猴子补丁并且会破坏封装。尽管一些流行的框架（如 Prototype.js）在使用该技术，但仍然没有足够好的理由使用附加的非标准方法来混入内置原型。
·	扩展内置原型的唯一理由是支持JavaScript 引擎的新特性，如Array.forEach。
·	示例
B 继承自 A：

function A(a){
  this.varA = a;
}

// 以上函数 A 的定义中，既然 A.prototype.varA 总是会被 this.varA 遮蔽，
// 那么将 varA 加入到原型（prototype）中的目的是什么？
A.prototype = {
  varA : null,  
/*
既然它没有任何作用，干嘛不将 varA 从原型（prototype）去掉 ? 
也许作为一种在隐藏类中优化分配空间的考虑 ?
https://developers.google.com/speed/articles/optimizing-javascript 
如果varA并不是在每个实例中都被初始化，那这样做将是有效果的。
*/
  doSomething : function(){
    // ...
  }
}

function B(a, b){
  A.call(this, a);
  this.varB = b;
}
B.prototype = Object.create(A.prototype, {
  varB : {
    value: null, 
    enumerable: true, 
    configurable: true, 
    writable: true 
  },
  doSomething : { 
    value: function(){ // override
      A.prototype.doSomething.apply(this, arguments); 
      // call super
      // ...
    },
    enumerable: true,
    configurable: true, 
    writable: true
  }
});
B.prototype.constructor = B;

var b = new B();
b.doSomething();
最重要的部分是：
类型被定义在 .prototype 中
用 Object.create() 来继承
4.6prototype和Object.getPrototypeOf 
·	对于从 Java 或 C++ 转过来的开发人员来说 JavaScript 会有点让人困惑，因为它全部都是动态的，都是运行时，而且不存在类（classes）。所有的都是实例（对象）。即使我们模拟出的 “类（classes）”，也只是一个函数对象。
·	你可能已经注意到我们的 function A 有一个叫做 prototype 的特殊属性。该特殊属性可与 JavaScript 的 new 操作符一起使用。对原型对象的引用被复制到新实例的内部 [[Prototype]] 属性。例如，当执行var a1 = new A()时，JavaScript（在内存中创建对象之后，和在运行函数 A() 把 this 指向对象之前）设置a1.[[Prototype]] = A.prototype。然后当您访问实例的属性时，JavaScript首先会检查它们是否直接存在于该对象上，如果不存在，则会[[Prototype]]中查找。这意味着你在prototype中定义的所有内容都可以由所有实例有效共享，你甚至可以稍后更改部分prototype，并在所有现有实例中显示更改（如果需要）。
·	像上面的例子中，如果你执行var a1 = new A(); var a2 = new A(); 那么 a1.doSomething事实上会指向Object.getPrototypeOf(a1).doSomething，它就是你在 A.prototype.doSomething 中定义的内容。也就是说：Object.getPrototypeOf(a1).doSomething == Object.getPrototypeOf(a2).doSomething == A.prototype.doSomething。【补充：实际上当执行a1.doSomething()相当于执行Object.getPrototypeOf(a1).doSomething.call(a1)==A.prototype.doSomething.call(a1)】
·	简而言之， prototype是用于类的，而 Object.getPrototypeOf() 是用于实例的（instances），两者功能一致。
·	[[Prototype]] 看起来就像递归引用， 如a1.doSomething，Object.getPrototypeOf(a1).doSomething，Object.getPrototypeOf(Object.getPrototypeOf(a1)).doSomething 等等等， 直到它被找到或Object.getPrototypeOf返回 null。
·	因此，当你执行：
var o = new Foo();
JavaScript 实际上执行的是：
var o = new Object();
o.__proto__ = Foo.prototype;
Foo.call(o);
（或者类似上面这样的），然后当你执行：
o.someProp;
它检查o是否具有someProp属性。如果没有，它会查找 Object.getPrototypeOf(o).someProp，如果仍旧没有，它会继续查找 Object.getPrototypeOf(Object.getPrototypeOf(o)).someProp。
4.7 结论
·	在编写使用它的复杂代码之前，理解原型继承模型是至关重要的。此外，请注意代码中原型链的长度，并在必要时将其分解，以避免可能的性能问题。此外，原生原型不应该被扩展，除非它是为了与新的JavaScript特性兼容。
5.js约定
·	复杂逻辑需要用回调处理业务或需要对数剧监听及处理用构造函数定义比如双向数据绑定，调用new 一个实例即可，其他功能处理数据变换数据直接定义方法，将结果返回即可。
·	对于参数设定，三个参数之内考虑三个参数或对象传参处理，方法或原型内部做过滤处理。大于三个参数或配置项采取对象传参，方法或原型内部做过滤处理。
·	对于过滤数据能用表达式的尽量用表达式解决，例如*？*：* （条件表达式），*||*（或表达式），*&&*（与表达式）。
·	对于数据请求全局定义一个方法，将请求结果返回，调用时用一个变量接收结果即可，方便做全局错误，超时，load处理，若用jquery,尽量采取post请求。
function queryAjax (queryUrl, queryParams, beforeSendCallback, completeCallback, isfjroolUrl) { /*Ajax请求*/
        /*
         * queryUrl：请求地址；
         * queryParams：请求Data
         * beforeSendCallback：发送请求前要执行的回调函数
         * completeCallback：请求完成后要执行的回调函数
         * isfjroolUrl：是否带根路径
         * */
        var me = this;
        var requesthead = {
            url: isfjroolUrl == false ? queryUrl :跟路径) + queryUrl,
            async: false,
            dataType: "json",
            type: "post",
            beforeSend: function() {
                if (beforeSendCallback) beforeSendCallback();
            },
            complete: function(XHR) {
                if (completeCallback) completeCallback();
                //sesionTimeOutHandle(XHR); //系统超时全局处理
            },
            success: function(res) {
                console.log(res);
            },
            error: function(err) {
                console.log(err)
                //错误全局处理
            },
        };
        if (queryParams) requesthead.data = queryParams;
        var jsonData = $.ajax(requesthead).responseJSON;
        if (!jsonData || jsonData.length == 0)
            return;
        return jsonData;
}
//以上代码需要引入jQuery，2.2版本以上
·	需要全局定义多个参数，采取全局定义一个对象，对象内部定义属性方式，避免变量污染。
·	数据缓存，数据可采用浏览器缓存或js变量缓存，大量数据若初始化只请求一次可采用js变量值进行缓存
·	拼接字符串，对于一成不变的字符串可放置在script模版或隐藏标签中，调用直接提取即可，这里说明一点，html文档中所有标签皆可被选择及操作，包括script标签。Js拼接字符串两种方式：对于少量字符串拼接可采取+号方式，对于大量字符串拼接，皆采取数组方式，将每一个字符串push进去，最终执行字符串数组.Join(“”)。



    
待持续完善！ A
