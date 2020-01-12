import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  selectedBike;

  bikes=[
    {
      name: 'BMW',
      imgURL: 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      deatails: `Lorem ipsum, dolor sit amet consectetur adipisicing elit. Labore nobis dignissimos voluptas! 
      Adipisci excepturi ipsum hic repellendus amet aut facere. Veritatis ea expedita voluptatibus 
      earum suscipit, quia exercitationem nesciunt fuga? Quos aspernatur qui culpa provident consectetur ea illo doloremque 
      odio laborum voluptate eveniet mollitia neque officia repudiandae, ipsam quas labore?`
    },{
      name: 'royal',
      imgURL: 'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
      details: `Lorem ipsum, dolor sit amet consectetur adipisicing elit. Labore nobis dignissimos voluptas! 
      Adipisci excepturi ipsum hic repellendus amet aut facere. Veritatis ea expedita voluptatibus 
      earum suscipit, quia exercitationem nesciunt fuga? Quos aspernatur qui culpa provident consectetur ea illo doloremque 
      odio laborum voluptate eveniet mollitia neque officia repudiandae, ipsam quas labore?`
    },{
      name: 'tvs',
      imgURL: 'https://cdn.pixabay.com/photo/2017/12/29/05/58/sport-3046819__340.jpg',
      details: `Lorem ipsum, dolor sit amet consectetur adipisicing elit. Labore nobis dignissimos voluptas!
      Adipisci excepturi ipsum hic repellendus amet aut facere. Veritatis ea expedita voluptatibus 
      earum suscipit, quia exercitationem nesciunt fuga? Quos aspernatur qui culpa provident consectetur ea illo doloremque 
      odio laborum voluptate eveniet mollitia neque officia repudiandae, ipsam quas labore?`
    }
  ]
  constructor() { }

  selectBike(bike){
    this.selectedBike = bike;
  }
  ngOnInit() {
  }

}
