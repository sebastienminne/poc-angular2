# PocNg2

This project was generated with [angular-cli](https://github.com/angular/angular-cli) version 1.0.0-beta.10.

## Development server
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive/pipe/service/route/class`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `-prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/). 
Before running the tests make sure you are serving the app via `ng serve`.

## Deploying to Github Pages

Run `ng github-pages:deploy` to deploy to Github Pages.

## Further help

To get more help on the `angular-cli` use `ng --help` or go check out the [Angular-CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

## adding [primeng](http://www.primefaces.org/primeng/#/setup) to the project : 

npm install primeng --save
npm install primeui --save
npm install --save font-awesome

add style in index.html

```html
 <link rel="stylesheet" type="text/css" href="vendor/primeui/themes/omega/theme.css" />
  <link rel="stylesheet" type="text/css" href="nodes_modules/font-awesome.min.css" />
  <link rel="stylesheet" type="text/css" href="vendor/primeui/primeui-ng-all.min.css" />
```


I had to do this manipulation :
 
 
need to add primeng and primeui to angular-cli-build.js
 
```javascript
module.exports = function(defaults) {
 return new Angular2App(defaults, {
   vendorNpmFiles: [
     'systemjs/dist/system-polyfills.js',
     'systemjs/dist/system.src.js',
     'zone.js/dist/**/*.+(js|js.map)',
     'es6-shim/es6-shim.js',
     'reflect-metadata/**/*.+(ts|js|js.map)',
     'rxjs/**/*.+(js|js.map)',
     '@angular/**/*.+(js|js.map)',
     'primeng/**/*.js',
     'primeui/**/*.css'
   ]
 });
};
```
 
and change system-config.ts to use vendor and not nodes_modules

```javascript
/** Map relative paths to URLs. */
const map: any = {
    'primeng':                    'vendor/primeng'
};

/** User packages configuration. */
const packages: any = {
    'primeng':                    { defaultExtension: 'js'  }
};


```

