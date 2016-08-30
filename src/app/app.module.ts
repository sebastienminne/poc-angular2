import { NgModule }       from '@angular/core';
import { BrowserModule  } from '@angular/platform-browser';
import { AppComponent }   from './app.component';
import {Component2Component} from "./component2/component2.component";
import {PasswordModule} from 'primeng/primeng';

@NgModule({
    declarations: [AppComponent, Component2Component],
    imports:      [BrowserModule, PasswordModule],
    bootstrap:    [AppComponent],
})
export class AppModule {}
