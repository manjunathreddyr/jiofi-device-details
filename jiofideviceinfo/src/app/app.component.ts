import { Component } from '@angular/core';
import { ChargeInfo } from './model/ChargeInfo';
import { WebsocketService } from './websocket.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 
  title = 'jiofideviceinfo';
  websocketService:any;
  speechSynthesis: any;
  voices: SpeechSynthesisVoice[]=[];

  ngOnInit(){
    this.websocketService  = new WebsocketService(new AppComponent());
    this.websocketService.getChargeinfo();
  }
   handleMessage(chargeInfo:any) {
     const chargeInfoObj:ChargeInfo = JSON.parse(chargeInfo);


    const batterStatus = chargeInfoObj.chargeStatus>>> 8;

    const chargePercentage = chargeInfoObj.chargePercentage;

    console.log(`Battery Percentage ${chargeInfoObj.chargePercentage}%`);
    if(chargeInfoObj.chargePercentage>0){
      if(batterStatus < 4) {
            console.log("Battery Status "+"Discharging");
            this.informBatterDetails(chargePercentage,"Discharging");
			} else if(batterStatus == 4) {
             console.log("Battery Status "+"Charging");
             this.informBatterDetails(chargePercentage,"Charging");
			} else if (batterStatus == 5) {
            console.log("Battery Status "+"Full Charged");
            this.informBatterDetails(chargePercentage,"Full Charged");
			}
    }
  }


  informBatterDetails(chargePercentage:number,chargeStatus:string){
    if('speechSynthesis' in window) {
      console.log('speechSynthesis in window');

      this.speechSynthesis = window.speechSynthesis;
      this.voices = this.speechSynthesis.getVoices();
      this.speak(chargePercentage,chargeStatus);
    }
  }

  public speak(chargePercentage:number,chargeStatus:string): void {
    const message = `Your Jiofi device has ${chargePercentage} percentage charge and Battery status is ${chargeStatus}`;
    let utterance = new SpeechSynthesisUtterance(message);
    utterance.voice = this.voices.filter(voice => voice.lang === 'en')[0];
    utterance.pitch = 1;
    utterance.rate = 0.75;
    utterance.volume = 1;

    this.speechSynthesis.speak(utterance);
  }
}
