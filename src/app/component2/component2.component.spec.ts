/* tslint:disable:no-unused-variable */

import { By }           from '@angular/platform-browser';
import { DebugElement } from '@angular/core';
import { addProviders, async, inject } from '@angular/core/testing';
import { Component2Component } from './component2.component';

describe('Component: Component2', () => {
  it('should create an instance', () => {
    let component = new Component2Component();
    expect(component).toBeTruthy();
  });
});
