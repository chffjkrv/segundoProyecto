import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarcontactosComponent } from './listarcontactos.component';

describe('ListarcontactosComponent', () => {
  let component: ListarcontactosComponent;
  let fixture: ComponentFixture<ListarcontactosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarcontactosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarcontactosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
