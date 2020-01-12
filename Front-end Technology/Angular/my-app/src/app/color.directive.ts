import { Directive, ElementRef, Renderer2, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {

  @HostBinding('style.background') backgroundColor: string;
  constructor(private el: ElementRef, private renderer: Renderer2) {
    // this.el.nativeElement.style.background='red';
    // this.el.nativeElement.style.fontSize='30px';
  //  let h1= this.renderer.createElement('h1');
  //  let text = this.renderer.createText('hello from custom directive');
  //  this.renderer.appendChild(h1, text);
  //  this.renderer.appendChild(this.el.nativeElement, h1);
   }
   @HostListener('mouseenter')
   x(){
     this.backgroundColor='#ccc';
     this.el.nativeElement.style.color='red';
   }
   @HostListener('mouseleave')
   y(){
     this.backgroundColor='lightblue';
     this.el.nativeElement.style.color='black';
   }

}
