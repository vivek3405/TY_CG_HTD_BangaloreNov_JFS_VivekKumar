

// console.log(date.getDate()) ;

// console.log(date.getMonth());
// console.log(date.getMinutes());
// console.log(date.getHours());
// console.log(date.getMilliseconds());
setInterval(() => {
    var date = new Date();
    document.getElementById('todayDate').innerHTML =`
    Date ::: ${date.getDate()}-${date.getMonth()+1}-${date.getFullYear()} :::
    time ::: ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`
}, 1000);
