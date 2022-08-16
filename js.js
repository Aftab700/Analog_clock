
const hh=document.getElementById('hh');
const mm=document.getElementById('mm');
const ss=document.getElementById('ss');

setInterval(() => {
    const d= new Date();
const h= d.getHours();
const m= d.getMinutes();
const s= d.getSeconds();
    hrotation = 30*h + m/2;
    mrotation = 6*m ;
    srotation = 6*s;
    hh.style.transform = `rotate(${hrotation}deg)`;
    mm.style.transform = `rotate(${mrotation}deg)`;
    ss.style.transform = `rotate(${srotation}deg)`;
    // console.log('hello');
}, 1000);