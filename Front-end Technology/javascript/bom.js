let latitude;
let longitude;

navigator.geolocation.getCurrentPosition((position)=>{
    console.log('latitude ', position.coords.latitude);
    latitude = position.coords.latitude;
    console.log('longitude ', position.coords.longitude);
    longitude= position.coords.longitude;
});


document.getElementById('heading').style.background='red';

let heading=document.getElementById('heading');
heading.style.background='red';

function acceptProposal(){
    document.getElementById('proposal').src = 'https://image.freepik.com/free-vector/happy-new-year-2019-background_23-2147976966.jpg';

}
function rejectProposal(){
    document.getElementById('proposal').src='https://i.pinimg.com/originals/e6/38/d4/e638d449691f38dba1ce8a5aa3380be9.png';
}