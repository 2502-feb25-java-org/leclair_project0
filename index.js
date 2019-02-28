//Use this to write comments in JavaScript 
/*Or you can use this syntax for block comments
...
...
*/


/*data types:
number, string, boolean, object, undefined, NaN (not a number)
*/

//Variables
/*function func1(){
    return this.x;
}

var y = func1();
alert(y);*/

//Global Variables
/*var x;
alert(typeof(x));
x=10;
alert(typeof(x));*/

//truthy and falsy
/*fixed falsy values:
    false,
    0,
    undefined, 
    NaN,
    null,
    "" (empty string)
*/

/*alert(0==false);
//== checks values of the two being compared
//=== check values of the two AND their types
alert(NaN==NaN); //return false, special case
alert(""== null); //returns false
alert(0 == ""); //returns true*/

//Scope- two types: Global, Local

//test(10); //Hoisting- function call is made even before declaration

/*(function test(a)
{
    return(a);
})();*/ /*IIFE- Immediately Invoked Function Expression- 
JavaScript function that runs as soonn as it is defined*/
/*
var funcResult = function test(a)
{
    console.log(a);
}//function expressions
funcResult(10);

console.log(typeof(funcResult));

(function test(a)
{
    console.log(a);
})(10); //IIFE */

//Call back function- a function that is to be executed after another function has finished executing

/*function Agreement(policyAcceptance, yes, no)
{
    debugger;
    if(confirm(policyAcceptance))
        yes();
    else
        No();
}

function ShowOk()
{
    alert('Policy is accepted');
}

Agreement("Do you agree to our policy?", ShowOk, ShowCancel);*/

//function with default parameters
/*var resultfunc = function add(a, b, c=10) //C = 10 is the default value *see console.log line*
{
    return a + b + c;
}
console.log(resultfunc(10, 3)); //Accepts default vaule and prints 23*/


//Closure: A closure is a function having access to the parent scope, even after the parent function has closed.
/*
function Outer()
{
    var outerData = "outerData";
    function inner()
        alert(outerData);
    return inner;
}
//alert(outerData); //no accessible because of scope
var funcCall = Outer();
funcCall();*/

/*var add=(function(){
    var counter = 0;
    return function(){
        counter+=1;
    return counter;
    }
})();
console.log(add());
console.log(add());*/

/*()=>alert('hi')); //() is a function that is not defined
var resultExp= (a,b)=>(a*b);
console.log(resultExp(2,3));
console.log(((a,b)=>a*b)(5,3)); //arrow function

function test(){
    alert("HI");
}
test();*/


/*function returnValue(){
    return 'Hello World';
}

var functionItself=returnValue;
alert(functionItself); //return the entire function*/

//---------------------------------------------------------------------

/*(function varvslet(){
    //var function scope
    //let block scope
    console.log('Before Delcaration: '+ i);
    for (let i = 0; i < 5; i++) {
        console.log('After Initialization: '+ i);
    }
    console.log('Outside the for loop: '+ i); //var would allo 'i' to be accessed outside the foor loop
})();*/

//---------------------------------------------------------------------
//Arrays
 /*   'use strict'

    let x=[]; //empty array
    x= [1, 2, 3, 4, "Matt", null, false];
    for (let i = 0; i < x.length; i++) {
        console.log(x[i]);
    }

    x.forEach(function(e){
        console.log(e);
    });*/

//--------------------------------------------------------------------- 
//Type Coersion/Conversion
/*var i = 10, j = 'Hello';
j = Boolean(NaN);
console.log(j);*/

//---------------------------------------------------------------------
//Objects
var obj = {}; //Curly braces signify an object
obj = {
    name: 'Matt LeClair', 
    Profession: 'Full Stack Enginner',
}
obj.height= 175
obj.eyecolor= "Brown"
obj['Company'] = 'Revature'
obj['height'] = 175
//console.log(obj.name+ " " + obj['height']+ " " +obj['Company']);

/*var obj2={
    course: 'Java',
    duration: '10 Weeks',
    sayDetails2 : obj.sayDetails
}
console.log(obj2.sayDetails2());*/

//Constructor in ES5
/*function Person(name,  city){
    this.name= name;
    //this.profession = profession;
    this.city = city;
    this.sayDetails = function(){
        console.log(name +'-' +city);
    }
}

let objMatt = new Person('Matt', 'NYC');
objMatt.sayDetails();

function Student(name, age, city, school){
    this.school = school;
    this.age = age;
    this._proto_ = new Person(name, city);
}

let objStudent = new Student('Tom', 30, 'Boston', 'SJU');
objStudent.sayDetails();*/

class PersonClass{
    constructor(name,age,city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    sayDetails(){
        console.log(this.name +'-' +this.city);
    }
}//ends PersonClass

//inheritance: Parent to Child
class StudentClass extends PersonClass{
    constructor(name, age, city, fingers){
        super(name, age, city);
        this.fingers = fingers;
    }
}

let student = new StudentClass('Stephen', 89, 'Bazinga', 12);
student.sayDetails();