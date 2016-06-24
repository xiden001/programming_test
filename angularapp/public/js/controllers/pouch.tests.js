describe('PouchHelper', function() {
  

  beforeEach(module('ExampleApp'));

  it('should resolve a promise', inject(function(pouchService){

    expect(pouchService.saveNew()).toBe(true);


  }));

});