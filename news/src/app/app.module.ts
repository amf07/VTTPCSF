import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StoreesComponent } from './storees/storees.component';
import { ImageComponent } from './image/image.component';
import { NewwsComponent } from './newws/newws.component';

@NgModule({
  declarations: [
    AppComponent,
    StoreesComponent,
    ImageComponent,
    NewwsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
