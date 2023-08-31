import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewwsComponent } from './newws.component';

describe('NewwsComponent', () => {
  let component: NewwsComponent;
  let fixture: ComponentFixture<NewwsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [NewwsComponent]
    });
    fixture = TestBed.createComponent(NewwsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
