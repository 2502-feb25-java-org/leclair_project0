import paddle from 'C:/MattGithub/leclair_project0/paddle';

let canvas = document.getElementById("game"); //gets canvas-"game" screen
let context = canvas.getContext('2d'); //gets context of the canvas

const GAME_WIDTH = 800;
const GAME_HEIGHT = 600;

context.clearRect(0,0,800,600);

let paddle = new paddle(GAME_WIDTH, GAME_HEIGHT);

paddle.draw();
