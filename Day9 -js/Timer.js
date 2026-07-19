// const timer = setTimeout(()=>{
//     console.log("Hello");
// },2000);

// clearTimeout(timer);

// const timer2 = setInterval(()=>{
//     console.log("Hello")
// },2000);

// clearInterval(timer2)

function repeat() {
    console.log("Running...");
    setTimeout(repeat, 1000);
}

repeat();