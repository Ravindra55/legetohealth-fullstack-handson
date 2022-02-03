import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ModelDrivenFormEx1Component } from './model-driven-form-ex1.component';

describe('ModelDrivenFormEx1Component', () => {
  let component: ModelDrivenFormEx1Component;
  let fixture: ComponentFixture<ModelDrivenFormEx1Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ModelDrivenFormEx1Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ModelDrivenFormEx1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
