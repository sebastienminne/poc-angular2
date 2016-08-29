import { NgModule }       from '@angular/core';
import { BrowserModule  } from '@angular/platform-browser';
import { AppComponent }   from './app.component';
import {Component2Component} from "./component2/component2.component";

@NgModule({
    declarations: [AppComponent, Component2Component],
    imports:      [BrowserModule],
    bootstrap:    [AppComponent],
})
export class AppModule {}
