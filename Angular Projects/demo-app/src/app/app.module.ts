import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent          // all component details we have to provide this section. 
  ],
  imports: [
    BrowserModule,FormsModule       // import pre-defined or user-defined module 
  ],
  providers: [],
  bootstrap: [AppComponent]   // we have to provide parent component to bootstap 
})
export class AppModule { }
