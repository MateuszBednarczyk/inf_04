import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'zadanie';
  form: FormGroup = new FormGroup({
    tytul: new FormControl(),
    rodzaj: new FormControl()
  })

  dodaj() : void {
    console.log(this.form.value)
  }
}
