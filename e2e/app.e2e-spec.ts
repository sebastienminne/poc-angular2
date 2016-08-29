import { PocNg2Page } from './app.po';

describe('poc-ng2 App', function() {
  let page: PocNg2Page;

  beforeEach(() => {
    page = new PocNg2Page();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
