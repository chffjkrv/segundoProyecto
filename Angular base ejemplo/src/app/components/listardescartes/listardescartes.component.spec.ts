import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListardescartesComponent } from './listardescartes.component';

describe('ListardescartesComponent', () => {
  let component: ListardescartesComponent;
  let fixture: ComponentFixture<ListardescartesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListardescartesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListardescartesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
