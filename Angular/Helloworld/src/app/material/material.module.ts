import { NgModule } from '@angular/core';
import { MatAutocomplete } from '@angular/material/autocomplete';
import { MatFormFieldModule } from '@angular/material/form-field';


const MaterialComponents = [
  MatAutocomplete,
  MatFormFieldModule
]


@NgModule({
  imports: [MaterialComponents],
  exports: [MaterialComponents]
})
export class MaterialModule { }
