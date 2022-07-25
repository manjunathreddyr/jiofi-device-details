import { Injectable } from '@angular/core';
import * as Stomp from 'stompjs';
import * as SockJS from 'sockjs-client';
import { AppComponent } from './app.component';
import { ChargeInfo } from './model/ChargeInfo';

@Injectable({
  providedIn: 'root'
})
export class WebsocketService {

  private serverUrl = 'http://localhost:8080/ws'
  private stompClient:any;
  appComponent: AppComponent;

  constructor(appComponent: AppComponent){
        this.appComponent = appComponent;
    }

   getChargeinfo(){
    let ws = new SockJS(this.serverUrl);
    this.stompClient = Stomp.over(ws);
    let that = this;
    this.stompClient.connect({}, function(frame:any) {
      that.stompClient.subscribe("/chargeInfo", (message:any) => {
        if(message.body) {
          that.appComponent.handleMessage(message.body);
        }
      });
    });
   }
}
