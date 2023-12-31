import { Component } from '@angular/core';
import { FormControl, FormControlName, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  title = 'zadanie2';
  arr = [
    'kurs1',
    'kurs2',
    'kurs3'
  ]

  formularz: FormGroup = new FormGroup({
    imieinazwisko: new FormControl(),
    nrkursu: new FormControl()
  });

  zapisz(): void {
    console.log(this.formularz.value.imieinazwisko)
    if (this.arr.at(this.formularz.value.nrkursu - 1) != null && this.formularz.value.nrkursu > 0) {
      console.log(this.arr.at(this.formularz.value.nrkursu - 1))
    } else { 
      console.log("Nieprawidłowy numer kursu")
    }
  }
}
