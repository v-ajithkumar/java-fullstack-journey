const promise = new Promise((resovle,reject)=>{
    resovle("Hello")
});

promise.then((message)=>{
    console.log(message);
})

const promise2 = new Promise((resovle)=>{
    setTimeout(()=>{
        resovle("Download complete")
    },2000)
});

promise2.then((result)=>{
    console.log(result);
})

promise2.finally(()=>{
    console.log("finally executed")
})

const promise3 = new Promise((resovle, reject)=>{
    reject("Network Error");
});

promise3
.then((resovle)=>{
    console.log(resovle);
    
})
.catch((errorMsg)=>{
    console.log(errorMsg);  
});


